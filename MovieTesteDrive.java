class Movie {
	String title;
	String genre;
	int rating;

	void playIt() {
		System.out.println("Playing the movie");
	}
}

class MovieTesteDrive {
	public static void main(String[] args) {
		Movie one = new Movie();
		one.title = "Gone with the Stock";
		one.genre = "Tragic";
		one.rating = -2;

		Movie two = new Movie();
		two.title = "Lost in Cubicle Space";
		two.genre = "Comedy";
		two.rating = 5;

		Movie three = new Movie();
		three.title = "Byte Club";
		three.genre = "Tragic but ultimately uplifting";
		three.rating = 127;

		System.out.println(one.title + ", " + two.title + " e " + three.title);
		System.out.println(one.genre + ", " + two.genre + " e " + three.genre);
		System.out.println(one.rating + ", " + two.rating + " e " + three.rating);
		
	}
}