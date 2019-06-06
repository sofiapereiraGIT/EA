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
public class PedidoRepresentation {
    private int ID;
    private UtilizadorComunRepresentation utilizadorComum;
    private AnimalRepresentation animal;
    //private java.util.Date data;
    private char estado;
    //private java.util.Date dataUltimoContacto;
    @JsonCreator
    public PedidoRepresentation(@JsonProperty("id") int id, @JsonProperty("utilizadorComun") UtilizadorComunRepresentation uc, @JsonProperty("animal") AnimalRepresentation a, 
            @JsonProperty("estado") char e) {
        
        this.ID = id;
        this.utilizadorComum = uc;
        this.animal = a;
        this.estado = e;
    }
}
