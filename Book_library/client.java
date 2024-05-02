package Book_library;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Create three book instances
		Book book1 = new Book(1, "1984", "George Orwell", true);
		Book book2 = new Book(2, "To Kill a Mockingbird", "Harper Lee", true);
		Book book3 = new Book(3, "The Great Gatsby", "F. Scott Fitzgerald", false);
		// Display initial details of all books
		
		
		// Display initial details of all books
		book1.displayInfo();
		book2.displayInfo();
		book3.displayInfo();
		// Use getters to get specific details
		System.out.println("Title of Book 1: " + book1.getTitle());
		System.out.println("Author of Book 2: " + book2.getAuthor());
		System.out.println("Availability of Book 3: " + (book3.getisavailable() ? "Available" : "Not Available"));
		// Use setters to update specific details
		book3.setTitle("The Great Gatsby (Updated Edition)");
		
		book3.setisavailable(true);
		// Display updated details of Book 3
		System.out.println("Updated details of Book 3:");
		book3.displayInfo();
		// Display total number of books created
		System.out.println("Total number of books: " + Book.getBookCount());
	}

}
