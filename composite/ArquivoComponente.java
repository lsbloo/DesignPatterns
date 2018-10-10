package composite;

public abstract class ArquivoComponente {
	
	/*
	 * Define a entidade de componetes que pode ser qualquer tipo de arquivos;
	 * Cria uma arvore de sub entidades derivada desse Arquivo:
	 * Exemplo: Um ComponenteAquivo pode ser qualquer tipo de arquivo seja (foto,video,txt).etc;
	 * 
	 */
	
	public String nomeArquivo;

	public String getNomeArquivo() {
		return nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	public void printnomearquivo() {
		System.out.println(this.nomeArquivo);
	}
	

}
