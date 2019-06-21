/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import beans.AnimalBeanLocal;
import beans.CanilBeanLocal;
import beans.PedidoBeanLocal;
import beans.UtilizadorBeanLocal;
import beans.UtilizadorComumBeanLocal;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import procura4patas.Animal;
import procura4patas.Canil;
import procura4patas.Pedido;
import procura4patas.Utilizador;
import procura4patas.UtilizadorComum;

/**
 *
 * @author davidsousa
 */
public class P4P {
    static AnimalBeanLocal animalBean = lookupAnimalBeanLocal();
    static PedidoBeanLocal pedidoBean = lookupPedidoBeanLocal();
    static UtilizadorBeanLocal utilizadorBean = lookupUtilizadorBeanLocal();
    static UtilizadorComumBeanLocal utilizadorComumBean = lookupUtilizadorComumBeanLocal();
    static CanilBeanLocal canilBean = lookupCanilBeanLocal();
    
    /** animalBean methods **/
    
    public static List getCaesAdotar(PersistentSession session){
        return animalBean.getCaesAdotar(session);
    }
    
    public static List getGatosAdotar(PersistentSession session){
        return animalBean.getGatosAdotar(session);
    }
    
    public static List getCaesPerdidos(PersistentSession session){
        return animalBean.getCaesPerdidos(session);
    }
    
    public static List getGatosPerdidos(PersistentSession session){
        return animalBean.getGatosPerdidos(session);
    }
    
    public static boolean addAnimal(PersistentSession session, String UtilizadorEmail, String nome, String fotografia, char sexo, char idade,
        String raca, char porte, String corPelo, char compPelo, char estado, String descricao, String concelho, char discriminator){ 
        return animalBean.addAnimal(session, UtilizadorEmail, nome, fotografia, sexo, idade, raca, porte, corPelo, compPelo, estado,
                descricao, concelho, discriminator);
    }
    
    public static boolean updateAnimal(PersistentSession session, int ID, String nome, String fotografia, char sexo, char idade,
        String raca, char porte, String corPelo, char compPelo, char estado, String descricao, String concelho, char discriminator){ 
        return animalBean.updateAnimal(session, ID, nome, fotografia, sexo, idade, raca, porte, corPelo, compPelo, estado,
                descricao, concelho, discriminator);
    }
    
    public static boolean deleteAnimalPerdido(PersistentSession session, int ID){ 
        return animalBean.deleteAnimalPerdido(session, ID);
    }
    
    /** pedidoBean methods **/
    
    public static boolean adotarAnimal(PersistentSession sessao, String email, String emailUtilComum, int id) {
        return pedidoBean.adotarAnimal(sessao, email, emailUtilComum,id);
    }
    
    public static boolean serFatAnimal(PersistentSession sessao, String email, String emailUtilComum, int id) {
        return pedidoBean.serFatAnimal(sessao, email, emailUtilComum, id);
    }
    
    /** utilizadorBean methods **/
    
    public static Utilizador login(PersistentSession session, String email, String password) {
        return utilizadorBean.login(session, email, password);
    }
    
    public static int getUserType(PersistentSession session, String email) {
        return utilizadorBean.getUserType(session, email);
    }
    
    public static List<Animal> getCaoAdocaoUser(PersistentSession sessao, String email) {
         return utilizadorBean.getCaoAdocaoUser(sessao, email);
    }
    
    public static List<Animal> getGatoAdocaoUser(PersistentSession sessao, String email) {
       return utilizadorBean.getGatoAdocaoUser(sessao, email);
    }
     
    public static List<Animal> getTodosCaes(PersistentSession sessao, String email) {
        return utilizadorBean.getTodosCaes(sessao, email);
    }
     
    public static List<Animal> getTodosGatos(PersistentSession sessao, String email) {
        return utilizadorBean.getTodosGatos(sessao, email);
    }
     
    public static List<Pedido> getPedidosUser(PersistentSession sessao, String email) {
        return utilizadorBean.getPedidosUser(sessao, email);
    }
     
    /* utilizadorComumBean methods */
    
    public static UtilizadorComum getUtilizadorComum(PersistentSession sessao, String email){
        return utilizadorComumBean.getUtilizadorComum(sessao, email);
    }

    public static boolean addUtilizadorComum(PersistentSession sessao, String email, String pass, String nome, String foto, String concelho, String tlm, String descricao){
        return utilizadorComumBean.addUtilizadorComum(sessao, email, pass, nome, foto, concelho, tlm, descricao);
    }

    public static boolean updateUtilizadorComum(PersistentSession sessao, String email, String pass, String nome, String foto, String concelho, String tlm, String descricao){
        return utilizadorComumBean.updateUtilizadorComum(sessao, email, pass, nome, foto, concelho, tlm, descricao);
    }
    
    /** canilBean methods */
    
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
    
    public static List getCanis(PersistentSession sessao){
        return canilBean.getCanis(sessao);
    }
    
    /* Lookups para os beans */
    
    private static AnimalBeanLocal lookupAnimalBeanLocal() {
        try {
            Context c = new InitialContext();
            return (AnimalBeanLocal) c.lookup("java:global/Procura4PatasBackend/AnimalBean!beans.AnimalBeanLocal");
        } catch (NamingException ne) {
            ne.printStackTrace();
            throw new RuntimeException(ne);
        }
    }

    private static PedidoBeanLocal lookupPedidoBeanLocal() {
        try {
            Context c = new InitialContext();
            return (PedidoBeanLocal) c.lookup("java:global/Procura4PatasBackend/PedidoBean!beans.PedidoBeanLocal");
        } catch (NamingException ne) {
            ne.printStackTrace();
            throw new RuntimeException(ne);
        }
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
