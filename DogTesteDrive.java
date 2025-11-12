class Dog {
	int size;
	String breed;
	String name;
	
	void bark() {
		System.out.println("Au! Au!");
	}
}

class DogTesteDrive {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.size = 45;
		dog1.breed = "Pastor Alemão";
		dog1.name = "Fofinha";
		dog1.bark();

		System.out.println(dog1.size);
		System.out.println(dog1.breed);
		System.out.println(dog1.name);

		Dog dog2 = new Dog();
		dog2.size = 23;
		dog2.breed = "Alemão";
		dog2.name = "Mel";
		dog2.bark();

		System.out.println(dog2.size);
		System.out.println(dog2.breed);
		System.out.println(dog2.name);

	}
}