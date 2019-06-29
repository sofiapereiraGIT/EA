/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.ejb.Stateless;
import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;

/**
 *
 * @author davidsousa
 */
@Stateless
public class PedidoBean implements PedidoBeanLocal {
    
    @Override
    public boolean adotarAnimal(PersistentSession sessao, String email, String emailUtilComum, int id) {
        
        Date dt  = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String data = sdf.format(dt);
        
        char estado = 'P';
        
        Date dt2  = new Date();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dataUltimoContacto = sdf2.format(dt2);
        char discriminator = 'A';
        
        try {
    
            sessao.beginTransaction();
            
            Query query = sessao.createSQLQuery("INSERT INTO Pedido\n" +
                    "(UtilizadorEmail, UtilizadorComumUtilizadorEmail, AnimalID, Data, Estado, DataUltimoContacto, Discriminator)\n" +
                    "VALUES \n" +
                    "("+ "'" + email+ "'" + ", "+ "'" + emailUtilComum + "'" + ", "+ id+", " + "'"+data+ "'" + ", "+ "'" + estado+ "'" + ", "+ "'" + dataUltimoContacto+ "'"  + ", "+ "'"  +discriminator + "'"  +");");
            
            query.executeUpdate();
            
            sessao.getTransaction().commit();
            return true;
            
        } catch (PersistentException ex) {
            System.out.println(ex);
            sessao.getTransaction().rollback();
            return false;
        }
    }
    
    @Override
    public boolean serFatAnimal(PersistentSession sessao, String email, String emailUtilComum, int id) {
        
        Date dt  = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String data = sdf.format(dt);
        
        char estado = 'P';
        
        Date dt2  = new Date();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dataUltimoContacto = sdf2.format(dt2);
        char discriminator = 'F';
        
        try {
    
            sessao.beginTransaction();
            
            Query query = sessao.createSQLQuery("INSERT INTO Pedido\n" +
                    "(UtilizadorEmail, UtilizadorComumUtilizadorEmail, AnimalID, Data, Estado, DataUltimoContacto, Discriminator)\n" +
                    "VALUES \n" +
                    "("+ "'" + email+ "'" + ", "+ "'" + emailUtilComum + "'" + ", "+ id+", " + "'"+data+ "'" + ", "+ "'" + estado+ "'" + ", "+ "'" + dataUltimoContacto+ "'"  + ", "+ "'"  +discriminator + "'"  +");");
            
            query.executeUpdate();
            
            sessao.getTransaction().commit();
            return true;
            
        } catch (PersistentException ex) {
            System.out.println(ex);
            sessao.getTransaction().rollback();
            return false;
        }
    }
}
