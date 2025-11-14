class Episode {
	int seriesNumber;
	int episodeNumber;

	void skipIntro() {
		System.out.println("Skipping intro.");
	}
	
	void skipToNext() {
		System.out.println("Loading next episode..");
	}
}

class EpisodeTestDrive {
	public static void main(String[] args) {
		Episode episode1 = new Episode();
		episode1.seriesNumber = 4;
		episode1.episodeNumber = 10;

		System.out.println("Temporada: " + episode1.seriesNumber);
		System.out.println("Episódio: " + episode1.episodeNumber);

		episode1.skipIntro();
		episode1.skipToNext();
	}
}