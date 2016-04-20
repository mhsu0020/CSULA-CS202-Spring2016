package lyrics;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Album vampireWeekend = new Album("vampire weekend");
		Track hana = new Track("hana", 100);
		Track step = new Track("step", 200);
		vampireWeekend.addTrack(hana);
		vampireWeekend.addTrack(step);

		Album lifeOfPablo = new Album("Life of Pablo");
		Track highLight = new Track("highlight", 100);
		Track lowLight = new Track("lowlight", 200);
		lifeOfPablo.addTrack(highLight);
		lifeOfPablo.addTrack(lowLight);
		Artist kanyeWest = new Artist("kanye", 30);
		//lifeOfPablo.artist = kanyeWest;
		lifeOfPablo.setArtist(kanyeWest);

		Genre genre = new Genre("R&B", 100);
		lifeOfPablo.genre = genre;



		ArrayList<Track> tracks = lifeOfPablo.tracks;
		for (int i = 0; i < tracks.size(); i++) {
			System.out.println(tracks.get(i).trackTitle);
		}
	}

}
