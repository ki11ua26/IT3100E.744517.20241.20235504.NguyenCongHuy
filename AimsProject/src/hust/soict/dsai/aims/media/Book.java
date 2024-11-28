package hust.soict.dsai.aims.media;
import java.util.ArrayList;
public class Book extends Media{
	private ArrayList<String> authors = new ArrayList<String>();
	public ArrayList<String> getAuthors() {
		return authors;
	}

	public void setAuthors(ArrayList<String> authors) {
		this.authors = authors;
	}

	public void addAuthor(String authorName) {
		boolean found = false;
		for(int i = 0; i < authors.size(); i ++) {
			if(authors.get(i) == authorName) {
				found = true;
				System.out.println("Author's already existed");
			}
		}
		if(!found) {
			authors.add(authorName);
			System.out.println("Author" + authorName + " is added into the list"); 
		}
	}
	
	public void removeAuthor(String authorName) {
		boolean found = false;
		for(int i = 0; i < authors.size(); i ++) {
			if(authors.get(i) == authorName) {
				found = true;
				System.out.println("Removing author" + authorName);
				authors.remove(i);
			}
		}
		if(found) {
			System.out.println("Author " + authorName +" is not existed in the book");
		}
	}
	public Book() {
		// TODO Auto-generated constructor stub
	}

}
