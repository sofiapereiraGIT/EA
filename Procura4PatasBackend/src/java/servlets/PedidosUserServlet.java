/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
import org.orm.PersistentSession;
import procura4patas.Animal;
import procura4patas.Pedido;
import procura4patas.UtilizadorDAO;
import src.P4P;
import src.Util;

/**
 *
 * @author davidsousa
 */
@WebServlet(name = "PedidosUserServlet", urlPatterns = {"/PedidosUser"})
public class PedidosUserServlet extends HttpServlet {
    
    
    @Override
    protected void doOptions(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException
    {
        System.out.println("[OPTIONS] PASSEI AQUI 2");
        
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
                 System.out.println("Passei aqui!");
                 session = Util.getSessionWithoutAut(request);
            } else {
                 session = Util.getSession(request, email);
            }
            
            List<Pedido> onlyPedidos = P4P.getPedidosUser(session, emailQuemQuero);
            
            // Enviar JSON ARRAY
            JSONObject myJson = new JSONObject();
            JSONObject jsonObjArr = new JSONObject();
            myJson.put("email", email);
            myJson.put("pedidos", null);
            
            String pattern = "dd/MM/yyyy";
            DateFormat df = new SimpleDateFormat(pattern);
            
            
            JSONArray ja = new JSONArray();
            
            
            for(Pedido p : onlyPedidos) {
                
                jsonObjArr = new JSONObject();
                String animNome = p.getAnimal().getNome();
                String s = "Não";
                String nome = P4P.getUtilizador(session, email).getNome();
                
                if(p.getEstado() == 'A') {
                    s = "Sim";
                }
                
                jsonObjArr.put("ID",p.getID());
                jsonObjArr.put("UtilizadorEmail",""+p.getUtilizadorComum() );
                jsonObjArr.put("UtilizadorComumUtilizadorEmail", email);
                jsonObjArr.put("AnimalNome", animNome);
                jsonObjArr.put("PessoaNome", nome);
                jsonObjArr.put("Data", df.format(p.getData()));
                jsonObjArr.put("DataUltimoContacto", df.format(p.getDataUltimoContacto()));
                jsonObjArr.put("Discriminator",String.valueOf(p.getDiscriminator()));
                jsonObjArr.put("Estado",String.valueOf(p.getEstado()));  
                jsonObjArr.put("Adotado", s);
                ja.add(jsonObjArr);
            }
            
            myJson.put("pedidos", ja);
            System.out.println("JsonArray = " +  myJson.get("pedidos"));
            
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

}
