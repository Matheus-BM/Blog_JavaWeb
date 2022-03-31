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

@WebServlet(urlPatterns = {"/post"})
public class CreatePostController extends HttpServlet{
	
	private PostDAO dao = new  PostDAO();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher  = req.getRequestDispatcher("./WEB-INF/form.jsp");
		dispatcher.forward(req, resp);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String titulo = req.getParameter("titulo");
		String texto = req.getParameter("texto");
		String autor = req.getParameter("autor");
		Post post = new Post();
		post.setTexto(texto);
		post.setTitulo(titulo);
		post.setAutor(autor);
		dao.save(post);		
		resp.sendRedirect("index");
//		List<Post> lista = dao.listar();
//		req.setAttribute("lista", lista);
//		RequestDispatcher dispatcher  = req.getRequestDispatcher("./WEB-INF/index.jsp");
//		dispatcher.forward(req, resp);
	}
}
