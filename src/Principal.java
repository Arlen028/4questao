
public class Principal {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pessoa jeova = new PessoaFisica("Damião");
		Conta c = new Conta(damiao);
		c.creditar(2000.0);
		c.debitar(100);
		
		Pessoa samuel = new PessoaFisica("Arlindo");
		ContaEspecial c2 =
			new ContaEspecial(arlindo, 200);
		c2.debitar(500);
		
		ContaPoupanca c3 = new ContaPoupanca(
				new Pessoa("Isael", 25), 
				10000);
		
		c3.rendeJuros();
				
		System.out.println(c);

		System.out.println(c2);
		
		System.out.println(c3);
	}
}
