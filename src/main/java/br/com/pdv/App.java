package br.com.pdv;

import br.com.pdv.bean.ParceiroBean;


public class App 
{
    public static void main( String[] args )  {
    	
    	ParceiroBean bean = new ParceiroBean();
    	
    	bean.setNmParceiro("Kaio");
    	bean.setNmEmail("Kaio_cesar99@hotmail.com");
    	bean.setNrTelefone("954598166");
    	bean.setNrCNPJ("11111110051815");
    	bean.setNmSegmento("Atacadista");
    	bean.setNrCelular("9548585451");
    	bean.setNrCep("11512151");
    	bean.setNmEndereco("RUA EBIX");
    	bean.gravar();
    		
    }
}
