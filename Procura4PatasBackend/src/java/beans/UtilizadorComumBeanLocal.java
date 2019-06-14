/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Local;
import org.orm.PersistentSession;
import procura4patas.UtilizadorComum;

/**
 *
 * @author davidsousa
 */
@Local
public interface UtilizadorComumBeanLocal {

    public UtilizadorComum getUtilizadorComum(PersistentSession sessao, String email);

    public boolean addUtilizadorComum(PersistentSession sessao, String email, String pass, String nome, String foto, String concelho, String tlm, String descricao);

    public boolean updateUtilizadorComum(PersistentSession sessao, String email, String pass, String nome, String foto, String concelho, String tlm, String descricao);

}
