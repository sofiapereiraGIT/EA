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
import org.hibernate.Session;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import procura4patas.Animal;
import procura4patas.AnimalPerdidoDAO;
import procura4patas.Cao;
import procura4patas.Gato;
import procura4patas.Utilizador;
import procura4patas.UtilizadorComum;

/**
 *
 * @author davidsousa
 */
@Stateless
public class UtilizadorBean implements UtilizadorBeanLocal {
    
    @Override
    public List<Animal> getCaoAdocaoUser(PersistentSession sessao, Utilizador user) {
        List<Animal> animalTotal = Arrays.asList(user.animaisAdotar.toArray());
        List<Animal> onlyDogs = new ArrayList<>();
        
        animalTotal.stream().filter((a) -> (a instanceof Cao)).forEachOrdered((a) -> {
            onlyDogs.add(a);
        });
        
        return onlyDogs;
    }
    
    @Override
    public List<Animal> getGatoAdocaoUser(PersistentSession sessao, Utilizador user) {
        List<Animal> animalTotal = Arrays.asList(user.animaisAdotar.toArray());
        List<Animal> onlyCats = new ArrayList<>();
        
        animalTotal.stream().filter((a) -> (a instanceof Gato)).forEachOrdered((a) -> {
            onlyCats.add(a);
        });
        
        return onlyCats;
    }
  
    @Override
    public List<Animal> getCaesTotais(PersistentSession sessao, Utilizador user) {
        List<Animal> animalAdocaoTotal = getCaoAdocaoUser(sessao,user);
        List<Animal> animalPerdidosTotal = new ArrayList<>();
        
        try {
            animalPerdidosTotal = AnimalPerdidoDAO.queryAnimalPerdido(sessao,"where `UtilizadorComumUtilizadorE-mail` = " + user.getE_mail(),"`UtilizadorComumUtilizadorE-mail`");
        } catch (PersistentException ex) {
            Logger.getLogger(UtilizadorBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        List<Animal> onlyLostDogs = new ArrayList<>();
        
        animalPerdidosTotal.stream().filter((p) -> (p instanceof Cao)).forEachOrdered((p) -> {
            onlyLostDogs.add(p);
        });
 
        
        animalAdocaoTotal.forEach((a) -> {
            onlyLostDogs.add(a);
        });
        
        return onlyLostDogs;      
    }
    
    public List<Animal> getGatosTotais(PersistentSession sessao, Utilizador user) {
        List<Animal> animalAdocaoTotal = getCaoAdocaoUser(sessao,user);
        List<Animal> animalPerdidosTotal = new ArrayList<>();
        
        try {
            animalPerdidosTotal = AnimalPerdidoDAO.queryAnimalPerdido(sessao,"where `UtilizadorComumUtilizadorE-mail` = " + user.getE_mail(),"`UtilizadorComumUtilizadorE-mail`");
        } catch (PersistentException ex) {
            Logger.getLogger(UtilizadorBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        List<Animal> onlyLostGatos = new ArrayList<>();
        
        animalPerdidosTotal.stream().filter((p) -> (p instanceof Gato)).forEachOrdered((p) -> {
            onlyLostGatos.add(p);
        });
 
        
        animalAdocaoTotal.forEach((a) -> {
            onlyLostGatos.add(a);
        });
        
        return onlyLostGatos;  
    }
    
    
    
    

 
    
}
