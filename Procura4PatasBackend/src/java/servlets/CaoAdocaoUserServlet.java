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
import javax.servlet.http.HttpSession;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import procura4patas.Animal;
import src.P4P;
import procura4patas.Procura4patasPersistentManager;
import procura4patas.Utilizador;
import procura4patas.UtilizadorDAO;
import src.Util;
/**
 *
 * @author davidsousa
 */
@WebServlet(name = "CaoAdocaoUserServlet", urlPatterns = {"/CaoAdocaoUser"})
public class CaoAdocaoUserServlet extends HttpServlet {
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
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        response.setContentType("application/json");
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
        response.addHeader("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE,OPTIONS");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type, Authorization, Content-Length, X-Requested-With");
        
        PersistentSession session;
        String email = request.getParameter("email");
        String emailQuemQuero = request.getParameter("emailQuemQuero");
        
        if(email  ==  null ) {
            session = Util.getSessionWithoutAut(request);
        } else {
            session = Util.getSession(request, email);
        }
        
        List<Animal> onlyDogs = P4P.getCaoAdocaoUser(session,emailQuemQuero);
        
        session.clear();
        
        // Enviar JSON ARRAY
        JSONObject myJson = new JSONObject();
        JSONObject jsonObjArr = new JSONObject();
        myJson.put("email", email);
        myJson.put("caes", null);
        JSONArray ja = new JSONArray();
        for(Animal g : onlyDogs) {
            
           jsonObjArr = new JSONObject();
           jsonObjArr.put("ID",g.getID());
           jsonObjArr.put("Nome",g.getNome());
           jsonObjArr.put("Fotografia", g.getFotografia());
           jsonObjArr.put("Sexo", String.valueOf(g.getSexo())  );
           jsonObjArr.put("Idade",String.valueOf(g.getIdade()));
           jsonObjArr.put("Raca",g.getRaça());
           jsonObjArr.put("Porte",String.valueOf(g.getPorte()));
           jsonObjArr.put("CorPelo",String.valueOf(g.getCorPelo()));
           jsonObjArr.put("CompPelo",String.valueOf(g.getCompPelo()));
           jsonObjArr.put("Estado",String.valueOf(g.getEstado()));
           jsonObjArr.put("Descricao",g.getDescricao());
           jsonObjArr.put("Concelho",g.getConcelho());
           jsonObjArr.put("Discriminator",String.valueOf(g.getDiscriminator()));     
           ja.add(jsonObjArr);   
        }
        
        myJson.put("caes", ja);
        
        // Enviar JSON ARRAY
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
            throws ServletException, IOException {}
}
