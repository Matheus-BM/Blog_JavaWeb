package br.com.ucsal.blog.pesistencia;

import java.util.ArrayList;
import java.util.List;

import br.com.ucsal.blog.model.Post;

public class PostDAO {
	
	private static List<Post> posts = new ArrayList<Post>();
	
	static {
	
		posts.add(new Post("Post 1", "Texto 1", "Pedro"));
		posts.add(new Post("Post 2", "Texto 2", "Maria"));
		posts.add(new Post("Post 3", "Texto 3", "Pedro"));
		posts.add(new Post("Post 4", "Texto 4", "Maria"));

	}
	
	

	public List<Post> listar(){
		//consultar o banco
		return posts;
	}



	public void save(Post post) {
		posts.add(post);
	}
	
	
}
