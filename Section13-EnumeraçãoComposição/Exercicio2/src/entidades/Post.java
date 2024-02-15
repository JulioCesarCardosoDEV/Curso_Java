package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private Date momento;
	private String titulo;
	private String contato;
	private Integer curtidas;
	
	List<Comentario> comentarios = new ArrayList<>();
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	public Post() {
		
	}
	
	public Post(Date momento, String titulo, String contato, Integer curtidas) {
		this.momento = momento;
		this.titulo = titulo;
		this.contato = contato;
		this.curtidas = curtidas;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public Integer getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(Integer curtidas) {
		this.curtidas = curtidas;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}
	
	public void adicionarComentario(Comentario comentario) {
		comentarios.add(comentario);
	}
	
	public void removerComentario(Comentario comentario) {
		comentarios.remove(comentario);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(titulo + "\n");
		sb.append(curtidas);
		sb.append(" Curtidas - ");
		sb.append(sdf.format(momento) + "\n");
		sb.append(contato + "\n");
		sb.append("Comentários: \n" );
		for(Comentario c : comentarios) {
			sb.append(c.getTexto() + "\n");
		}
		return sb.toString();
	}
	
}
