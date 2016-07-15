package com.diego.model;

import com.diego.bo.AcessoBaralhoBO;

import junit.framework.TestCase;

public class BaralhoTeste extends TestCase {
	
	AcessoBaralhoBO acao;
	
	public void testTotalCartas(){
		acao = new AcessoBaralhoBO();
		
		assertEquals(54, acao.getBaralhoBean().getCartas().length);
	}
	
	public void testeTotalCartasOuros(){
		acao = new AcessoBaralhoBO();
		
		CartaBean[] card = acao.getBaralhoBean().getCartas();
		int qtd = 0;
		int expResultado = 13;
		
	    for (int i=0; i<54;  i++){
               if(card[i].getNaipe() == "Ouros ♦"){  
            	   qtd++;
               }  
        }
		
		assertEquals(expResultado, qtd);
	}
	
	public void testeTotalCartasPaus(){
		acao = new AcessoBaralhoBO();
		
		CartaBean[] card = acao.getBaralhoBean().getCartas();
		int qtd = 0;
		int expResultado = 13;
		
	    for (int i=0; i<54;  i++){
               if(card[i].getNaipe() == "Paus ♣"){  
            	   qtd++;
               }  
        }
		
		assertEquals(expResultado, qtd);
	}
	
	public void testeTotalCartasEspadas(){
		acao = new AcessoBaralhoBO();
		
		CartaBean[] card = acao.getBaralhoBean().getCartas();
		int qtd = 0;
		int expResultado = 13;
		
	    for (int i=0; i<54;  i++){
               if(card[i].getNaipe() == "Espadas ♠"){  
            	   qtd++;
               }  
        }
		
		assertEquals(expResultado, qtd);
	}
	
	public void testeTotalCartasCopas(){
		acao = new AcessoBaralhoBO();
		
		CartaBean[] card = acao.getBaralhoBean().getCartas();
		int qtd = 0;
		int expResultado = 13;
		
	    for (int i=0; i<54;  i++){
               if(card[i].getNaipe() == "Copas ♥"){  
            	   qtd++;
               }  
        }
		
		assertEquals(expResultado, qtd);
	}
	
	public void testeTotalCoringas(){
		acao = new AcessoBaralhoBO();
		
		CartaBean[] card = acao.getBaralhoBean().getCartas();
		int qtd = 0;
		int expResultado = 2;
		
	    for (int i=0; i<54;  i++){
               if(card[i].getNumero() == "Coringa"){  
            	   qtd++;
               }  
        }
		
		assertEquals(expResultado, qtd);
	}
}
