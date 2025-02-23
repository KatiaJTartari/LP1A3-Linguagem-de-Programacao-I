package exercicio1ResolucaoProf;

public class Produto {
	private String nome;
	private double quantidade;
	private double estoqueMinimo;
	private double estoqueMaximo;

	public Produto(String nome, double quantidade, double estoqueMinimo, double estoqueMaximo) {
		//Insere Condi��o
		if (estoqueMinimo < 5 || estoqueMaximo > 100)
			throw new IllegalArgumentException();
		
		this.nome = nome;
		this.quantidade = quantidade;
		this.estoqueMinimo = estoqueMinimo;
		this.estoqueMaximo = estoqueMaximo;
	}
	
	public String getNome() {
		return nome; 
	}
	
	public double getQuantidade() { 
		return quantidade; 
	}
	
	public double getEstoqueMinimo() {
		return estoqueMinimo; 
	}
	
	public double getEstoqueMaximo() {
		return estoqueMaximo; 
	}

}
