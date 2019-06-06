/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package representations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 *
 * @author salete
 */
public class UtilizadorRepresentation {
    private String email;
    private String password;
    private String nome;
    private String fotografia;
    private String concelho;
    private String telemovel;
    private String descricao;
    private List<AnimalRepresentation> animaisAdotar;
       
    @JsonCreator
    public UtilizadorRepresentation(@JsonProperty("email") String e, @JsonProperty("password") String p, @JsonProperty("nome") String n, @JsonProperty("fotografia") String f, 
            @JsonProperty("concelho") String c, @JsonProperty("telemovel") String t, @JsonProperty("descricao") String d, 
            @JsonProperty("animaisAdotar") List<AnimalRepresentation> aa) {
        
        this.email = e;
        this.password = p;
        this.nome = n;
        this.fotografia = f;
        this.descricao = d;
        this.concelho = c;
        this.telemovel = t;
        this.animaisAdotar = aa;
    }
}
