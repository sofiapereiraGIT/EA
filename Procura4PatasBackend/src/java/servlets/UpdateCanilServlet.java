/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
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
import src.P4P;
import src.Util;

/**
 *
 * @author salete
 */
@WebServlet(name = "UpdateCanilServlet", urlPatterns = {"/UpdateCanil"})
public class UpdateCanilServlet extends HttpServlet {
    @Override
    protected void doOptions(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            response.setContentType("application/json");
            response.addHeader("Access-Control-Allow-Origin", "*");
            response.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
            response.addHeader("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE,OPTIONS");
            response.addHeader("Access-Control-Allow-Headers", "Content-Type, Authorization, Content-Length, X-Requested-With");
             
            String body = request.getReader().lines().reduce("", (accumulator, actual) -> accumulator + actual);
            
            JSONParser parser = new JSONParser();
            JSONObject json = (JSONObject) parser.parse(body);
            
            String email = (String) json.get("email");
            String password = (String) json.get("password");
            String nome = (String) json.get("nome");
            String foto = (String) json.get("fotografia");
            String concelho = (String) json.get("concelho");
            String tlm = (String) json.get("telemovel");
            String descricao = (String) json.get("descricao");
            String morada = (String) json.get("morada");
            String horario = (String) json.get("horario");
            String site = (String) json.get("site");
            String face = (String) json.get("facebook");
            String insta = (String) json.get("instagram");
                    
            PersistentSession session = Util.getSession(request, email);
            
            if( email != null) {
                boolean criado = P4P.updateCanil(session, email, password, nome, foto, concelho, tlm, descricao, morada, horario, site, face, insta);
                
                if(criado) {
                   PrintWriter out = response.getWriter();
                   out.println("{ \"msg\": " + criado + "}");
                   out.flush();
                   out.close();
                } 
                else {
                    response.setStatus(HttpServletResponse.SC_NOT_FOUND);
                    PrintWriter out = response.getWriter();
                    out.flush();
                    out.close();
                }
            }
            else {
                response.setStatus(HttpServletResponse.SC_NOT_FOUND);
                PrintWriter out = response.getWriter();
                out.flush();
                out.close();
            }
            
        } catch (ParseException ex) {
            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            PrintWriter out = response.getWriter();
            out.flush();
            out.close();
        }
    }
}
