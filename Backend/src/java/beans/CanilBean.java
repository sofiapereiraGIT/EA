/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.Stateless;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import procura4patas.*;

/**
 *
 * @author carlos
 */
@Stateless
public class CanilBean implements CanilBeanLocal {
    
    @Override
    public List<Canil> getCanis(PersistentSession sessao) {
        List<Canil> lista = new ArrayList<>();
        
        try {
            lista = CanilDAO.queryCanil(sessao, null, null);
        } catch (PersistentException ex) {
            Logger.getLogger(CanilBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
    }

    @Override
    public Canil getCanil(PersistentSession sessao, String email) {
        Canil canil = null;
        
        try {
            canil = CanilDAO.getCanilByORMID(sessao, email);
        } catch (PersistentException ex) {
            Logger.getLogger(CanilBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return canil;
    }
    
    
}
