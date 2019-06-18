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
import org.orm.PersistentSession;
import src.P4P;
import src.Util;

/**
 *
 * @author sofia
 */
@WebServlet(name = "UpdateAnimalServlet", urlPatterns = {"/UpdateAnimal"})
public class UpdateAnimalServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            response.setContentType("application/json");
            response.addHeader("Access-Control-Allow-Origin", "*");
            response.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
            response.addHeader("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE,OPTIONS");
            response.addHeader("Access-Control-Allow-Headers", "Content-Type, Authorization, Content-Length, X-Requested-With");

            String body = request.getReader().lines().reduce("", (accumulator, actual) -> accumulator + actual);
            System.out.println("Recebido BODY\n" + body);
            
            JSONParser parser = new JSONParser();
            JSONObject json = (JSONObject) parser.parse(body);

            String UtilizadorEmail = (String) json.get("email");
            System.out.println((json.get("ID")).getClass());
            String nome = (String) json.get("Nome");
            String fotografia = (String) json.get("Fotografia");
            char sexo = ((String) json.get("Sexo")).charAt(0);
            char idade = ((String) json.get("Idade")).charAt(0);
            String raca = (String) json.get("Raca");
            char porte = ((String) json.get("Porte")).charAt(0);
            String corPelo = (String) json.get("CorPelo");
            char compPelo = ((String) json.get("CompPelo")).charAt(0);
            char estado = ((String) json.get("Estado")).charAt(0);
            String descricao = (String) json.get("Descricao");
            String concelho = (String) json.get("Concelho");
            char discriminator = ((String) json.get("Discriminator")).charAt(0);
            
            PersistentSession session = Util.getSession(request, UtilizadorEmail);
            //boolean criado = P4P.updateAnimal(session, 203, nome, fotografia, sexo, idade,
            //        raca, porte, corPelo, compPelo, estado, descricao, concelho, discriminator);
                
            //out.println("{ \"msg\": "+criado+"}");
            out.flush();
            out.close();
        
        } catch (Exception ex) {
            Logger.getLogger(AddAnimalServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            throws ServletException, IOException {
        processRequest(request, response);
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
        processRequest(request, response);
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