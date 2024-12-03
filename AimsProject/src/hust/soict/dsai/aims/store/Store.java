package hust.soict.dsai.aims.store;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.Media;
public class Store {
	private static final int MAX_NUMBERS = 500;
	int qtyItem = 0;
	ArrayList<Media> itemsInStore = new ArrayList<Media>();
	public ArrayList<Media> getItemsInStore() {
		return itemsInStore;
	}

	public void setItemsInStore(ArrayList<Media> itemsInStore) {
		this.itemsInStore = itemsInStore;
	}

	public void addMedia (Media disc) {
		if (itemsInStore.size() == MAX_NUMBERS) {
			System.out.println("Store full, cannot order more!");
			return;
		}
		if (itemsInStore.contains(disc)) {
			System.out.println("Item is already in the store");
			return;
		}
		itemsInStore.add(disc);
		System.out.println("Item is added successfully");
	}
	
	public void removeMedia (Media disc) {
		if (!itemsInStore.contains(disc)) {
			System.out.println("Item is unavailable");
			return;
		}
		itemsInStore.remove(disc);
		System.out.println("Item's removed succesfully");
	}
	public void print() {
		System.out.println("**********************STORE**********************");
		System.out.println("Items In Store:");
		for (Media t: itemsInStore) {
			System.out.println(t);
		}
		System.out.println("*************************************************");
	}
}
