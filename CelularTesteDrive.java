class Celular {
	String modelo;
	int anoFabricacao;
	String cor;
	int memoriaRam;
}

class CelularTesteDrive {
	public static void main(String[] args) {
		Celular celular1 = new Celular();
		celular1.modelo = "Samsung";
		celular1.anoFabricacao = 2025;
		celular1.cor = "Preto";
		celular1.memoriaRam = 8;

		System.out.println(celular1.modelo);
		System.out.println(celular1.anoFabricacao);
		System.out.println(celular1.cor);
		System.out.println(celular1.memoriaRam);				
		Celular celular2 = new Celular();
		celular2.modelo = "Samsung";
		celular2.anoFabricacao = 2025;
		celular2.cor = "Preto";
		celular2.memoriaRam = 8;

		System.out.println(celular2.modelo);
		System.out.println(celular2.anoFabricacao);
		System.out.println(celular2.cor);
		System.out.println(celular2.memoriaRam);
	}
}