class Pessoa {
	String nome;
	int idade;

	public void apresentar() {
		System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
	}
}

class TestePessoa {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Thaís Soares";
		pessoa1.idade = 21;
		pessoa1.apresentar();

		Pessoa pessoa2 = new Pessoa();
		pessoa2.nome = "Eliana Santos";
		pessoa2.idade = 34;
		pessoa2.apresentar();
	}
}