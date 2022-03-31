package br.com.mariojp.blog.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import br.com.mariojp.blog.model.Usuario;
import br.com.mariojp.blog.services.LoginService;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	private LoginService loginService = new LoginService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		RequestDispatcher dispatcher  = req.getRequestDispatcher("./login.jsp");
		dispatcher.forward(req, resp);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) 
			throws ServletException, IOException {
		String user = request.getParameter("user");
		String pass = request.getParameter("password");
		Usuario usuario = new Usuario(user,pass);		
		if(loginService.autenticar(usuario)) {;
			response.sendRedirect("/blog/post");
		}else {
			response.sendRedirect("/blog/login.jsp?erro=is-invalid");
		}		
		
	}



}
