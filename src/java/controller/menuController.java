/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.category;
import model.product;

/**
 *
 * @author os
 */
public class menuController extends HttpServlet {

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
        //String cateID = request.getParameter("cId");
        DAO dao = new DAO();
        List<product> list = dao.getAllStarted();
        List<product> listM = dao.getAllMainDish();
        List<product> listD =dao.getAllDessert();
        List<product> listDr = dao.getAllDrinks();
        List<category> listC = dao.getAllCategory();
        List<product> listNewS = dao.getNewDish("1");
        List<product> listNewM = dao.getNewDish("2");
        List<product> listNewD = dao.getNewDish("3");
        List<product> listNewDr = dao.getNewDish("4");
        
        request.setAttribute("listNewS", listNewS);
        request.setAttribute("listNewM", listNewM);
        request.setAttribute("listNewD", listNewD);
        request.setAttribute("listNewDr", listNewDr);
        request.setAttribute("listS", list);
        request.setAttribute("listM", listM);
        request.setAttribute("listD", listD);
        request.setAttribute("listDr", listDr);
        request.setAttribute("listC", listC);
        request.getRequestDispatcher("menu.jsp").forward(request, response);
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
