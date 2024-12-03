package hust.soict.dsai.aims.media;
import java.util.ArrayList;
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
	
	public void play() {
		System.out.println("CD from artist " + this.artist + " contains" + tracks.size() + " tracks:");
		for(Track t: tracks) {
			t.play();
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
