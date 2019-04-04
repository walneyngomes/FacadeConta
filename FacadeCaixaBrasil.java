package projetofacade;

public class FacadeCaixaBrasil {
	BancoContas conta;

	public FacadeCaixaBrasil() {
		this.conta = new BancoContas();
	} 

	public void realizarTransacoes(long idConta, double valor, long idContaTransao) {

		conta.realizarTransacoes(idConta, valor,idContaTransao);

	}
	
	
	public void sacar(double valor, long idConta){
		conta.sacar(valor, idConta);
	}
	
	

}
