package com.diego.bo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.diego.model.BaralhoBean;
import com.diego.model.CartaBean;

public class AcessoBaralhoBO {
	
	private BaralhoBean baralhoBean;
	
	public AcessoBaralhoBO() {
		super();
		this.baralhoBean = new BaralhoBean();
	}

	public void embaralharCartas() {
		for (int x1 = 0; x1 < 10; x1++) {
			for (int y1 = 0; y1 < 100; y1++) {
				CartaBean aux;
				int n1, n2;
				Random r = new Random();

				n1 = r.nextInt(54);
				n2 = r.nextInt(54);

				while (n1 == n2) {
					n2 = r.nextInt(54);
				}

				aux = baralhoBean.getCartas()[n1];
				baralhoBean.getCartas()[n1] = baralhoBean.getCartas()[n2];
				baralhoBean.getCartas()[n2] = aux;
			}
		}
	}
	
	public List<CartaBean> distribuirCartasQtd(int qtd) {
		List<CartaBean> listaCartas = new ArrayList<>();
		Map<String, CartaBean> mapCartas = new HashMap<String, CartaBean>();

		for (int x = 0; x < qtd; x++) {
			mapCartas.put(String.valueOf(x), baralhoBean.getCartas()[x]);
		}

		listaCartas.addAll(mapCartas.values());
		return listaCartas;
	}

	public BaralhoBean getBaralhoBean() {
		return baralhoBean;
	}
	
}
