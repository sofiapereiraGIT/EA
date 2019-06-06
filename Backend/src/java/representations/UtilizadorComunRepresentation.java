/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package representations;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import javax.json.Json;

/**
 *
 * @author salete
 */
public class UtilizadorComunRepresentation extends UtilizadorRepresentation{
    private List<AnimalRepresentation> animaisPerdidos;   
    
    @JsonCreator
    public UtilizadorComunRepresentation(@JsonProperty("email") String e, @JsonProperty("password") String p, @JsonProperty("nome") String n, @JsonProperty("fotografia") String f, 
            @JsonProperty("concelho") String c, @JsonProperty("telemovel") String t, @JsonProperty("descricao") String d, 
            @JsonProperty("animaisAdotar") List<AnimalRepresentation> aa, @JsonProperty("pedidosAdocao") List<AnimalRepresentation> ap) {
        
        super(e, p, n, f, d, c, t, aa);
        this.animaisPerdidos = ap;
    }
}
