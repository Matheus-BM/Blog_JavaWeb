package br.com.mariojp.blog.controller;

import java.io.IOException;
import java.util.List;

import br.com.mariojp.blog.model.Post;
import br.com.mariojp.blog.pesistencia.PostDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/index"})
public class ListarPostController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PostDAO dao = new  PostDAO();
		List<Post> lista = dao.listar();
		req.setAttribute("lista", lista);
		RequestDispatcher dispatcher  = req.getRequestDispatcher("./WEB-INF/index.jsp");
		dispatcher.forward(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String p1 = req.getParameter("titulo");
		String p2 = req.getParameter("texto");
		String p3 = req.getParameter("autor");
		req.getSession().setAttribute("texto", p2);
		req.getSession().getServletContext().setAttribute("autor", p3);
		System.out.println(p1 +" "+p2+" "+" "+p3);
		//resp.getWriter().append(p1 +" "+p2+" "+" "+p3);
		resp.sendRedirect("recebe.jsp");
//		RequestDispatcher dispatcher  = req.getRequestDispatcher("./recebe.jsp");
//		dispatcher.forward(req, resp);
	}
}
