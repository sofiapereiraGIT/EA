/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.ejb.Stateless;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import procura4patas.Animal;
import procura4patas.Utilizador;
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
    
    @Override
    public List<Animal> getCaoAdocaoUser(PersistentSession sessao, String email) {
        
        List<Animal> onlyDogs = new ArrayList<>();
        
        try {
            Utilizador user = UtilizadorDAO.getUtilizadorByORMID(email);
            List<Animal> animalTotal = new ArrayList<>();
            animalTotal = Arrays.asList(user.animais.toArray());
            
            if(animalTotal != null) {
                animalTotal.stream().filter((a) -> (a.getEstado() == 'a' && a.getDiscriminator()=='c')).forEachOrdered((a) -> {
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
                animalTotal.stream().filter((a) -> (a.getEstado() == 'a' && a.getDiscriminator()=='g')).forEachOrdered((a) -> {
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
                animalTotal.stream().filter((a) -> ( (a.getEstado() == 'a' || a.getEstado() == 'p') && a.getDiscriminator()=='c')).forEachOrdered((a) -> {
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
                animalTotal.stream().filter((a) -> ( (a.getEstado() == 'a' || a.getEstado() == 'p') && a.getDiscriminator()=='g')).forEachOrdered((a) -> {
                    todosGatos.add(a);
                });
            }
        } catch(PersistentException e) {
            System.out.println(e);
        }
        
        return todosGatos;
    }
    
    @Override
    public List<Animal> getPedidosUser(PersistentSession sessao, String email) {
        
        List<Animal> pedidosTotal = new ArrayList<>();
        
        try {
            Utilizador user = UtilizadorDAO.getUtilizadorByORMID(email);
            pedidosTotal = (List<Animal>) (user.listaPedidos);
        } catch(PersistentException e) {
            System.out.println(e);
        }
        
        return pedidosTotal;  
    }
}
