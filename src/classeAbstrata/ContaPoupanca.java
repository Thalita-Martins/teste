package classeAbstrata;

public class ContaPoupanca extends Conta{

	@Override
	public void imprimeExtrato() {
		System.out.println("Extrato da Conta Poupan�a");
		System.out.println(this.getSaldo());
		
	}

}
