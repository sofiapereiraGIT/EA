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
    
    
}
