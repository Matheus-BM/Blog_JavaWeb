package br.com.mariojp.blog.services;

import br.com.mariojp.blog.model.Usuario;
import br.com.mariojp.blog.pesistencia.UsuarioDAO;

public class LoginService {

	UsuarioDAO usuarioDAO = new UsuarioDAO();
	
	public boolean autenticar(Usuario usuario) {
		return (usuarioDAO.buscarPorUsuarioSenha(usuario) != null);
//		return (usuario.getUsuario().equals(usuario.getSenha())); 
	}
}
