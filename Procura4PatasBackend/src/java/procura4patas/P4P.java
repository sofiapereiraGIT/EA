/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procura4patas;

import beans.CanilBeanLocal;
import beans.UtilizadorBeanLocal;
import beans.UtilizadorComumBeanLocal;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.orm.PersistentException;
import org.orm.PersistentSession;

/**
 *
 * @author davidsousa
 */
public class P4P {
    static UtilizadorBeanLocal utilizadorBean = lookupUtilizadorBeanLocal();
    static UtilizadorComumBeanLocal utilizadorComumBean = lookupUtilizadorComumBeanLocal();
    static CanilBeanLocal canilBean = lookupCanilBeanLocal();
    
    
    public static Utilizador login(PersistentSession session, String email, String password) throws PersistentException {
        return utilizadorBean.login(session, email, password);
    }
    
   
    public static List<Animal> getCaoAdocaoUser(PersistentSession sessao, Utilizador user) {
         return utilizadorBean.getCaoAdocaoUser(sessao, user);
    }
    
     public List<Animal> getGatoAdocaoUser(PersistentSession sessao, Utilizador user) {
        return utilizadorBean.getGatoAdocaoUser(sessao, user);
    }
     
     public List<Animal> getTodosCaes(PersistentSession sessao, Utilizador user) {
         return utilizadorBean.getTodosCaes(sessao, user);
     }
     
     public List<Animal> getTodosGatos(PersistentSession sessao, Utilizador user) {
         return utilizadorBean.getTodosGatos(sessao, user);
     }
     
     public List<Animal> getPedidosUser(PersistentSession sessao, Utilizador user) {
         return utilizadorBean.getPedidosUser(sessao, user);
     }
    
    public static UtilizadorComum getUtilizadorComum(PersistentSession sessao, String email){
        return utilizadorComumBean.getUtilizadorComum(sessao, email);
    }

    public static boolean addUtilizadorComum(PersistentSession sessao, String email, String pass, String nome, String foto, String concelho, String tlm, String descricao){
        return utilizadorComumBean.addUtilizadorComum(sessao, email, pass, nome, foto, concelho, tlm, descricao);
    }

    public static boolean updateUtilizadorComum(PersistentSession sessao, String email, String pass, String nome, String foto, String concelho, String tlm, String descricao){
        return utilizadorComumBean.updateUtilizadorComum(sessao, email, pass, nome, foto, concelho, tlm, descricao);
    }
    
    public static Canil getCanil(PersistentSession sessao, String email){
        return canilBean.getCanil(sessao, email);
    }

    public static boolean addCanil(PersistentSession sessao, String email, String pass, String nome, String foto, String concelho, String tlm, String descricao, 
            String morada, String horario, String site, String face, String insta){
        
        return canilBean.addCanil(sessao, email, pass, nome, foto, concelho, tlm, descricao, morada, horario, site, face, insta);
    }

    public static boolean updateCanil(PersistentSession sessao, String email, String pass, String nome, String foto, String concelho, String tlm, String descricao, 
            String morada, String horario, String site, String face, String insta){
        
        return canilBean.updateCanil(sessao, email, pass, nome, foto, concelho, tlm, descricao, morada, horario, site, face, insta);
    }
    
    /* Lookups para os beans */
    private static UtilizadorBeanLocal lookupUtilizadorBeanLocal() {
        try {
            Context c = new InitialContext();
            return (UtilizadorBeanLocal) c.lookup("java:global/Procura4PatasBackend/UtilizadorBean!beans.UtilizadorBeanLocal");
        } catch (NamingException ne) {
            ne.printStackTrace();
            throw new RuntimeException(ne);
        }
    }

    private static UtilizadorComumBeanLocal lookupUtilizadorComumBeanLocal() {
        try {
            Context c = new InitialContext();
            return (UtilizadorComumBeanLocal) c.lookup("java:global/Procura4PatasBackend/UtilizadorComumBean!beans.UtilizadorComumBeanLocal");
        } catch (NamingException ne) {
            ne.printStackTrace();
            throw new RuntimeException(ne);
        }
    }

    private static CanilBeanLocal lookupCanilBeanLocal() {
        try {
            Context c = new InitialContext();
            return (CanilBeanLocal) c.lookup("java:global/Procura4PatasBackend/CanilBean!beans.CanilBeanLocal");
        } catch (NamingException ne) {
            ne.printStackTrace();
            throw new RuntimeException(ne);
        }
    }
    
}
