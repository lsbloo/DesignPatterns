package Observer;

import java.util.Observable;
import java.util.Observer;

public class Assinantes implements Observer{

	/*
	 * implementa a interface observer que tem um metodo
	 * update(Parametro1 o Subject para esse observer, Parametro2 os Args do OBJC): 
	 */
	Observable revistaInformatica;
	
	private int edicaoNovaRevista;
	
	@Override
	public void update(Observable revistaInfSubject, Object arg1) {
		// TODO Auto-generated method stub
		
		if(revistaInfSubject instanceof RevistaInformatica) {
			/*
			 * faz o cast para o subject e recupera o valor;
			 * do attr atualizado;
			 */
			RevistaInformatica revistaInformatica = (RevistaInformatica)
					revistaInfSubject ;
			edicaoNovaRevista = revistaInformatica.getEdicao();
			
			System.out.println("ja chegou mais uma edicao numero: " +edicaoNovaRevista);
		}
		
	}
	
	/**
	 * Na construção do observer é esperado um subject para o mesmo;
	 * @param revistaInformatica
	 */
	public Assinantes(Observable revistaInformatica) {
		this.revistaInformatica=revistaInformatica;
		revistaInformatica.addObserver(this);
	}
	
	
	
	

}
