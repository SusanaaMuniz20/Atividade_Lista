package entites;

public class Pessoa implements Comparable<Pessoa>  {

	private String nome;
		
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome + "\n";
	}
	
	public int compareTo(Pessoa umaOutraPessoa) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(umaOutraPessoa.nome);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
