package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

import entidades.Comentario;
import entidades.Post;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Tenha uma boa viajem!");
		Comentario c2 = new Comentario("Uau, isso é incrível!");
		
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Viajando para Nova Zelandia", 
		"Vou visitar esse país maravilhoso", 12);
		
		p1.adicionarComentario(c1);
		p1.adicionarComentario(c2);
		
		System.out.println(p1);
		
		Comentario c3 = new Comentario("Boa noite!");
		Comentario c4 = new Comentario("Que Deus esteja com você!");
		Post p2 = new Post(
				sdf.parse("28/07/2018 23:14:19"), 
				"Boa noite pessoal", 
				"Vejo vocês amanhã", 
				5);
		p2.adicionarComentario(c3);
		p2.adicionarComentario(c4);
		
		System.out.println(p2);

	}

}
