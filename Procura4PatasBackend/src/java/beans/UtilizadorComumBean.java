/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import procura4patas.UtilizadorComum;
import procura4patas.UtilizadorComumDAO;

/**
 *
 * @author davidsousa
 */
@Stateless
public class UtilizadorComumBean implements UtilizadorComumBeanLocal {

    @Override
    public UtilizadorComum getUtilizadorComum(PersistentSession sessao, String email) {
        UtilizadorComum uc = null;
        
        try {
            uc = UtilizadorComumDAO.getUtilizadorComumByORMID(sessao, email);
        } catch (PersistentException ex) {
            Logger.getLogger(UtilizadorComumBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return uc;
    }

    @Override
    public boolean addUtilizadorComum(PersistentSession sessao, String email, String pass, String nome, String foto, String concelho, String tlm, String descricao) {
        boolean criado = false;
        
        try {
            sessao.beginTransaction();
            
            Query query = sessao.createSQLQuery("INSERT INTO Utilizador (Email, Password, Nome, Fotografia, Concelho, Telemovel, Descricao)\n " + 
                    "VALUES ('" + email + "', '" + pass + "', '" + nome + "', '" + foto + "', '" + concelho + "', '" + tlm + "', '" + descricao + "');");
            query.executeUpdate();
            
            Query query2 = sessao.createSQLQuery("INSERT INTO UtilizadorComum VALUES('" + email + "');");
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
    public boolean updateUtilizadorComum(PersistentSession sessao, String email, String pass, String nome, String foto, String concelho, String tlm, String descricao) {
        boolean atualizado = false;
        
        try {
            sessao.beginTransaction();
            
            Query query = sessao.createSQLQuery("UPDATE Utilizador\n " + 
                "SET Password = '" + pass + "', Nome = '" + nome + "', Fotografia = '" + foto + "', Concelho = '" + concelho + 
                "', Telemovel = '" + tlm + "', Descricao = '" + descricao + "'\n" +
                "WHERE Email = '" + email + "';");
            query.executeUpdate();
            
            sessao.getTransaction().commit();
            atualizado = true;
            
        } catch (PersistentException ex) {
            sessao.getTransaction().rollback();
            atualizado = false;
        }
        
        return atualizado;
    }
}
