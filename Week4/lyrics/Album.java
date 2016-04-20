package lyrics;

import java.util.ArrayList;

public class Album {

	String albumTitle;

	//Each album has their own artist and genre
	Artist artist;

	Genre genre;

	//an album can have many tracks
	ArrayList<Track> tracks;

	public Album(String albumTitle) {
		this.albumTitle = albumTitle;
		this.tracks = new ArrayList<>();
	}

	//Takes a Track object and add that to the tracks arraylist
	public void addTrack(Track trackToAdd){
		tracks.add(trackToAdd);
	}
	public void setArtist(Artist artist){
		this.artist = artist;
	}


}
