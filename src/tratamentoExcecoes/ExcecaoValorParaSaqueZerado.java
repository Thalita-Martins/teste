package tratamentoExcecoes;

public class ExcecaoValorParaSaqueZerado extends Exception{
	
	@Override
	public String getMessage() {
		return "Valor para saque n�o pode ser zero.";
	}

}
