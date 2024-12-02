package hust.soict.dsai.aims.media;

public class Track implements Playable{
	private String title;
	private int length;
	
	public String getTitle() {
		return title;
	}
	
	public int getLength() {
		return this.length;
	}
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	public Track() {
		// TODO Auto-generated constructor stub
	}

	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	public boolean equals(Object t) {
		if (t instanceof Track) {
			Track T = (Track)t;
			return (this.title.equals(T.getTitle()) && this.length == T.getLength());
		}
		return false;
	}


	
}
