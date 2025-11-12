public class GarrafasVerdes{
	public static void main (String[] args) {
	//COM AJUSTE
		int qntdGarrafas = 10;
		String palavra = "garrafas";

		while(qntdGarrafas > 0) {
			if (qntdGarrafas == 1) {
				palavra = "garrafa";
			}
		
			System.out.println(qntdGarrafas + " " + palavra + " verdes penduradas na parede");
			System.out.println(qntdGarrafas + " " + palavra + " verdes penduradas na parede");
			System.out.println("E se uma garrafa verde cair acidentalmente");
		qntdGarrafas--;
		
		if(qntdGarrafas > 0)
		System.out.println("Haverá " + qntdGarrafas + " " + palavra + " verdes penduradas na parede");
		else {
			System.out.println("Não terão garrafas penduradas na parede.");
		}

		}
		
	}
}
