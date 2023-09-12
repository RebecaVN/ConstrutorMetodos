package construtorMetodos;

public class ContaCorrente {
	public static void main(String[] args) {
		
		Banco contaJose = new Banco(300, "José de Alencar",200);
		Banco contaMaria = new Banco(300, "Maria de Fátima",200);
	
		contaJose.deposito(2000);
		
		
		contaJose.saque(0);
		contaMaria.saque(0);
		
		contaJose.transfere(0, contaMaria);
		contaMaria.transfere(0, contaJose);
		
	}
}
