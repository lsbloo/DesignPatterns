package Observer;

import java.util.Observable;
import java.util.Observer;

public class AssinantesRicos implements Observer{
	
	Observable revistaInformatica;

	private int edicaoNovaRevista;
	@Override
	public void update(Observable revistaInfSubject, Object arg1) {
		// TODO Auto-generated method stub
		
		if(revistaInfSubject instanceof RevistaInformatica) {
			RevistaInformatica revistaInformatica = (RevistaInformatica)
					revistaInfSubject;
			edicaoNovaRevista = ((RevistaInformatica) revistaInfSubject).getEdicao();
			
			System.out.println("Assinante Rico: ja chegou mais uma edicao numero: " +edicaoNovaRevista);
		}
		
	}
	
	public AssinantesRicos(Observable revistaInformatica) {
		this.revistaInformatica=revistaInformatica;
		revistaInformatica.addObserver(this);
		
		
	}

}
