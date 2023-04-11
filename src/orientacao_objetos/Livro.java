package orientacao_objetos;

public class Livro { //criando a classe "Livro"
	
	String nome;
	String descricao;
	String autor;
	String isbn;
	double preco;
	String dataPub;

	void dadosLivros() {
		System.out.println("Nome do livro: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Preço: " + preco);
		System.out.println("Autor: " + autor);
		System.out.println("Data de publicação: " + dataPub);
		System.out.println("ISBN: " + isbn + "\n");

	}

}
