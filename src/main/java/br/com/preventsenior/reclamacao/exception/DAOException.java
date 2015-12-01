package br.com.preventsenior.reclamacao.exception;

public class DAOException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public DAOException(String mensagem, Throwable cause){
		super(mensagem, cause);
	}
	
	public DAOException(String mensagem){
		super(mensagem);
	}
	
	public DAOException(Throwable cause){
		super(cause);
	}
}
