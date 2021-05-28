package main;

import javax.swing.JOptionPane;

import entities.Produto;
import factories.ConnectionFactory;
import repositories.ProdutoRepository;

public class Principal {

	public static void main(String[] args) {

		Produto produto = new Produto();
		try {
			JOptionPane.showMessageDialog(null, "Cadastro de Produtos - aula 03");
			produto.setNome(JOptionPane.showInputDialog("Informe o Nome do Produto:"));
			produto.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o Preço do Produto:")));
			produto.setQuantidade(Integer.parseInt(JOptionPane.showInputDialog("Informe o Quantidade do Produto:")));

			ConnectionFactory factory = new ConnectionFactory();
			ProdutoRepository repository = new ProdutoRepository(factory.getConnection());

			repository.inserir(produto);
			JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");

			System.out.println(repository.obterTodos());

		} catch (Exception e) {
			System.out.println("Erro!" + e.getMessage());
		}

	}

}
