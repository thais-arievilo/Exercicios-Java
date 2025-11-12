public class PhraseOMatic {
	public static void main(String[] args) {

		//Tres listas com palavras aleatorias
		String[] wordListOne = {"gentil","habilidoso", "inteligente","estressado","amigavel","simpatico","amoroso","raiva","bravo","orgulhoso","balanço"};
		String[] wordListTwo = {"sem noção","cachorro quente","Russa","liberdade","terra","natureza","morro","saudade","beleza","bando","coração","amenizar"};
		String[] wordListThree = {"horizonte","labirinto","cristal","neblina","relampago","miragem","correnteza","aurora","fragmento","medo"};
		
		//Quantidade de palavras em cada lista
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		//Gerar três números aleatórios
		java.util.Random randomGenerator = new java.util.Random();
		int rand1 = randomGenerator.nextInt(oneLength);
		int rand2 = randomGenerator.nextInt(twoLength);
		int rand3 = randomGenerator.nextInt(threeLength);

		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

		System.out.println("Precisamos de " + phrase);
		System.out.println(oneLength);
		System.out.println(twoLength);
		System.out.println(threeLength);

	}
}