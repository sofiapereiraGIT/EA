/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import procura4patas.Animal;
import procura4patas.AnimalDAO;
import procura4patas.Pedido;
import procura4patas.PedidoDAO;
import procura4patas.Utilizador;
import procura4patas.UtilizadorComum;

/**
 *
 * @author davidsousa
 */
@Stateless
public class PedidoBean implements PedidoBeanLocal {
    
    @Override
    public boolean adotarAnimal(PersistentSession sessao, Animal anim, Utilizador user) {
        
       Date dNow = new Date();
       SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
       boolean ok = true;
      
       Pedido p = new Pedido();
       p.setAnimal(anim);
       p.setData(dNow);
       p.setDataUltimoContacto(null);
       p.setDiscriminator('p');
       p.setEstado('c');
       p.setUtilizadorComum((UtilizadorComum) user);
        
        try {
            ok = PedidoDAO.save(p);
        } catch (PersistentException ex) {
            Logger.getLogger(PedidoBean.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return ok;
       
       
       
    }
    
    @Override
    public boolean serFatAnimal(PersistentSession sessao, Animal anim, Utilizador user) {
        
       Date dNow = new Date();
       SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
       boolean ok  = true;
      
       Pedido p = new Pedido();
       p.setAnimal(anim);
       p.setData(dNow);
       p.setDataUltimoContacto(null);
       p.setDiscriminator('f');
       p.setEstado('c');
       p.setUtilizadorComum((UtilizadorComum) user);
       
       try {
            ok = PedidoDAO.save(p);
        } catch (PersistentException ex) {
            Logger.getLogger(PedidoBean.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return ok;
       
    }
    
}
