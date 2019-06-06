/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package representations;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

/**
 *
 * @author salete
 */
public class CanilRepresentation extends UtilizadorRepresentation{
    private String morada;
    private String horario;
    private String siteOficial;
    private String facebook;
    private String instagram;
    private List<AnimalRepresentation> listaPedidosAd;
    private List<AnimalRepresentation> listaPedidosFAT;
       
    @JsonCreator
    public CanilRepresentation(@JsonProperty("email") String e, @JsonProperty("password") String p, @JsonProperty("nome") String n, @JsonProperty("fotografia") String f, 
            @JsonProperty("concelho") String c, @JsonProperty("morada") String m, @JsonProperty("telemovel") String t, @JsonProperty("descricao") String d, 
            @JsonProperty("horario") String h, @JsonProperty("siteOficial") String s, @JsonProperty("facebook") String fa, @JsonProperty("instagram") String i,
            @JsonProperty("animaisAdotar") List<AnimalRepresentation> aa, @JsonProperty("pedidosAdocao") List<AnimalRepresentation> pa, 
            @JsonProperty("pedidosFAT") List<AnimalRepresentation> fat) {
        
        super(e, p, n, f, d, c, t, aa);
        this.morada = m;
        this.horario = h;
        this.siteOficial = s;
        this.facebook = fa;
        this.instagram = i;
        this.listaPedidosAd = pa;
        this.listaPedidosFAT = fat;
    }
    
}
