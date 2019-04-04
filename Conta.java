package projetofacade;

public class Conta {
	public double valor;
	public String nome;
	public long id;
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor += valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

}
