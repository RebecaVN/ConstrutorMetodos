package construtorMetodos;

public class Banco {
	
	public int agencia;
	public int conta;
	public double saldo;
	public String titular;
	static int totalConta = 1222;
	
	public Banco (int agencia, String titular, double saldo) {
		
		this.saldo = saldo;
		this.agencia = agencia;
		this.titular = titular;
		this.conta = totalConta +1;
		totalConta++;
		
		System.out.println("----------------------------");
		System.out.println("Cliente " + titular);
		System.out.println("Agência: " + agencia);
		System.out.println("Conta: " + conta);
		System.out.println("Saldo: " + saldo);
	}
	
	public void deposito (double deposito) {
		System.out.println("Deposito efetuado com sucesso!");
		this.saldo = deposito;
	}
	
	public boolean saque (double saque) {
		
		if (saldo >= saque) {
			System.out.println("Saque efetuado com sucesso!");
			this.saldo -= saque;
			System.out.println("TOTAL:" + saldo);
			return true;
			
		}else {
			System.out.println("Não possui saldo suficiente");
		}
		return false;
		
		
	}
	
	public boolean transfere (double valor, Banco contaDestino) {
		
		 if (saldo >= valor) {
			 System.out.println("Transferência efetuada com sucesso!");
				this.saldo -= valor;
				System.out.println("TOTAL:" + saldo);
				return true;
		 }
		 return false;
		
	}
}	

