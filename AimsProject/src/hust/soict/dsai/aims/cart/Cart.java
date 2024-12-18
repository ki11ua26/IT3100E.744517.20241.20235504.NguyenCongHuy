package hust.soict.dsai.aims.cart;
import java.util.ArrayList;

import hust.soict.dsai.aims.exception.LimitExceededException;
import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
	
	public ObservableList<Media> getItemsOrdered(){
		return itemsOrdered;
	}
	public int addMedia(Media media) throws LimitExceededException {
		if (itemsOrdered.size() <  MAX_NUMBERS_ORDERED) {
			itemsOrdered.add(media);
			System.out.println("The media has been added to the cart");
			return 1;
		} else {
			throw new LimitExceededException("ERROR: The cart is almost full"); 
		}
	}
	
	public int addMedia(Media media1, Media media2) throws LimitExceededException {
		int countAdded = 0;
		try {
			countAdded += addMedia(media1);
			countAdded += addMedia(media2);
		} catch (LimitExceededException e) {
			throw e;
		}
		
		return countAdded;		
	}
	public int addMedia(ArrayList<Media> medias) throws LimitExceededException {
		int countAdded = 0;
		for (int i=0; i<medias.size(); i++) {
			try {
				countAdded += addMedia(medias.get(i));
			} catch (LimitExceededException e) {
				throw e;
			}
		}
		return countAdded;
	}
	
	public int removeMedia(Media media) {
		if (itemsOrdered.contains(media)) {
			itemsOrdered.remove(media);
			System.out.println("The media has been removed from the cart");
			return 1;
		}
		System.out.println("The media is not in the cart");
		return 0;
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
	public Media getALuckyItem() {
		if (itemsOrdered.size() >= 5) {
			int index = (int)(Math.random() * itemsOrdered.size());
			Media luckyItem = itemsOrdered.get(index);
			System.out.println("The lucky item: " + luckyItem);
			
			removeMedia(luckyItem);
			System.out.println("The bill of this order is now " + totalCost());
			
			return luckyItem;
		}
		return null;
	}
}
