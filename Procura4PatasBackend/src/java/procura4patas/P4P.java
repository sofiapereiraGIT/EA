/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procura4patas;

import beans.UtilizadorBeanLocal;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.orm.PersistentSession;

/**
 *
 * @author davidsousa
 */
public class P4P {

   static UtilizadorBeanLocal utilizadorBean = lookupUtilizadorBeanLocal();

   
    public static List<Animal> getCaoAdocaoUser(PersistentSession sessao,Utilizador user) {
         return utilizadorBean.getCaoAdocaoUser(sessao, user);
    }
    
    private static UtilizadorBeanLocal lookupUtilizadorBeanLocal() {
        try {
            Context c = new InitialContext();
            return (UtilizadorBeanLocal) c.lookup("java:global/Procura4PatasBackend/UtilizadorBean!beans.UtilizadorBeanLocal");
        } catch (NamingException ne) {
            ne.printStackTrace();
            throw new RuntimeException(ne);
        }
    }
    
    
}
