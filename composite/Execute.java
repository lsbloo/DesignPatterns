package composite;

public class Execute {
	
	
	public static void main(String args[]) {
		
		/*
		 * Dessa forma dizemos que: " foi criada uma hierarquia de objetos do tipo ArquivoComponente: "
		 * classe ABSTRATA: ARQUIVO COMPONENTE: implementa o comportamento padrao para a interface comum
		 * classe: Arquivo Composite: Cria as operacoes dos componentes "filhos", como tambem pode armazenar 
		 * componentes "filhos" no nosso caso um video ou uma foto;
		 * Classe Execute: e o cliente que pode manipular esses componentes 
		 */
		/*
		 * Hierarquia de Objetos:
		 * 	-: ArquivoComponente \/
		 * 	 		-; ArquivoCompositor
		 * 					-; ArquivoVideo
		 * 						-; ArquivoFoto;
		 */
		ArquivoComponente video = new ArquivoVideo("video 01");
		ArquivoComponente foto = new ArquivoFotos("foto png");
		ArquivoComposite pasta = new ArquivoComposite("pasta_de_arquivos");
		
		pasta.adicionar(video);
		pasta.adicionar(foto);
		pasta.printnomearquivo();
		
		
	}

}
