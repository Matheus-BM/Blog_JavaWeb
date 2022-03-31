package br.com.ucsal.blog.services;

import br.com.ucsal.blog.model.Usuario;
import br.com.ucsal.blog.pesistencia.UsuarioDAO;

public class LoginService {

	UsuarioDAO usuarioDAO = new UsuarioDAO();
	
	public boolean autenticar(Usuario usuario) {
		return (usuarioDAO.buscarPorUsuarioSenha(usuario) != null);
//		return (usuario.getUsuario().equals(usuario.getSenha())); 
	}
}
