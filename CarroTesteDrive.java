class Carro {
	String cor;
	int ano;
	String marca;
	String modelo;

	void Acelerar() {
		System.out.println("Vrum Vrum");
	}
}

class CarroTesteDrive {
	public static void main(String[] args) {
		Carro carro1 = new Carro();
		carro1.cor = "Azul";
		carro1.ano = 2015;
		carro1.marca = "Honda";
		carro1.modelo = "City";

		System.out.println("Marca: " + carro1.marca);
		System.out.println("Modelo: " + carro1.modelo);
		System.out.println("Ano:" + carro1.ano);
		System.out.println("Cor: " + carro1.cor);
		
		carro1.Acelerar();
	}
}