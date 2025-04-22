package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Cilindro;
import clases.Cubo;

class TestCilindro {

	@Test
	void testSuperficie() {
		Cilindro c1 = new Cilindro (2, 2);
		//Calculamos la superficie que nos da el metodo
		int superficieObtenida = c1.superficie();
		//Hardcodeamos la superficie que sabemos que deberia dar
		int superficieEsperada = 50;
		assertEquals(superficieEsperada, superficieObtenida); //Si es correcto saldra verde sino rojo
	}

	@Test
	void testVolumen() {
		Cilindro c1 = new Cilindro (2, 2);
		//Calculamos el volumen que nos da el metodo
		int volumenObtenida = c1.volumen();
		//Hardcodeamos el volumen que sabemos que deberia dar
		int volumenEsperada = 25;
		assertEquals(volumenEsperada, volumenObtenida); //Si es correcto saldra verde sino rojo
	}

}
