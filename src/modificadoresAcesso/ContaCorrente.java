package modificadoresAcesso;

public class ContaCorrente {
		public final String tipoConta = "Corrente";
		public final Double taxaOperacao;
		
		public ContaCorrente() {
			this.taxaOperacao = 0.45; 
		}
}