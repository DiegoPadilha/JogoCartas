package com.diego.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CartaBean {

	private String numero;
	private String naipe;

	public CartaBean() {
	}
	
	public CartaBean(String numero, String naipe) {
		this.numero = numero;
		this.naipe = naipe;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getNaipe() {
		return naipe;
	}

	public void setNaipe(String naipe) {
		this.naipe = naipe;
	}

}
