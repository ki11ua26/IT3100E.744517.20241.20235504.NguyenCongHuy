package hust.soict.dsai.aims.media;
import java.util.ArrayList;

import hust.soict.dsai.aims.exception.PlayerException;
public class CompactDisc extends Disc implements Playable{
	private String artist;
	private ArrayList<Track> tracks = new ArrayList<Track>();
	
	public String getArtist() {
		return artist;
	}
	
	public CompactDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
		// TODO Auto-generated constructor stub
	}
	public CompactDisc(String title, String category, float cost) {
		super(title, category, null, 0, 0.0f);
	}
	public void addTrack(Track track) {
		if(tracks.contains(track)) {
			System.out.println("The track's already existed");
			return;
		}
		tracks.add(track);
		System.out.println("Successfully added");
	}
	
	public void removeTrack(Track track) {
		if(tracks.contains(track)) {
			tracks.remove(track);
			System.out.println("Succesfully removed");
			return;
		}
		System.out.println("The track does not exists");
	}
	public int getLength() {
		int sum = 0;
		for(Track t: tracks) {
			sum += t.getLength();
		}
		return sum;
	}
	
	public StringBuffer play() throws PlayerException {
		if (this.getLength() > 0) {
			System.out.println("Playing CD: " + this.getTitle());
			System.out.println("CD length: " + this.getLength());
			
			StringBuffer info = new StringBuffer("");
			info.append("Playing CD: " + this.getTitle() + "\n" + "CD length: " + this.getLength() + "\n");
			
			for (Track t : tracks) {
				try {
					StringBuffer trackInfo = t.play();
					info.append(trackInfo + "\n");
				} catch (PlayerException e) {
					throw e;
				}
			}
			return info;
		} else {
			throw new PlayerException("ERROR: CD length is non-positive!");
		}
		
	}

	public CompactDisc() {
		// TODO Auto-generated constructor stub
	}
	public String toString() {
	    String s = "CD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + " : " + String.format("%.2f", this.getCost()) + " $";
	    return s;
	}


}
