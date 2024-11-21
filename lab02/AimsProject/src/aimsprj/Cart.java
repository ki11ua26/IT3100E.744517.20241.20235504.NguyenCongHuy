package aimsprj;
import java.util.Arrays;
public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	public int qtyOrdered;
	public boolean addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (this.qtyOrdered == Cart.MAX_NUMBERS_ORDERED) {
			System.out.println("Cart is already full, cannot add more");
			return false;
		}
		if (Arrays.asList(itemsOrdered).contains(disc)) {
			System.out.println("Item's already in the cart");
			return false;
		}
		this.itemsOrdered[this.qtyOrdered] = disc;
		this.qtyOrdered += 1;
		System.out.println("Item " + this.qtyOrdered  + " is added");
		return true;
	}
	public boolean addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		boolean allAdded = true;
		for(DigitalVideoDisc disc: dvdList) {
			if(this.qtyOrdered == Cart.MAX_NUMBERS_ORDERED) {
				System.out.println("Cart is already full");
				allAdded = false;
				break;
			}
			if(Arrays.asList(itemsOrdered).contains(disc)) {
				System.out.println("Item's already in the cart");
				allAdded = false;
				continue;
			}
			this.itemsOrdered[this.qtyOrdered] = disc;
			this.qtyOrdered += 1;
			System.out.println("Item " + this.qtyOrdered + " is added");
		}
		return allAdded;
	}
	public boolean addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		boolean allAdded = true;
		if(this.qtyOrdered >= this.MAX_NUMBERS_ORDERED) {
			System.out.println("Cart is already full");
			allAdded = false;
		}if(Arrays.asList(itemsOrdered).contains(dvd1)) {
			System.out.println(dvd1.getTitle() + " is already in the cart");
			allAdded = false;
		}else {
			this.itemsOrdered[this.qtyOrdered] = dvd1;
			this.qtyOrdered += 1;
			System.out.println(dvd1.getTitle() +" is added succesfully");
		}
		if(this.qtyOrdered >= this.MAX_NUMBERS_ORDERED) {
			System.out.println("Cart is already full");
			allAdded = false;
		}if(Arrays.asList(itemsOrdered).contains(dvd2)) {
			System.out.println(dvd2.getTitle() + " is already in the cart");
			allAdded = false;
		}else {
			this.itemsOrdered[this.qtyOrdered] = dvd2;
			this.qtyOrdered += 1;
			System.out.println(dvd2.getTitle() +" is added succesfully");
		}
		return allAdded;
		
	}
	public boolean removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if(! Arrays.asList(itemsOrdered).contains(disc)) {
			System.out.println("Item's not found");
			return false;
		}
		int index = Arrays.asList(this.itemsOrdered).indexOf(disc);
		for (int i = index; i < this.qtyOrdered - 1; i++) {
			this.itemsOrdered[i] = this.itemsOrdered[i+1];
		}
		this.qtyOrdered -= 1;
		System.out.println("Item is removed successfully");
		return true;		
	}
	public float totalCost() {
		float sum = 0;
		for(int i = 0; i < this.qtyOrdered; i++) {
			sum += this.itemsOrdered[i].getCost();
		}
		return sum;
	}
}
