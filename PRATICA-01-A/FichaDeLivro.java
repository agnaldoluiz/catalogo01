//é legal colocar public antes pra mostrar que a classe é pública
class FichaDeLivro extends FichaDeLivro_Dados {
	
	//Está faltando os atributos. Dica: autor, título, ISBN (não verifiquei a classe mãe ainda)
	

// Pergunta: um método que retorna void é finalizado com return ?
// Resposta: Não necessáriamente. Eu contudo recomendo que seja utilizado o return pois é boa pratica de programação. Note que mais de um 
// return pode ser utilizado para finalizar o método.
	//Na prática eu nunca vi muita gente usando não, mas sinta-se a vontade.

// Método escreveAutor. Serve para preencher o nome do autor na ficha.
	//Pq não fazer um construtor?
	//faltou dizer se é público
	void escreveAutor(String autor) {
		this.autor = autor;
		return;
	}
// Método leAutor. Serve para ler o nome do autor na ficha.
//só faltou o public

	String leAutor() {
		return this.autor;
	}

}
