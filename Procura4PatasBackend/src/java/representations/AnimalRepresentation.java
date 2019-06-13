/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package representations;
import com.fasterxml.jackson.annotation.*;

/**
 *
 * @author salete
 */
public class AnimalRepresentation {
    private int ID;
    private String nome;
    private String fotografia;
    private char sexo;
    private char idade;
    private String raça;
    private char porte;
    private String corPelo;
    private char compPelo;
    private char estado;
    private String descricao;
    private String concelho;
    private char discriminator;
       
    @JsonCreator
    public AnimalRepresentation(@JsonProperty("id") int id, @JsonProperty("nome") String n, @JsonProperty("fotografia") String f, @JsonProperty("sexo") char s, 
            @JsonProperty("idade") char i, @JsonProperty("raça") String r, @JsonProperty("porte") char p, @JsonProperty("corPelo") String cp, 
            @JsonProperty("compPelo") char cm, @JsonProperty("estado") char e, @JsonProperty("descricao") String d, @JsonProperty("descricao") String c, 
            @JsonProperty("estado") char di) {
        
        this.ID = id;
        this.nome = n;
        this.fotografia = f;
        this.sexo = s;
        this.idade = i;
        this.raça = r;
        this.porte = p;
        this.corPelo = cp;
        this.compPelo = cm;
        this.estado = e;
        this.descricao = d;
        this.concelho = c;
        this.discriminator = di;
    }
}