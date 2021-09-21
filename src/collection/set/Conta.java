package collection.set;

public class Conta implements Comparable<Conta>{
	
	private String tipoConta;
	private Double saldo;
	
	public Conta(String tipoConta, Double saldo) {
		this.tipoConta = tipoConta;
		this.saldo = saldo;
	}
	
	@Override
	public int compareTo(Conta conta) {
		return this.tipoConta.compareTo(conta.getTipoConta());
	}
	
	public boolean equals(Object o) {
		Conta conta = (Conta) o;
		return this.tipoConta.equals(conta.getTipoConta());
	}
	
	public int hashCode() {
		return this.tipoConta.hashCode();
	}
	
	//getters e setters
	
	public String getTipoConta() {
		return tipoConta;
	}
	
	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
