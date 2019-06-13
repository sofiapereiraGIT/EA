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
import procura4patas.Utilizador;
import procura4patas.UtilizadorDAO;

/**
 *
 * @author davidsousa
 */
@Stateless
public class UtilizadorBean implements UtilizadorBeanLocal {

    @Override
    public List<Animal> getCaoAdocaoUser(PersistentSession sessao, Utilizador user) {
        
        List<Animal> animalTotal = new ArrayList<>();
        animalTotal = Arrays.asList(user.animais.toArray());
        List<Animal> onlyDogs = new ArrayList<>();
        
        if(animalTotal != null) {
        animalTotal.stream().filter((a) -> (a.getEstado() == 'a' && a.getDiscriminator()=='c')).forEachOrdered((a) -> {
            onlyDogs.add(a);
        });
        }
        
        return onlyDogs;
    }
    
    @Override
    public List<Animal> getGatoAdocaoUser(PersistentSession sessao, Utilizador user) {
        
        List<Animal> animalTotal = new ArrayList<>();
        animalTotal = Arrays.asList(user.animais.toArray());
        List<Animal> onlyCats = new ArrayList<>();
        
        if(animalTotal != null) {
        animalTotal.stream().filter((a) -> (a.getEstado() == 'a' && a.getDiscriminator()=='g')).forEachOrdered((a) -> {
            onlyCats.add(a);
        });
        }
        
        return onlyCats;
    }
    
    @Override
    public List<Animal> getTodosCaes(PersistentSession sessao, Utilizador user) {
        
        List<Animal> animalTotal = new ArrayList<>();
        animalTotal = Arrays.asList(user.animais.toArray());
        List<Animal> todosCaes = new ArrayList<>();
        
        if(animalTotal != null) {
        animalTotal.stream().filter((a) -> ( (a.getEstado() == 'a' || a.getEstado() == 'p') && a.getDiscriminator()=='c')).forEachOrdered((a) -> {
            todosCaes.add(a);
        });
        }
        
        return todosCaes;
    }
    
    
    @Override
    public List<Animal> getTodosGatos(PersistentSession sessao, Utilizador user) {
        
        List<Animal> animalTotal = new ArrayList<>();
        animalTotal = Arrays.asList(user.animais.toArray());
        List<Animal> todosGatos = new ArrayList<>();
        
        if(animalTotal != null) {
        animalTotal.stream().filter((a) -> ( (a.getEstado() == 'a' || a.getEstado() == 'p') && a.getDiscriminator()=='g')).forEachOrdered((a) -> {
            todosGatos.add(a);
        });
        }
        
        return todosGatos;
    }
    
    @Override
    public List<Animal> getPedidosUser(PersistentSession sessao, Utilizador user) {
        
        List<Animal> pedidosTotal = new ArrayList<>();
        pedidosTotal = (List<Animal>) (user.listaPedidos);
        
        return pedidosTotal;  
    }
    
    
    
}
