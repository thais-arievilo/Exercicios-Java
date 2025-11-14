class StreamingSong {
	String title;
	String artist;
	int duration; 

	void play() {
		System.out.println("Playing song.");
	}
	
	void printDetails() {
		System.out.println("This is " + title + " by " + artist + ".");
	}
}

class StreamingSongTestDrive {
	public static void main(String[] args) {
		StreamingSong song1 = new StreamingSong();
		song1.title = "Golden";
		song1.artist = "Harry Styles";
		song1.printDetails();
		song1.play();
		
	}
}