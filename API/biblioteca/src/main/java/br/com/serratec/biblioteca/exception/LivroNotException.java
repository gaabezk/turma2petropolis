package br.com.serratec.biblioteca.exception;

public class LivroNotException extends Exception {

	private String message;
	
	public LivroNotException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
