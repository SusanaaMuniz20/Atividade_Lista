package entites;

public class Produtos implements Comparable<Produtos> {

	private String nome;
	private int quantidade;
	private double pre�o;
	
	
	
	
	public Produtos(String nome) {
		super();
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	public Produtos(String nome, int quantidade, double pre�o) {
		super();
		this.nome = nome;
		this.quantidade = quantidade;
		this.pre�o = pre�o;
	}
	public Produtos() {
		// TODO Auto-generated constructor stub
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
		
	public double getPre�o() {
		return pre�o;
	}
	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
	}
	public void add(Produtos produto) {
		// TODO Auto-generated method stub
		
	}
	
	
@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Nome:  " + nome  + "; Quantidade:  " + quantidade + ";  Pre�o:  " + pre�o;
}
@Override
public int compareTo(Produtos outroProduto) {
	// TODO Auto-generated method stub
	return this.nome.compareTo(outroProduto.nome);
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
