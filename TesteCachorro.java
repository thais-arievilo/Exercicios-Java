class Cachorro {
	String nome; 
	String raca;
	int idade;
	
	void latir(){
		System.out.println("Au au!");
	}
}

class TesteCachorro {
	public static void main(String[] args) {
		Cachorro cachorro1 = new Cachorro();
		cachorro1.nome = "Tobias";
		cachorro1.raca = "Vira Lata";
		cachorro1.idade = 2;

		System.out.println(cachorro1.nome);
		System.out.println(cachorro1.raca);
		System.out.println(cachorro1.idade);
		cachorro1.latir();

		Cachorro cachorro2 = new Cachorro();
		cachorro2.nome = "Lilica";
		cachorro2.raca = "Pintcher";
		cachorro2.idade = 5;

		System.out.println(cachorro2.nome);
		System.out.println(cachorro2.raca);
		System.out.println(cachorro2.idade);
		cachorro1.latir();
		
	}
}