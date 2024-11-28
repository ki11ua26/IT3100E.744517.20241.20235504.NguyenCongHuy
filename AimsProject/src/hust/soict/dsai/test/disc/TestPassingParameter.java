package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cindrellaDVD = new DigitalVideoDisc("Cindrella");
		swap(jungleDVD, cindrellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cindrella dvd title: " + cindrellaDVD.getTitle());
		DigitalVideoDisc[] dvds = {jungleDVD, cindrellaDVD};
        swapUsingArray(dvds);
        System.out.println("Jungle DVD: " + dvds[0].getTitle());
        System.out.println("Cindrella DVD: " + dvds[1].getTitle());
		changeTitle(jungleDVD, cindrellaDVD.getTitle());
		System.out.println("jungle DVD title: " + jungleDVD.getTitle());
	}
	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
	public static void swapUsingArray(DigitalVideoDisc[] dvds) {
        DigitalVideoDisc temp = dvds[0];
        dvds[0] = dvds[1];
        dvds[1] = temp;
    }
	
}
