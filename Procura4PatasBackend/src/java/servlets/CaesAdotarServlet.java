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
import org.orm.PersistentSession;
import procura4patas.Animal;
import representations.AnimalRepresentation;
import src.P4P;
import src.Util;

/**
 *
 * @author sofia
 */
@WebServlet(name = "CaesAdotarServlet", urlPatterns = {"/CaesAdotar"})
public class CaesAdotarServlet extends HttpServlet {

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
        
            response.setContentType("application/json");
            response.addHeader("Access-Control-Allow-Origin", "*");
            response.addHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
            response.addHeader("Access-Control-Allow-Methods", "GET,PUT,POST,DELETE,OPTIONS");
            response.addHeader("Access-Control-Allow-Headers", "Content-Type, Authorization, Content-Length, X-Requested-With");
            
            PersistentSession session = Util.getSessionWithoutAut(request);
            List caesAdotar = P4P.getCaesAdotar(session);
            
            PrintWriter out = response.getWriter();           
            out.println("{ \"caes\" :");
            out.println("[");
                    
            for(int i=0; i<caesAdotar.size(); i++){
                Animal cao = (Animal) caesAdotar.get(i);
                
                out.print(new AnimalRepresentation(cao.getID(), cao.getNome(), cao.getFotografia(), cao.getSexo(), 
                            cao.getIdade(), cao.getRaça(), cao.getPorte(), cao.getCorPelo(),  cao.getCompPelo(), cao.getEstado(),
                            cao.getDescricao(), cao.getConcelho(), cao.getDiscriminator()));
                
                if(i<=caesAdotar.size()-1) out.println(",");
            }
            
            out.println("]");
            out.println("}");
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

}
