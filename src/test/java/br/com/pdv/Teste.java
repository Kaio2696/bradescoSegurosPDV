package br.com.pdv;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.pdv.dto.ParceiroDto;
import br.com.pdv.service.ClienteService;

public class Teste {

	@Test
	public void test() {
	
		ClienteService serv;
		
		// CENARIO
		ParceiroDto cli = new ParceiroDto();
		cli.setIdCliente(1l);
	
		// AÇÃO
		// when(serv.validar(cli)).thenReturn();
		
		// RESULTADO
		assertTrue("ok", true);

	}
}
