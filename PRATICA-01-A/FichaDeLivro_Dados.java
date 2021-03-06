class FichaDeLivro_Dados {
	
// Bloco de Descrição
	protected String autor;
	protected String autor_aliases; // Serve para adicionar igualmente co-autores.
	protected Double id_autor_principal; // número de identificação do autor principal. Sugere metodo de preenchimento automatico do autor
	protected String serie;	// Para o caso de coleções
	protected String titulo; // Titulo da obra
	protected String subtitulo; // Para o caso de coleções. Em certas coleções da mir havia (e há ...?) sub sub volumes.	
	protected String titulo_original; // Para obras traduzidas
	protected int volume; // Para o caso de coleções
	protected int edicao;  // Número da edição
	protected String editora; 	
        protected String local_de_edicao;	
	protected String tradutor; // Neste caso é melhor não misturar com o autor.
	protected int num_exemplar; // Para o caso de se possuir mais de um exemplar. numero do exemplar.
	protected int formato; // Para distinguir formato eletronico do impresso
	protected String acompanhamento; // Para informar se uma midia tipo CD, DVD, poster, etc. acompanha o impresso e sua descrição.
	protected String observacoes; // Informações adicionais
	protected int data_publicacao;  // Data da publicação



}	
