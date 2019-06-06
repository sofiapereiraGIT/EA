/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.ejb.Local;
import org.hibernate.Session;
import org.orm.PersistentSession;
import procura4patas.UtilizadorComum;

/**
 *
 * @author carlos
 */
@Local
public interface UtilizadorComumBeanLocal {

    public UtilizadorComum getUtilizadorComun(PersistentSession sessao, String email);

    public boolean addUtilizadorComun(PersistentSession sessao, String email, String pass, String nome, String foto, String concelho, String tlm, String descricao);

    public boolean updateUtilizadorComun(PersistentSession sessao, String email, String pass, String nome, String foto, String concelho, String tlm, String descricao);
    
}
