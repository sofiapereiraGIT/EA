/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import procura4patas.Procura4patasPersistentManager;

/**
 *
 * @author davidsousa
 */
public class Util {
    
    private static Map<String,PersistentSession> userSessions = new HashMap<>();
    
    public static void addSession(PersistentSession session, String email) {
       userSessions.put(email, session);
   }
    
    public static void removeSession(String email) {
       userSessions.remove(email);
   }
    
    public static PersistentSession getSession(HttpServletRequest request, String email) {
        
        PersistentSession session = null;
        
        try {
            session = userSessions.get(email);
            if(session!=null) {
                System.out.println("Reusing persistent session for user " + email);
            } else {
                System.out.println("Creating new persistent session for user " + email);
                session = Procura4patasPersistentManager.instance().getSession();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return session;
    }
    
    public static PersistentSession getSessionWithoutAut(HttpServletRequest request) {
            
        PersistentSession sessao = null;
        
        try {
            sessao = Procura4patasPersistentManager.instance().getSession();
        } catch (PersistentException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return sessao;
    }
}
