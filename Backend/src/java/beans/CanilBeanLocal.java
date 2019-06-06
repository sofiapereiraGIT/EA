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
 * @author carlos
 */
@Local
public interface CanilBeanLocal {
    public List<Canil> getCanis(PersistentSession sessao);

    Canil getCanil(PersistentSession sessao, String email);
}
