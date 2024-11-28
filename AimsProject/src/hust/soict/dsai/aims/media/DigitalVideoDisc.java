package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc{
	private String director;
	private int length;
	private static int nbDigitalVideoDiscs = 0;
	public String getDirector() {
		return director;
	}
	public DigitalVideoDisc() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getLength() {
		return length;
	}
	public DigitalVideoDisc(String title) {
		super(title, null, null, 0, 0.0f);

	}
	public DigitalVideoDisc(String title, String category, float cost) {
		super(title, category, null, 0, cost);
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category, director, 0, cost);
	}
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, director, length, cost);
		
	}
	public String toString(DigitalVideoDisc dvd) {
		int id = dvd.getId();
		return( (id+1) + " - "  + dvd.getTitle() + " - " + dvd.getCategory() + " - "
				+ dvd.getDirector() + " - " + dvd.getLength() + ": " + dvd.getCost() + "$");
	}

}
