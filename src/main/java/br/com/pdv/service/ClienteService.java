package br.com.pdv.service;

import br.com.pdv.dto.ClienteDto;

public class ClienteService extends ClienteDto{
	
	ClienteDto cli;
	
	public boolean validar(ClienteDto cli) {
		
		return (!(cli.getIdCliente() == 2)) ? true : false;
		
	}

}
