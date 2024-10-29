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
