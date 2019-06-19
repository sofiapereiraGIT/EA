/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Local;
import org.orm.PersistentSession;
import procura4patas.Animal;

/**
 *
 * @author davidsousa
 */
@Local
public interface PedidoBeanLocal {
    
    boolean adotarAnimal(PersistentSession sessao, String email, String emailUtilComum, int id);
    
    boolean serFatAnimal(PersistentSession sessao, String email, String emailUtilComum, int id);
}
