package classeAnonima;

public class CarteiraContasInterface {
	
	public static void main(String[] args) {
		contaCorrente(new InterfaceConta() {
			
			@Override
			public void imprimeTipoConta() {
				System.out.println("Conta Corrente");
				
			}
		});
	}
	
	public static void contaCorrente (InterfaceConta conta) {
		conta.imprimeTipoConta();
	}

}
