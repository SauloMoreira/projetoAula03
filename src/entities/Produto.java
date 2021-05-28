package entities;

public class Produto {
	private Integer Idproduto;
	private String nome;
	private double preco;
	private Integer quantidade;

	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public Produto(Integer idproduto, String nome, double preco, Integer quantidade) {
		super();
		Idproduto = idproduto;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Integer getIdproduto() {
		return Idproduto;
	}

	public void setIdproduto(Integer idproduto) {
		Idproduto = idproduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [Idproduto=" + Idproduto + ", nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade
				+ "]";
	}

}
