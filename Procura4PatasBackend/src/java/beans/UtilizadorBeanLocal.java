/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.List;
import javax.ejb.Local;
import org.orm.PersistentSession;
import procura4patas.Animal;
import procura4patas.Utilizador;

/**
 *
 * @author davidsousa
 */
@Local
public interface UtilizadorBeanLocal {
    
    Utilizador login(PersistentSession session, String email, String password);
    
    List<Animal> getCaoAdocaoUser(PersistentSession sessao, String email);
    
    List<Animal> getGatoAdocaoUser(PersistentSession sessao, String email);
    
    List<Animal> getTodosCaes(PersistentSession sessao, String email);
    
    List<Animal> getTodosGatos(PersistentSession sessao, String email);
    
    List<Animal> getPedidosUser(PersistentSession sessao, String email);
    
}
