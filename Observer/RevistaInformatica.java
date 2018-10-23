package Observer;
import java.util.Observable;
import java.util.Observer;

public class RevistaInformatica extends Observable{
	/**
	 * Definiçao do Subject(sujeito):
	 * dois metodos da classe Observable:
	 * 	- setChanged();
	 * 	 -notifyObservers();
	 *define internamente, como é atualização dos objetos(observers)
	 *	-o notify serve para atualizar os observers();
	 *	-ja o setchanged carrega as mudanças internas dos objetos
	 *	- é necessario que a ordem de chamada desses metodos seja igual ao exemplo
	 *	- o padrao observer: tem um tipo de relação: um pra muitos
	 *	- um subject pode ter varios observer;
	 *
	 */
	private int edicao;
	
	public void setNovaEdicao(int novaEdicao) {
		this.edicao=novaEdicao;
		
		setChanged();
		notifyObservers();
	}
	
	public int getEdicao() {
		return this.edicao;
	}
	
	
	
	
}
