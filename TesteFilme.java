class Filme {
	String titulo;
	int ano;
	Double nota;
		
	void exibirInfo() {
		System.out.println("O filme não é recomendado para crianças.");
	}
}

class TesteFilme {
	public static void main(String[] args) {
		Filme filme1 = new Filme();
		filme1.titulo = "Maze Runner";
		filme1.ano = 2017;
		filme1.nota = 9.9;
		
		System.out.println("O filme " + filme1.titulo + " foi lançado em " + filme1.ano + " e tem a nota " + filme1.nota + ".");
		filme1.exibirInfo();

		Filme filme2 = new Filme();
		filme2.titulo = "Guerra Mundial Z";
		filme2.ano = 2012;
		filme2.nota = 7.0;

		System.out.println("O filme " + filme2.titulo + " foi lançado em " + filme2.ano + " e tem a nota " + filme2.nota + ".");
		filme2.exibirInfo();

	}
}