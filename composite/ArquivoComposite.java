package composite;

import java.util.ArrayList;
import java.util.List;
public class ArquivoComposite extends ArquivoComponente{

	
	/*
	 * Cria as operacoes de qualquer arquivoComponente seja ele (foto,video,txt)
	 * Lista de arquivosComponentes (pode conter, mas nao necessariamente) qualquer tipo de arquivo;
	 */
	protected List<ArquivoComponente> arquivos_lista;
	
	
	public ArquivoComposite(String nomearquivo) {
		this.nomeArquivo=nomearquivo;
		arquivos_lista = new ArrayList<ArquivoComponente>();
	}
	
	
	public void adicionar(ArquivoComponente arq) {
		this.arquivos_lista.add(arq);
	}
	
	@Override
	public void printnomearquivo() {
		for(int i =0 ; i < arquivos_lista.size();i++) {
			System.out.println("Componente de Arquivo: "+ arquivos_lista.get(i).getNomeArquivo() + "\n" +
		  "\n Dentro da Pasta"+this.nomeArquivo);
		}
	}
	
}
