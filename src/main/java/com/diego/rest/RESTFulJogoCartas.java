package com.diego.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.diego.comum.CartasException;
import com.diego.model.CartaBean;
import com.diego.service.BaralhoService;

@Path("/")
public class RESTFulJogoCartas {
		
		@GET
		@Path("/{qtdCartas}")
		@Produces(MediaType.APPLICATION_XML)
		public List<CartaBean> getCartasInXML(@PathParam("qtdCartas") int qtd) {
			
			BaralhoService serv = new BaralhoService();
			
			try {
				return serv.processarCartas(qtd);
			} catch (CartasException e) {
				// TODO Auto-generated catch block
				throw new WebApplicationException(Response.  
                        status(Response.Status.OK).
                        type(MediaType.TEXT_PLAIN).
                        entity(e.getMessage()).  
                        build());
			}
			
		}
		
}