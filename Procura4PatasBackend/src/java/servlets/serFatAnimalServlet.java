/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.orm.PersistentSession;
import procura4patas.Pedido;
import src.P4P;
import src.Util;

/**
 *
 * @author davidsousa
 */
@WebServlet(name = "serFatAnimalServlet", urlPatterns = {"/serFatAnimal"})
public class serFatAnimalServlet extends HttpServlet {

    
    @Override
    protected void doOptions(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException
    {        
        response.setStatus(HttpServletResponse.SC_OK);
        response.setContentType("application/json");
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        response.addHeader("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE,OPTIONS");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type, Authorization, Content-Length, X-Requested-With");
        
        PrintWriter out = response.getWriter();
        out.flush();
        out.close();
    }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {}

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
        try(PrintWriter out = response.getWriter()) {
            
        response.setContentType("text/html;charset=UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.setContentType("application/json");
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        response.addHeader("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE,OPTIONS");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type, Authorization, Content-Length, X-Requested-With");
        
        String body = request.getReader().lines().reduce("", (accumulator, actual) -> accumulator + actual);
        
        JSONParser parser = new JSONParser();
        JSONObject json;
        json = (JSONObject) parser.parse(body);
        
         // Neste caso representa o email da pessoa que possui o animal
        String email = (String) json.get("email");
        
        // Neste caso o emailUtilComum é quem está loggado, representa a pessoa quer adotar.
        String emailUtilComum  = (String) json.get("emailUtilComum");
        int id = ((Long) json.get("ID")).intValue();
        
        PersistentSession session = Util.getSession(request, emailUtilComum);
        
        List<Pedido> pedidos =  P4P.getPedidosUser(session, email);
        
        boolean adotado = false;
        boolean possui = true;
        
        if(pedidos!=null) {
            for(Pedido p :  pedidos) {
                if( p.getAnimal().getID() == id) {
                    possui = false;
                    break;
                }
            }
        }
        
        session.clear();
        
        if(possui) {
            adotado = P4P.serFatAnimal(session, email, emailUtilComum, id); 
        }
  
         out.println("{ \"msg\": "+adotado+",\"possui\": "+possui+"}");
         out.flush();
         out.close();
        
        } catch (ParseException ex) {
            Logger.getLogger(AdotarAnimalServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
