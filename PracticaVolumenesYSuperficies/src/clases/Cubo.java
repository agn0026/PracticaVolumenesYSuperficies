package clases;

public class Cubo {
	private int lado;
	
	/**
	 * Crea un cubo con el lado especificado en metros
	 *
	 * @param lado
	 */
	public Cubo(int lado) {
		this.lado = lado;
	}
	
	/**
	 * Crea un cubo con el lado de 1 metros
	 * 
	 * @param lado
	 */
	public Cubo() {
		this.lado = 1;
	}
	
	/**
	 * Calcula la superficie de un cubo
	 * 
	 * @return la superficie de un cubo en metros2
	 */
	public int superficie() {
		return (this.lado*this.lado)*6;
	}
	
	/**
	 * Calcula el volumen de un cubo
	 * 
	 * @return el volumen de un cubo en metros3
	 */
	public int volumen() {
		return (this.lado*this.lado*this.lado);
	}
}
