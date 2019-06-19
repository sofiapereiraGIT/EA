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
import org.hibernate.Query;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import procura4patas.Animal;
import procura4patas.AnimalDAO;
import procura4patas.Pedido;
import procura4patas.PedidoDAO;
import procura4patas.Utilizador;
import procura4patas.UtilizadorComum;
import procura4patas.UtilizadorDAO;

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
