package ETS2;

public class Palindromo {
	private String palabra;
	
	public Palindromo(String palabra) {
		palabra = doPalindromo(palabra);
		this.palabra = palabra;
	}

	public String getPalabra() {
		return palabra;
	}

	public void setPalabra(String palabra) {
		palabra = doPalindromo(palabra);
		this.palabra = palabra;
	}
	
	private String doPalindromo(String palabra) {
		
		return "";
	}
}