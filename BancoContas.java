package projetofacade;

import java.util.ArrayList;

public class BancoContas {
	ArrayList<Conta> conta = new ArrayList<Conta>();

	public void realizarTransacoes(long idConta, double valor, long idContaTransao) {
		for (Conta c : conta) {
			if (c.getId() == idConta) {
				c.setValor(-valor);
				for (Conta cT : conta) {
					if (cT.getId() == idContaTransao) {
						cT.setValor(+valor);
					}
				}
			}

		}
	}

	public void cadastrar(Conta contaNova) throws exception {

		if (verificaContaValida(contaNova)) {

			conta.add(contaNova);
		} else {
			throw new exception("Ja possuiConta");
		}

	}

	private boolean verificaContaValida(Conta con) {
		for (Conta c : conta) {
			if (con.getId() == c.getId()) {
				return false;
			}
		}
		return true;
	}
	public  void sacar(double valor, long id){
		for(Conta c: conta){
			if(c.getId()==id){
				c.setValor(valor);
			}
		}
	}

}
