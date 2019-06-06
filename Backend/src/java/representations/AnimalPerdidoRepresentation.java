/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package representations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author salete
 */
public class AnimalPerdidoRepresentation extends AnimalRepresentation{
    private int ID;
    private String concelho;
    
    @JsonCreator
    public AnimalPerdidoRepresentation(@JsonProperty("idAnimal") int ida, @JsonProperty("nome") String n, @JsonProperty("fotografia") String f, @JsonProperty("sexo") char s, 
            @JsonProperty("idade") char i, @JsonProperty("raça") String r, @JsonProperty("porte") char p, @JsonProperty("corPelo") String cp, 
            @JsonProperty("compPelo") char cm, @JsonProperty("estado") char e, @JsonProperty("descricao") String d, @JsonProperty("id") int id, @JsonProperty("concelho") String c) {
        
        super(ida, n, f, s, i, r, p, cp, cm, e, d);
        this.ID = id;
        this.concelho = c;
    }
}
