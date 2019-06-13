/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import procura4patas.Animal;
import procura4patas.AnimalDAO;
import procura4patas.AnimalPerdido;
import procura4patas.AnimalPerdidoDAO;
import procura4patas.Cao;
import procura4patas.Gato;
import procura4patas.Utilizador;

/**
 *
 * @author carlos
 */
@Stateless
public class AnimalBean implements AnimalBeanLocal {
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public List getCaesAdotar(PersistentSession session) {
        List caesAdotar = null;
        
        try {
            session.beginTransaction();
            caesAdotar = AnimalDAO.queryAnimal(session, "Discriminator = Cao", null);
            /*OU??? caesAdotar = CaoDAO.queryCao(null, null);*/
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            Logger.getLogger(AnimalBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return caesAdotar;
    }

    public List getCaesPerdidos(PersistentSession session) throws PersistentException {
        List caesPerdidos = null;
        
        try {
            session.beginTransaction();
            List animaisPerdidos = AnimalPerdidoDAO.queryAnimalPerdido(session, null, null);
            session.getTransaction().commit();
            
            animaisPerdidos.stream().forEach((o) -> {
                AnimalPerdido an = (AnimalPerdido) o;
                Animal a = an.getAnimalPerdido();
                if (a instanceof Cao) {
                    caesPerdidos.add(o);
                }
            });
        } catch (Exception ex) {
            session.getTransaction().rollback();
            Logger.getLogger(AnimalBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return caesPerdidos;
    }
    
    public List getGatosAdotar(PersistentSession session) {
        List gatosAdotar = null;
        
        try {
            session.beginTransaction();
            gatosAdotar = AnimalDAO.queryAnimal(session, "Discriminator = Gato", null);
            /*OU??? gatosAdotar = GatoDAO.queryGato(null, null);*/
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            Logger.getLogger(AnimalBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return gatosAdotar;
    }

    public List getGatosPerdidos(PersistentSession session) {
        List gatosPerdidos = null;
        
        try {
            session.beginTransaction();
            List animaisPerdidos = AnimalPerdidoDAO.queryAnimalPerdido(session, null, null);
            session.getTransaction().commit();
            
            animaisPerdidos.stream().forEach((o) -> {
                AnimalPerdido an = (AnimalPerdido) o;
                Animal a = an.getAnimalPerdido();
                if (a instanceof Gato) {
                    gatosPerdidos.add(o);
                }
            });
        } catch (Exception ex) {
            session.getTransaction().rollback();
            Logger.getLogger(AnimalBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return gatosPerdidos;
    }
    
    public void addAnimal(PersistentSession session, Utilizador user, String nome, String fotografia, char sexo, char idade,
        String raça, char porte, String corPelo, char compPelo, char estado, String descricao, String discriminator){ 
        
        String UtilizadorEmail = user.getE_mail();
        
        try {
            session.beginTransaction();
            
            Query query = session.createSQLQuery("INSERT INTO Animal\n" +
                    "(UtilizadorE-mail, Nome, Fotografia, Sexo, Idade, Raça, Porte, CorPelo, CompPelo, Estado, Descricao, Discriminator)\n" +
                    "VALUES \n" +
                    "("+UtilizadorEmail+", "+nome+", "+fotografia+", "+sexo+", "+idade+", "+raça+
                    ", "+porte+", "+corPelo+", "+compPelo+", "+estado+", "+descricao+", "+discriminator+");");
            
            query.executeUpdate();
            session.getTransaction().commit();
        } catch(Exception e){
            session.getTransaction().rollback();
           // Logger.getLogger(AnimalBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addAnimalPerdido(PersistentSession session, Utilizador user, String nome, String fotografia, char sexo, char idade,
        String raça, char porte, String corPelo, char compPelo, char estado, String descricao, String discriminator, String concelho){ 
        
        String UtilizadorEmail = user.getE_mail();
        
        try {
            session.beginTransaction();
            
            Query query1 = session.createSQLQuery("INSERT INTO Animal\n" +
                    "(UtilizadorE-mail, Nome, Fotografia, Sexo, Idade, Raça, Porte, CorPelo, CompPelo, Estado, Descricao, Discriminator)\n" +
                    "VALUES \n" +
                    "("+UtilizadorEmail+", "+nome+", "+fotografia+", "+sexo+", "+idade+", "+raça+
                    ", "+porte+", "+corPelo+", "+compPelo+", "+estado+", "+descricao+", "+discriminator+");");
            
            query1.executeUpdate();
            
            /* ANIMAL PERDIDO !!!!!!! TODO
            Query query2 = session.createSQLQuery("INSERT INTO AnimalPerdido\n" +
                    "(UtilizadorComumUtilizadorE-mail, AnimalID, Concelho)\n" +
                    "VALUES \n" +
                    "("+UtilizadorEmail+", "+AnimalID+", "+concelho+");");
            
            query2.executeUpdate();
            session.getTransaction().commit();
                    */
        } catch (Exception ex) {
            session.getTransaction().rollback();
            Logger.getLogger(AnimalBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateAnimal(PersistentSession session, String ID, String nome, String fotografia, char sexo, char idade,
        String raça, char porte, String corPelo, char compPelo, char estado, String descricao, String discriminator){ 
        
        // Animal animal;
        // AnimalDAO.getAnimalByORMID(session, ID);
    }
    
    public void updateAnimalPerdido(PersistentSession session){ 
      
    }
    
    public void deleteAnimalPerdido(PersistentSession session){ 
      
    }
}
