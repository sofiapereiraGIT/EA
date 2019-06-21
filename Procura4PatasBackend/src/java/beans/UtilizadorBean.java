/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import procura4patas.Animal;
import procura4patas.Canil;
import procura4patas.CanilDAO;
import procura4patas.Pedido;
import procura4patas.Utilizador;
import procura4patas.UtilizadorComum;
import procura4patas.UtilizadorComumDAO;
import procura4patas.UtilizadorDAO;

/**
 *
 * @author davidsousa
 */
@Stateless
public class UtilizadorBean implements UtilizadorBeanLocal {
    
    @Override
    public Utilizador login(PersistentSession session, String email, String password) {
        try {
            Utilizador user = UtilizadorDAO.loadUtilizadorByQuery(session, "email='"+email+"' AND password='"+password+"'", "nome");
            return user;
        } catch (PersistentException ex) {
            return null;
        }
    }
    
    /**
     *
     * @param session
     * @param email
     * @return
     */
    @Override
    public int getUserType(PersistentSession session, String email) {
        try {
            UtilizadorComum uC = UtilizadorComumDAO.loadUtilizadorComumByORMID(session, email);
            return 0;
        } catch (Exception e) {}
        try {
            Canil c = CanilDAO.loadCanilByORMID(session, email);
            return 1;
        } catch (Exception e) {}
        return -1;
    }
    
    @Override
    public Utilizador getUtilizador(PersistentSession session, String email) {
        
        Utilizador user = null;
        
        try {
            user = UtilizadorDAO.getUtilizadorByORMID(email);
        } catch (PersistentException ex) {
            Logger.getLogger(UtilizadorBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return user;           
   }
    
    @Override
    public List<Animal> getCaoAdocaoUser(PersistentSession sessao, String email) {
        
        List<Animal> onlyDogs = new ArrayList<>();
        
        try {
            Utilizador user = UtilizadorDAO.getUtilizadorByORMID(email);
            List<Animal> animalTotal = new ArrayList<>();
            animalTotal = Arrays.asList(user.animais.toArray());
            
            if(animalTotal != null) {
                animalTotal.stream().filter((a) -> (a.getEstado() == 'E' && a.getDiscriminator()=='C')).forEachOrdered((a) -> {
                onlyDogs.add(a);
                });
            }
        } catch(PersistentException e) {
            System.out.println(e);
        }
       
        return onlyDogs;
    }
    
    @Override
    public List<Animal> getGatoAdocaoUser(PersistentSession sessao, String email) {
        
        List<Animal> onlyCats = new ArrayList<>();
        
        try {
            Utilizador user = UtilizadorDAO.getUtilizadorByORMID(email);
            List<Animal> animalTotal = new ArrayList<>();
            animalTotal = Arrays.asList(user.animais.toArray());
            
            if(animalTotal != null) {
     
                animalTotal.stream().filter((a) -> (a.getEstado() == 'E' && a.getDiscriminator()=='G')).forEachOrdered((a) -> {
                onlyCats.add(a);
                });
            }
        } catch(PersistentException e) {
            System.out.println(e);
        }
          
        return onlyCats;
    }
    
    @Override
    public List<Animal> getTodosCaes(PersistentSession sessao, String email) {
        
        List<Animal> todosCaes = new ArrayList<>();
        
        try {
            Utilizador user = UtilizadorDAO.getUtilizadorByORMID(email);
            List<Animal> animalTotal = new ArrayList<>();
            animalTotal = Arrays.asList(user.animais.toArray());

            if(animalTotal != null) {
                animalTotal.stream().filter((a) -> ( (a.getEstado() == 'E' || a.getEstado() == 'P') && a.getDiscriminator()=='C')).forEachOrdered((a) -> {
                    todosCaes.add(a);
                });
            }
            
        } catch(PersistentException e) {
            System.out.println(e);
        }
        
        return todosCaes;
    }
    
    @Override
    public List<Animal> getTodosGatos(PersistentSession sessao, String email) {
        
        List<Animal> todosGatos = new ArrayList<>();
        
        try {
            Utilizador user = UtilizadorDAO.getUtilizadorByORMID(email);
            List<Animal> animalTotal = new ArrayList<>();
            animalTotal = Arrays.asList(user.animais.toArray());

            if(animalTotal != null) {
                animalTotal.stream().filter((a) -> ( (a.getEstado() == 'E' || a.getEstado() == 'P') && a.getDiscriminator()=='G')).forEachOrdered((a) -> {
                    todosGatos.add(a);
                });
            }
        } catch(PersistentException e) {
            System.out.println(e);
        }
        
        return todosGatos;
    }
    
    @Override
    public List<Pedido> getPedidosUser(PersistentSession sessao, String email) {
        
        List<Pedido> pedidosTotal = new ArrayList<>();
        
        try {
            Utilizador user = UtilizadorDAO.getUtilizadorByORMID(email);
            pedidosTotal = Arrays.asList(user.listaPedidos.toArray() );
        } catch(PersistentException e) {
            System.out.println(e);
        }
        
        return pedidosTotal;  
    }
}
