/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package representations;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Date;

/**
 *
 * @author salete
 */
public class PedidoRepresentation {
    private int ID;
    private UtilizadorComunRepresentation utilizadorComum;
    private AnimalRepresentation animal;
    private Date data;
    private char estado;
    private Date dataUltimoContacto;
    private char discriminator;
        
    @JsonCreator
    public PedidoRepresentation(@JsonProperty("id") int id, @JsonProperty("utilizadorComun") UtilizadorComunRepresentation uc, 
            @JsonProperty("animal") AnimalRepresentation a, @JsonProperty("estado") char e, @JsonProperty("discriminator") char d,
            @JsonProperty("data") Date da, @JsonProperty("dataUltimoContacto") Date dc) {
        
        this.ID = id;
        this.utilizadorComum = uc;
        this.animal = a;
        this.estado = e;
        this.discriminator = d;
        this.data = da;
        this.dataUltimoContacto = dc;
    }
}
