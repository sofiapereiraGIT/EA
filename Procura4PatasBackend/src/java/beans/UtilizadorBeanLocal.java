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
    List<Animal> getCaoAdocaoUser(PersistentSession sessao, Utilizador user);
    List<Animal> getGatoAdocaoUser(PersistentSession sessao, Utilizador user);
    List<Animal> getTodosCaes(PersistentSession sessao, Utilizador user);
    List<Animal> getTodosGatos(PersistentSession sessao, Utilizador user);
    List<Animal> getPedidosUser(PersistentSession sessao, Utilizador user);

    Utilizador login(PersistentSession session, String email, String password);
   
}
