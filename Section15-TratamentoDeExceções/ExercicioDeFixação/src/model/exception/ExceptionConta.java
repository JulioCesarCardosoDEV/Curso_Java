package model.exception;

public class ExceptionConta extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ExceptionConta(String mensagem) {
		super(mensagem);
	}
}
