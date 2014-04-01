/*************************************** Metainformação de desenvolvimento **********************************************************/

/* A minha idéia inicial é criar uma ficha catalográfica altamente flexivel para se adaptar as necessidades
de variação destas (usar um separador "\" para separar ítens) , e armazenar como um tipo String, porém manter ítens essenciais em campos distintos(como por exemplo, autor, titulo e informações complementares) para facilitar o processo de busca e evitar replicação de 
termos (por exemplo, repetir a palavra autor, ou título). Para a busca se tornar completa, pensei em criar aliases onde necessário (por ex. Variantes do nome do autor/autores). Talvez exista uma técnica mais eficiente de fazer isso e que possa ser facilmente implementada em banco de dados ... (?)  

Ainda não pensei quais métodos vou implementar.

- Farias(usuário github/farias01)
*/  

/* Na descrição pensei em colocar um campo autor, um campo aliases de autor (para facilitar o processo de busca) podendo conter variantes do nome do autor além de co-autores, titulo (titulo stricto senso), edição, volume, coleção, data, ficha-resumo, controle de vocabulario, observações particulares, tradutor, titulo original, editora original p/obras traduzidas, id do autor (essa eu "inventei"), etc. (aberto para sugestões).
Na ficha resumo pode-se utilizar o sistema de contra-barra "\" da mesma forma que é utilizado no sistema TeX.
Esta ficha resumo poderá conter informações adicionais, como por exemplo editora, reimpressão, tradução de, tradutor, etc. Tais quais aparecem na ficha do livro)
Vou ter que estudar mais sobre o sistema de controle de vocabulário. Uma boa possibilidade é usar o LCSH. Parte do texto da wikipedia esta transcrito a seguir :
"The Library of Congress Subject Headings (LCSH) comprise a thesaurus (in the information science sense, a controlled vocabulary) of subject headings, maintained by the United States Library of Congress, for use in bibliographic records. LC Subject Headings are an integral part of bibliographic control, which is the function by which libraries collect, organize and disseminate documents. LCSHs are applied to every item within a library’s collection, and facilitate a user’s access to items in the catalogue that pertain to similar subject matter." I

Cabe distinguir que cada coleção de livros é unica, podendo adotar seu próprio sistema de classificação, não havendo uma classificação definitiva (ainda).

O fato de usar classes aninhadas é para facilitar a legibilidade do código, sendo que isso não irá afetar em nada a estrutura do banco de dados (eu espero)

Um método interessante para esta classe é a cópia, pois facilita a edição de coleções e multiplos exemplares.

- Farias(usuário github/farias01)
*/  

/* Como a classe original estava muito grande, dificultando o trabalho, separei a declaração dos atributos e denominei de "DadosDescricao" enquanto a classe "Descricao" é uma classe filha que implementara os métodos.

- Farias(usuário github/farias01)
*/  


/* Cada vez que editar este arquivo (a parte do código) coloque a tua idéia acima desta linha e "assine". Não altere as postagens anteriores
da "Metainformação de desenvolvimento" inclusive as tuas próprias. - Separe cada postagem usando /*postagem* / ao invés de //   */



/***************************************               Código              **********************************************************/

// Para compatibilidade com sistemas de arquivos que não suportam utf-8 mantemos os nomes das classes restritos aos caracteres ASCII
// Apenas implementa os métodos que controlam os atributos da classe DadosDescricao

class Descricao extends DadosDescricao {
	
}	



	
