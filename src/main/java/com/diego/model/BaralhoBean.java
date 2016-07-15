package com.diego.model;

public class BaralhoBean {

	private CartaBean[] cartas;

	public BaralhoBean() {
		String numeros[] = new String[14];
		String naipes[] = new String[4];
		
		naipes[0] = "Copas ♥";
		naipes[1] = "Ouros ♦";
		naipes[2] = "Paus ♣";
		naipes[3] = "Espadas ♠";

		cartas = new CartaBean[54];
		int pos = 0;

		for (int x = 0; x < 14; x++) {
			switch (x) {
			case (0):
				numeros[0] = "A";
				break;
			case (10):
				numeros[10] = "J";
				break;
			case (11):
				numeros[11] = "Q";
				break;
			case (12):
				numeros[12] = "K";
				break;
			default:
				numeros[x] = Integer.toString(x + 1);
				break;
			}
		}

		for (int x = 0; x < 4; x++) {
			for (int j = 0; j < 13; j++) {
				cartas[pos] = new CartaBean(numeros[j], naipes[x]);
				pos++;

			}
		}
		cartas[pos++] = new CartaBean("Coringa","");
		cartas[pos++] = new CartaBean("Coringa","");
	}

	public CartaBean[] getCartas() {
		return cartas;
	}

}