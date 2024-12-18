package hust.soict.dsai.aims.media;

import hust.soict.dsai.aims.exception.PlayerException;

public class DigitalVideoDisc extends Disc implements Playable{
	private String director;
	private int length;
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
	public String toString() {
		String s = "DVD - " + this.getTitle() + " - " + this.getCategory() + " - " + this.getDirector() + " - " + this.getLength() + " : " + this.getCost() + " $";
		return s;
	}
	public StringBuffer play() throws PlayerException {
        if (this.getLength() > 0) {
            System.out.println("Playing DVD: " + this.getTitle());
            System.out.println("DVD length: " + this.getLength());

            StringBuffer info = new StringBuffer("");
            info.append("Playing DVD: " + this.getTitle() + "\n" + "DVD length: " + this.getLength());
            return info;
        } else {
            throw new PlayerException("ERROR: DVD length is non-positive!");
        }

    }



}
