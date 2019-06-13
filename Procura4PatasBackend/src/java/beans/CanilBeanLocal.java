/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.List;
import javax.ejb.Local;
import org.orm.PersistentSession;
import procura4patas.Canil;

/**
 *
 * @author davidsousa
 */
@Local
public interface CanilBeanLocal {
    public List<Canil> getCanis(PersistentSession sessao);

    public Canil getCanil(PersistentSession sessao, String email);

    public boolean addCanil(PersistentSession sessao, String email, String pass, String nome, String foto, String concelho, String tlm, String descricao, 
            String morada, String horario, String site, String face, String insta);

    public void updateCanil(PersistentSession sessao, String email, String pass, String nome, String foto, String concelho, String tlm, String descricao, 
            String morada, String horario, String site, String face, String insta);
}
