package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Cubo;

class TestCubo {

	@Test
	void testSuperficie() {
		Cubo c = new Cubo (2);
		//Calculamos la superficie que nos da el metodo
		int superficieObtenida = c.superficie();
		//Hardcodeamos la superficie que sabemos que deberia dar
		int superficieEsperada = 24;
		assertEquals(superficieEsperada, superficieObtenida); //Si es correcto saldra verde sino rojo
	}

	@Test
	void testVolumen() {
		Cubo c = new Cubo (2);
		//Calculamos el volumen que nos da el metodo
		int volumenObtenida = c.volumen();
		//Hardcodeamos el volumen que sabemos que deberia dar
		int volumenEsperada = 8;
		assertEquals(volumenEsperada, volumenObtenida); //Si es correcto saldra verde sino rojo
	}

}
