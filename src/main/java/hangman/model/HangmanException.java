package hangman.model;

public class HangmanException extends Exception {
	public static final String INVALIDO = "error, parametro negativo";
	public HangmanException(String mensaje){
		super(mensaje);
	}
}