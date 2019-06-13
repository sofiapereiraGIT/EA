/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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

/**
 *
 * @author davidsousa
 */
@Stateless
public class PedidoBean implements PedidoBeanLocal {
    
    @Override
    public void adotarAnimal(PersistentSession sessao, Animal anim, Utilizador user) {
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();
        DateFormat f = DateFormat.getDateInstance();
        
       // SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd").format(c.data);
        
        Pedido p;
        //p.setAnimal(anim);
       // p.setData(sdf);
        p.setDataUltimoContacto(null);
           
     
        
    }
    
}
