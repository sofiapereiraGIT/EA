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
import org.orm.PersistentSession;
import procura4patas.Animal;
import procura4patas.AnimalDAO;

/**
 *
 * @author davidsousa
 */
@Stateless
public class AnimalBean implements AnimalBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    @Override
    public List getCaesAdotar(PersistentSession session) {
        List caesAdotar = null;
        
        try {
            session.beginTransaction();
            caesAdotar = AnimalDAO.queryAnimal(session, "Discriminator = 'C' AND (Estado = 'E' OR Estado = 'D' OR Estado = 'F' OR Estado = 'C')", null);
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            Logger.getLogger(AnimalBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return caesAdotar;
    }

    
    @Override
    public List getGatosAdotar(PersistentSession session) {
        List gatosAdotar = null;
        
        try {
            session.beginTransaction();
            gatosAdotar = AnimalDAO.queryAnimal(session, "Discriminator = 'G' AND (Estado = 'E' OR Estado = 'D' OR Estado = 'F' OR Estado = 'C')", null);
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            Logger.getLogger(AnimalBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return gatosAdotar;
    }
    
    @Override
    public List getCaesPerdidos(PersistentSession session) {
        List caesPerdidos = null;
        
        try {
            session.beginTransaction();
            caesPerdidos = AnimalDAO.queryAnimal(session, "Discriminator = 'C' AND Estado = 'P'", null);
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            Logger.getLogger(AnimalBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return caesPerdidos;
    }

    @Override
    public List getGatosPerdidos(PersistentSession session) {
        List gatosPerdidos = null;
        
        try {
            session.beginTransaction();
            gatosPerdidos = AnimalDAO.queryAnimal(session, "Discriminator = 'G' AND Estado = 'P'", null);
            session.getTransaction().commit();
        } catch (Exception ex) {
            session.getTransaction().rollback();
            Logger.getLogger(AnimalBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return gatosPerdidos;
    }
    
    @Override
    public boolean addAnimal(PersistentSession session, String UtilizadorEmail, String nome, String fotografia, char sexo, char idade,
        String raca, char porte, String corPelo, char compPelo, char estado, String descricao, String concelho, char discriminator){ 
       
        try {
            session.beginTransaction();
            
            Query query = session.createSQLQuery("INSERT INTO Animal\n" +
                    "(UtilizadorEmail, Nome, Fotografia, Sexo, Idade, Raça, Porte, CorPelo, CompPelo, Estado, Descricao, Concelho, Discriminator)\n" +
                    "VALUES \n" +
                    "('"+UtilizadorEmail+"', '"+nome+"', '"+fotografia+"', '"+sexo+"', '"+idade+"', '"+raca+
                    "', '"+porte+"', '"+corPelo+"', '"+compPelo+"', '"+estado+"', '"+descricao+"', '"+concelho+"', '"+discriminator+"');");
            
            query.executeUpdate();
            
            session.getTransaction().commit();
            return true;
        } catch(Exception ex){
            Logger.getLogger(AnimalBean.class.getName()).log(Level.SEVERE, null, ex);
            session.getTransaction().rollback();
            return false;
        }
    }
    
    @Override
    public boolean updateAnimal(PersistentSession session, int ID, String nome, String fotografia, char sexo, char idade,
        String raca, char porte, String corPelo, char compPelo, char estado, String descricao, String concelho, char discriminator){ 
                
        try {
            session.beginTransaction();
            
            Query query = session.createSQLQuery("UPDATE Animal\n" +
                    "SET Nome = '"+nome+"', Fotografia = '"+fotografia+"', Sexo = '"+sexo+"', Idade = '"+idade+
                    "', Raça = '"+raca+"', Porte = '"+porte+"', CorPelo = '"+corPelo+"', CompPelo = '"+compPelo+
                    "', Estado = '"+estado+"', Descricao = '"+descricao+"', Concelho = '"+concelho+"', Discriminator = '"+discriminator+"'\n"+
                    "WHERE ID = "+ID+";");
                                
            query.executeUpdate();

            session.getTransaction().commit();
            return true;
        } catch (Exception ex) {
            Logger.getLogger(AnimalBean.class.getName()).log(Level.SEVERE, null, ex);
            session.getTransaction().rollback();
            return false;
        }        
    }
    
    @Override
    public boolean deleteAnimalPerdido(PersistentSession session, int ID){ 
        try {
            session.beginTransaction();
            
            Query query = session.createSQLQuery("DELETE FROM Animal\n"+
                    "WHERE ID = "+ID+" AND Estado = 'P';");
            
            query.executeUpdate();
            
            session.getTransaction().commit();
            return true;
        } catch(Exception ex){
            Logger.getLogger(AnimalBean.class.getName()).log(Level.SEVERE, null, ex);
            session.getTransaction().rollback();
            return false;
        }
    }

    @Override
    public Animal getAnimal(PersistentSession session, int id) {
        Animal animal = null;
        try {
            animal = AnimalDAO.getAnimalByORMID(session, id);
        } catch (Exception e) {}
        return animal;
    }

    @Override
    public String getUtilizadorEmail(PersistentSession session, int id) {
        String email = null;
        try {
            session.beginTransaction();
            
            Query query = session.createSQLQuery("Select UtilizadorEmail from Animal where id = :idAnimal")
                                 .setParameter("idAnimal", id);
            List result = query.list();
            email = result.get(0).toString();
        } catch (Exception e) {}
        return email;
    }
    
    @Override
    public int getLastId(PersistentSession session) {
         String idAux = null;
         int id = -1;
        try {
            session.beginTransaction();
            
            Query query = session.createSQLQuery("Select max(id) from Animal");
           
            List result = query.list();
            idAux = result.get(0).toString();
            id = Integer.parseInt(idAux);
            
        } catch (Exception e) {}
        return id;
    }
}
