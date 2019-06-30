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
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import procura4patas.Canil;
import src.P4P;
import src.Util;

/**
 *
 * @author salete
 */
@WebServlet(name = "CanisServlet", urlPatterns = {"/Canis"})
public class CanisServlet extends HttpServlet {

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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("application/json");
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        response.addHeader("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE,OPTIONS");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type, Authorization, Content-Length, X-Requested-With");
    
        PersistentSession session;
        String email = request.getParameter("email");
    
        if(email  ==  null) {
            session = Util.getSessionWithoutAut(request);
        } else {
            session = Util.getSession(request, email);
        }

        List<Canil> canis = P4P.getCanis(session);
        
        session.clear();
        
        JSONArray array = new JSONArray();

        for(Canil c: canis){
            JSONObject result = new JSONObject();
            result.put("email", c.getEmail());
            result.put("password", c.getPassword());
            result.put("nome", c.getNome());
            result.put("fotografia", c.getFotografia());
            result.put("concelho", c.getConcelho());
            result.put("morada", c.getMorada());
            result.put("telemovel", c.getTelemovel());
            result.put("descricao", c.getDescricao());
            result.put("horario", c.getHorario());
            result.put("site", c.getSiteOficial());
            result.put("facebook", c.getFacebook());
            result.put("instagram", c.getInstagram());
            
            array.add(result);
        } 

        PrintWriter out = response.getWriter();
           out.println(array);
           out.flush();
           out.close();
    }
    
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
