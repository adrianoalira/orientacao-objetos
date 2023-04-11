package orientacao_objetos;

public class Princial {

	public static void main(String[] args) {
		
		Livro livro = new Livro(); //Aqui eu usei a classe "Livro" para criar o objeto "livro"

		livro.nome = "Bíblia";
		livro.descricao = "Livro teste!";
		livro.isbn = "97867186617";
		livro.preco = 45.95;
		livro.autor = "Adriano Lira";
		livro.dataPub = "20/04/2017";

		livro.dadosLivros();
	}

}
