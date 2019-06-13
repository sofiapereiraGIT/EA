/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import beans.ExampleBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import procura4patas.Canil;

/**
 *
 * @author carlos
 */
@WebServlet(name = "Canis", urlPatterns = {"/Canis"})
public class ExemploServlet extends HttpServlet {
    @EJB
    private ExampleBeanLocal exampleBean;
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
            throws ServletException, IOException 
    {
        
        System.out.println("Boas");
        
        List x = exampleBean.businessMethod();
        
        System.out.println("X = " + x);
        
        
        Canil c = new Canil();
        c.setE_mail("boas");
        
        try {
            response.setContentType("application/json");
            response.addHeader("Access-Control-Allow-Origin", "*");
            PrintWriter out = response.getWriter();
            out.println("{");
            out.println("First Name: Devesh,");
            out.println("Last Name: Sharma");
            out.println("}");
            out.flush();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*
        String json = "{name:John,age:30,city:New York}";
        
        String x2 = "{ boas }";
        
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        
        try {
            PrintWriter out = response.getWriter();
            out.print(json);
            out.flush();
        } catch (Exception e) {
            System.out.println(e);
        }
        */
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
        String email = request.getParameter("email");
        System.out.println(email);
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
