/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import procura4patas.*;

/**
 *
 * @author davidsousa
 */
@Stateless
public class CanilBean implements CanilBeanLocal {

    @Override
    public List getCanis(PersistentSession sessao) {
        List<Canil> lista = new ArrayList<>();
        
        try {
            lista = CanilDAO.queryCanil(sessao, null, null);
        } catch (PersistentException ex) {
            Logger.getLogger(CanilBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
    }

    @Override
    public Canil getCanil(PersistentSession sessao, String email) {
        Canil canil = null;
        
        try {
            canil = CanilDAO.getCanilByORMID(sessao, email);
        } catch (PersistentException ex) {
            Logger.getLogger(CanilBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return canil;
    }

    @Override
    public boolean addCanil(PersistentSession sessao, String email, String pass, String nome, String foto, String concelho, String tlm, String descricao, 
            String morada, String horario, String site, String face, String insta) {
        
        boolean criado = false;
        
        if(foto==null) foto = "";
        if(tlm==null) tlm = "";
        if(descricao==null) descricao = "";
        if(horario==null) horario = "";
        if(site==null) site = "";
        if(face==null) face = "";
        if(insta==null) insta = "";
        
        try {
            sessao.beginTransaction();
            
            Query query = sessao.createSQLQuery("INSERT INTO Utilizador (Email, Password, Nome, Fotografia, Concelho, Telemovel, Descricao)\n " + 
                    "VALUES ('" + email + "', '" + pass + "', '" + nome + "', '" + foto + "', '" + concelho + "', '" + tlm + "', '" + descricao + "');");
            query.executeUpdate();
            
            Query query2 = sessao.createSQLQuery("INSERT INTO Canil\n (Morada, Horario, SiteOficial, Facebook, Instagram, UtilizadorEmail)\n " +
                    "VALUES ('" + morada + "', '" + horario + "', '" + site + "', '" + face + "', '" + insta + "', '" + email + "');");
            query2.executeUpdate();

            sessao.getTransaction().commit();
            criado = true;
                
        } catch (PersistentException ex) {
            sessao.getTransaction().rollback();
            criado = false;
        }
        
        return criado;
    }

    @Override
    public boolean updateCanil(PersistentSession sessao, String email, String pass, String nome, String foto, String concelho, String tlm, String descricao, 
            String morada, String horario, String site, String face, String insta) {
        
        boolean atualizado = false;
            
        if(foto==null) foto = "";
        if(tlm==null) tlm = "";
        if(descricao==null) descricao = "";
        if(horario==null)  horario = "";
        if(site==null) site = "";
        if(face==null) face = "";
        if(insta==null) insta = "";

        try {
            sessao.beginTransaction();

            Query query = sessao.createSQLQuery("UPDATE Utilizador\n " + 
                "SET Password = '" + pass + "', Nome = '" + nome + "', Fotografia = '" + foto + "', Concelho = '" + concelho + 
                "', Telemovel = '" + tlm + "', Descricao = '" + descricao + "'\n" +
                "WHERE Email = '" + email + "';");
            query.executeUpdate();
            
            Query query2 = sessao.createSQLQuery("UPDATE Canil\n " + 
                "SET Morada = '" + morada + "', Horario = '" + horario + "', SiteOficial = '" + site + "', Facebook = '" + face + "', Instagram = '" + insta + "'\n" + 
                "WHERE UtilizadorEmail = '" + email + "';");
            query2.executeUpdate();
                
            sessao.getTransaction().commit();
            atualizado = true;
           
        } catch (PersistentException ex) {
            sessao.getTransaction().rollback();
            atualizado = false;
        }
            
        return atualizado;
    }
}
