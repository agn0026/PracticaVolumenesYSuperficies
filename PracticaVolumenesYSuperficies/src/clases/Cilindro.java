package clases;

public class Cilindro {
	private int radio;
	private int altura;
	
	/**
	 * Crea un cilindro con el radio y altura especificado en metros
	 * 
	 * @param radio
	 * @param altura
	 */
	public Cilindro(int radio, int altura) {
		this.radio = radio;
		this.altura = altura;
	}
	
	/**
	 * Crea un cilindro con el radio y altura de 1 metros
	 */
	public Cilindro() {
		this.radio = 1;
		this.altura = 1;
	}
	
	/**
	 * Calcula la superficie de un cilindro
	 * 
	 * @return la superficie de un cilindro en metros2
	 */
	public int superficie() {
		int superficie = (int)((2*3.14*(this.radio*this.radio))+(2*3.14*this.radio*this.altura));
		return superficie;
	}
	
	/**
	 * Calcula el volumen de un cilindro
	 * 
	 * @return el volumen de un cilindro en metros3
	 */
	public int volumen() {
		int volumen = (int)((3.14*(this.radio*this.radio))*this.altura);
		return volumen;
	}
	

}
