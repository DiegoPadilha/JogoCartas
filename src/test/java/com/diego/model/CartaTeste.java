package com.diego.model;

import junit.framework.TestCase;

public class CartaTeste extends TestCase {
	CartaBean carta;
	
	public void testNome() {
		carta = new CartaBean();

		String expResultado = "10";
		carta.setNumero(expResultado);

		assertEquals(expResultado, carta.getNumero());
	}

	public void testNaipe() {
		carta = new CartaBean();

		String expResultado = "Copas ♥";
		carta.setNaipe(expResultado);

		assertEquals(expResultado, carta.getNaipe());
	}

}
