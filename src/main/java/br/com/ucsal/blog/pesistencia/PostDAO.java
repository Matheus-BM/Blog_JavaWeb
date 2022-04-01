package br.com.ucsal.blog.pesistencia;

import java.util.ArrayList;
import java.util.List;

import br.com.ucsal.blog.model.Post;

public class PostDAO {
	
	private static List<Post> posts = new ArrayList<Post>();
	
	
	static {
	
		posts.add(new Post("Lorem Ipsum 2", "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...", "Pedro"));
		posts.add(new Post("Lorem Ipsum 2", "Quisque vestibulum arcu mollis orci malesuada interdum. Fusce accumsan in eros sed luctus.", "Maria"));
		posts.add(new Post("Lorem Ipsum 3", "Fusce ultrices, orci vitae lobortis dignissim, nisl tortor pulvinar lectus, a ultricies nisl dolor id ante.", "Pedro"));
		posts.add(new Post("Lorem Ipsum 4", "Pellentesque ornare diam justo, id imperdiet diam feugiat a. Integer commodo lobortis est.", "Maria"));

	}
	
	

	public List<Post> listar(){
		//consultar o banco
		return posts;
	}



	public void save(Post post) {
		posts.add(post);
	}
	
	
}
