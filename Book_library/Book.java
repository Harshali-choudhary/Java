package Book_library;

public class Book {


		// TODO Auto-generated constructor stub
		
		private int bookid;
		private String Title;
		private String author;
		public Boolean isavailable;
		private static int TotalnoofBooks=0;
		
		
		public Book(int bookid,String Title, String author,Boolean isavailable)
		{
			TotalnoofBooks++;
			this.bookid = bookid;
			this.Title = Title;
			this.author = author;
			this.isavailable = isavailable;
		}
		
		public void setid()
		{
			this.bookid = bookid;
		}
		public int getid(int bookid)
		{
			return bookid;
		}
		
		
		public void setTitle(String Title)
		{
			this.Title = Title;
		}
		public String getTitle()
		{
			return Title;
		}
		
		public void setAuthor(String author)
		{
			this.author = author;
		}
		public String getAuthor() 
		{
			return author;
		}
		
		public void setisavailable(Boolean isavailable) 
		{
			this.isavailable = isavailable;
		}
		public Boolean getisavailable() 
		{
			return isavailable;
		}

		
		
		@Override 
		public String toString()
		{
			return " Book id is : "+bookid
					+" Title ; "+Title
					+" author : "+author
					+" is available : "+isavailable;
			
		}
		
		public static int getBookCount()
		{
			return TotalnoofBooks;
		}
		
		public void displayInfo()
		{
			System.out.println(" book id is : "+bookid);
			System.out.println(" Title of book is : "+Title);
			System.out.println(" The author name is : "+author);
			System.out.println("Book is available or not : "+isavailable);
		}
		
	}


