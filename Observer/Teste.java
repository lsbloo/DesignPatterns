package main;

import Observer.Assinantes;
import Observer.RevistaInformatica;
import Observer.AssinantesRicos;

public class Teste {
	
	
	public static void main(String args[]) {
		
		int novaEdicao = 10;
		
		RevistaInformatica revistaInformatica = new RevistaInformatica();
		Assinantes a1 = new Assinantes(revistaInformatica);
		AssinantesRicos a2 = new AssinantesRicos(revistaInformatica);
		
		revistaInformatica.setNovaEdicao(novaEdicao);
	}

}
