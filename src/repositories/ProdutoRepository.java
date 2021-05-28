package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entities.Produto;
import interfaces.IProdutoRepository;

public class ProdutoRepository implements IProdutoRepository {

	private Connection connection;

	public ProdutoRepository(Connection connection) {
		this.connection = connection;
	}

	@Override
	public void inserir(Produto produto) throws Exception {
		String sql = "insert into produto(nome,preco,quantidade) values(?,?,?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, produto.getNome());
		statement.setDouble(2, produto.getPreco());
		statement.setInt(3, produto.getQuantidade());
		statement.execute();
		statement.close();
	}

	@Override
	public void alterar(Produto produto) throws Exception {
		String sql = "update produto set nome = ?, set preco = ?,set quantidade = ? where idProduto = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, produto.getNome());
		statement.setDouble(2, produto.getPreco());
		statement.setInt(3, produto.getQuantidade());
		statement.setInt(4, produto.getIdproduto());
		statement.execute();
		statement.close();

	}

	@Override
	public void excluir(Produto produto) throws Exception {
		String sql = "delete from produto where idProduto = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setInt(1, produto.getIdproduto());
		statement.execute();
		statement.close();
	}

	@Override
	public List<Produto> obterTodos() throws Exception {

		String sql = "select * from produto";
		PreparedStatement statement = connection.prepareStatement(sql);
		ResultSet result = statement.executeQuery();
		List<Produto> lista = new ArrayList<Produto>();

		while (result.next()) {
			Produto produto = new Produto();
			produto.setIdproduto(result.getInt("Idproduto"));
			produto.setNome(result.getString("nome"));
			produto.setPreco(result.getDouble("preco"));
			produto.setQuantidade(result.getInt("quantidade"));
			lista.add(produto);
		}

		return lista;
	}

}
