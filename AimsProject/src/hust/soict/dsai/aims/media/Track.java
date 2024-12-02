package hust.soict.dsai.aims.media;

public class Track extends Disc{
	private String title;
	private int length;
	
	public String getTitle() {
		return title;
	}

	public int getLength() {
		return this.length;
	}

	public Track() {
		// TODO Auto-generated constructor stub
	}

	public Track(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
		// TODO Auto-generated constructor stub
	}


	
}
