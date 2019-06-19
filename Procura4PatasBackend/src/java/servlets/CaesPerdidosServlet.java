/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.orm.PersistentSession;
import procura4patas.Animal;
import src.P4P;
import src.Util;

/**
 *
 * @author sofia
 */
@WebServlet(name = "CaesPerdidosServlet", urlPatterns = {"/CaesPerdidos"})
public class CaesPerdidosServlet extends HttpServlet {

 
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
            throws ServletException, IOException {
        
      
            response.setContentType("text/html;charset=UTF-8");
            response.setContentType("application/json");
            response.addHeader("Access-Control-Allow-Origin", "*");
            response.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
            response.addHeader("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE,OPTIONS");
            response.addHeader("Access-Control-Allow-Headers", "Content-Type, Authorization, Content-Length, X-Requested-With");
                
            PersistentSession session;
            String email = request.getParameter("email");
           
            
            if(email  ==  null ) {
                session = Util.getSessionWithoutAut(request);
            } else {
                session = Util.getSession(request, email);
            }            
            
            List<Animal> caesPerdidos = P4P.getCaesPerdidos(session);
            
            // Formar JSON
            JSONObject myJson = new JSONObject();         
            JSONArray ja = new JSONArray();
            
            for(Animal g : caesPerdidos) {
                JSONObject jsonObj = new JSONObject();   
                jsonObj.put("ID",g.getID());
                jsonObj.put("Nome",g.getNome());
                jsonObj.put("Fotografia", g.getFotografia());
                jsonObj.put("Sexo",g.getSexo());
                jsonObj.put("Idade",g.getIdade());
                jsonObj.put("Raca",g.getRaça());
                jsonObj.put("Porte",g.getPorte());
                jsonObj.put("CorPelo",g.getCorPelo());
                jsonObj.put("CompPelo",g.getCompPelo());
                jsonObj.put("Estado",g.getEstado());
                jsonObj.put("Descricao",g.getDescricao());
                jsonObj.put("Concelho",g.getConcelho());
                jsonObj.put("Discriminator",g.getDiscriminator());     
                ja.add(jsonObj);
            }
            
            myJson.put("caes", ja);
            
            // Enviar JSON
            PrintWriter out = response.getWriter();
            out.println(myJson);
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
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
}
