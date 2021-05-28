package interfaces;

import java.util.List;

import entities.Produto;

public interface IProdutoRepository {
	
	void inserir(Produto produto)throws Exception;
	void alterar(Produto produto)throws Exception;
	void excluir(Produto produto)throws Exception;
	List<Produto> obterTodos()throws Exception;
}
