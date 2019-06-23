/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONObject;
import org.orm.PersistentSession;
import procura4patas.Animal;
import src.P4P;
import src.Util;

/**
 *
 * @author carlos
 */
@WebServlet(name = "AnimalServlet", urlPatterns = {"/Animal"})
public class AnimalServlet extends HttpServlet {

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
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        response.setContentType("application/json");
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        response.addHeader("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE,OPTIONS");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type, Authorization, Content-Length, X-Requested-With");
                
        PersistentSession session;
        String email = request.getParameter("email");
        int id = Integer.parseInt(request.getParameter("id"));

        if(email  ==  null ) {
            session = Util.getSessionWithoutAut(request);
        } else {
            session = Util.getSession(request, email);
        }
        
        Animal animal = P4P.getAnimal(session, id);
        String utilizadorEmail = P4P.getUtilizadorEmail(session, id);
        int usertype = P4P.getUserType(session, utilizadorEmail);
        
        JSONObject animalJson = new JSONObject();
        animalJson.put("ID",animal.getID());
        animalJson.put("Nome",animal.getNome());
        animalJson.put("Fotografia", animal.getFotografia());
        animalJson.put("Sexo", String.valueOf(animal.getSexo())  );
        animalJson.put("Idade",String.valueOf(animal.getIdade()));
        animalJson.put("Raca",animal.getRaça());
        animalJson.put("Porte",String.valueOf(animal.getPorte()));
        animalJson.put("CorPelo",String.valueOf(animal.getCorPelo()));
        animalJson.put("CompPelo",String.valueOf(animal.getCompPelo()));
        animalJson.put("Estado",String.valueOf(animal.getEstado()));
        animalJson.put("Descricao",animal.getDescricao());
        animalJson.put("Concelho",animal.getConcelho());
        animalJson.put("Discriminator",String.valueOf(animal.getDiscriminator()));
        animalJson.put("UtilizadorEmail", utilizadorEmail);
        animalJson.put("UserType", usertype);
        
        PrintWriter out = response.getWriter();
        out.println(animalJson);
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
            throws ServletException, IOException {}
}
