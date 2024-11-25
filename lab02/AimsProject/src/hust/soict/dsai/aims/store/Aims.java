package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Aims {

	public static void main(String[] args) {
		Cart anOrder = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Aller", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Was", "Science Fiction", "George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Iron man", "Science Fiction", 89.22f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Spider man", "Super Hero", 58.22f);
		DigitalVideoDisc[] dvdList = {dvd1, dvd2, dvd3};
		anOrder.addDigitalVideoDisc(dvd1);
		anOrder.addDigitalVideoDisc(dvd2);
		anOrder.addDigitalVideoDisc(dvd3);
		anOrder.addDigitalVideoDisc(dvdList);
		anOrder.addDigitalVideoDisc(dvd4, dvd5);
		anOrder.removeDigitalVideoDisc(dvd2);
		anOrder.Search(2);
		anOrder.Search(22);
		anOrder.Search("Iron man");
		anOrder.Search("Black Panther");
		anOrder.printCart(anOrder);
		System.out.println("Total cost is: ");
		System.out.println(anOrder.totalCost());
	}

}
