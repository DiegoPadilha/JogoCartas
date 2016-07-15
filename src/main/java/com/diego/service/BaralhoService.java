package com.diego.service;

import java.util.List;

import com.diego.bo.AcessoBaralhoBO;
import com.diego.comum.CartasException;
import com.diego.model.CartaBean;

public class BaralhoService {
	
	private AcessoBaralhoBO acoes;
	
	public BaralhoService() {
		acoes = new AcessoBaralhoBO();
	}
	
	public List<CartaBean> processarCartas(int qtd) throws CartasException{
		if (qtd > 54){
			throw new CartasException("O Baralho possui apenas 54 cartas. Por favor, refaça a sua consulta utilizando o limite de cartas disponíveis.");
		}
		acoes.embaralharCartas();
		return acoes.distribuirCartasQtd(qtd);
	}
	
}
