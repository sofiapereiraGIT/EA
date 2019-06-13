/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.orm.PersistentSession;
import procura4patas.Procura4patasPersistentManager;

/**
 *
 * @author davidsousa
 */
public class Util {
    public static PersistentSession getSession(HttpServletRequest request) {
        HttpSession httpSession = request.getSession();
        PersistentSession session = null;
        try {
            Object hsession = httpSession.getAttribute("hsession");
            if(hsession!=null) {
                System.out.println("Reusing persistent session");
                session = (PersistentSession) hsession;
            } else {
                System.out.println("Creating new persistent session");
                session = Procura4patasPersistentManager.instance().getSession();
                request.getSession().setAttribute("hsession", session);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return session;
    }
}
