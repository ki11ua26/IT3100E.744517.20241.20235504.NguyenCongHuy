package hust.soict.dsai.aims.cart;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
	
	public ArrayList<Media> getItemsOrdered(){
		return itemsOrdered;
	}
	public void addMedia(Media disc) {
		if(itemsOrdered.contains(disc)) {
			System.out.println("Disc " + disc.getTitle() +" is already in the cart");
			return;
		}
		itemsOrdered.add(disc);
		System.out.println("Disc " + disc.getTitle() + " has been added into the cart");
	}
	
	public void addMedia(Media[] dvdlist) {
		for(Media dvd: dvdlist) {
			if(!itemsOrdered.contains(dvd)) {
				itemsOrdered.add(dvd);
				System.out.println("Successfully added " + dvd.getTitle() + " into the cart");
			}
		}
	}
	
	public void addMedia(Media dvd1, Media dvd2) {
		addMedia(dvd1);
		addMedia(dvd2);
	}
	public void removeMedia(Media disc) {
		if(itemsOrdered.contains(disc)) {
			itemsOrdered.remove(disc);
			System.out.println("Successfully removed" + disc.getTitle() + " from the cart");
			return;
		}
		System.out.println("Disc not found");
	}
	public float totalCost() {
		float sum = 0;
		for(Media item: itemsOrdered) {
			sum += item.getCost();
		}
		return sum;
	}
	public void printCart() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered items: ");
		for(Media item: itemsOrdered) {
			System.out.println(item.toString());
		}
		System.out.println("Total cost: " + this.totalCost());
		System.out.println("***************************************************");
	}
	public void Search(int id) {
		if (id > itemsOrdered.size()) {
			System.out.println("No matching DVD");
			return;
		}
		for(Media item: itemsOrdered) {
			if(item.getId() == id) {
				System.out.println(item.toString());
			}
		
		}
	}
	public void Search(String title) {
		boolean found = false;
		for(Media item: itemsOrdered) {
			if(item.getTitle() == title) {
				found = true;
				System.out.println(item.toString());
			}
		}if(!found) {
			System.out.println("No matching DVDs in the cart");


		}
	}
}
