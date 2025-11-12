class FrasesMalucas {
	public static void main(String[] args) {
		String[] sujeitos = {"O gato", "Minha amiga", "O robô"};
		String[] verbos = {"comeu", "pintou", "derrubou"};
		String[] complementos = {"a parede", "meu celular", "o sistema"};

		int QTDLista1 = sujeitos.length;
		int QTDLista2 = verbos.length;
		int QTDLista3 = complementos.length;

		java.util.Random randomGenerator = new java.util.Random();

		int rand1 = randomGenerator.nextInt(QTDLista1);
		int rand2 = randomGenerator.nextInt(QTDLista2);
		int rand3 = randomGenerator.nextInt(QTDLista3);

		String frase = sujeitos[rand1] + " " + verbos[rand2] + " " + complementos[rand3];

		System.out.println(frase);
	}
}