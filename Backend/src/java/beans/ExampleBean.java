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
import static procura4patas.CanilDAO.queryCanil;

/**
 *
 * @author carlos
 */
@Stateless
public class ExampleBean implements ExampleBeanLocal {

    @Override
    public List businessMethod() {
        try {
            List x = queryCanil(null, null);
            x.add("Boas");
            return x;
        } catch (PersistentException ex) {
            Logger.getLogger(ExampleBean.class.getName()).log(Level.SEVERE, null, ex);
            return new ArrayList<>();
        }
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
