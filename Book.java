package hasarelation;

public class Book {
	
	
	private String bookname;
	private double cost;
	private String[]authors;
	
	public Book() {
		bookname="Mrutyunjay";
		cost=250.55;
		 authors= new String[5];
		
	}
	
	public Book(String b,double c,String [] arr) {
		bookname=b;
		cost=c;
		authors=arr;
	}
	
	public String toString() {
		String str="";
		System.out.print("authors:");
		for(int i=0;i<authors.length;i++) {
			
			System.out.print("-->"+authors[i]);
		}
		str=str+"   " +  " bookname--->"+ bookname+ "    "+"cost--->"+cost;
		return str;
	}
	
	
	
	
	
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String[] getAuthors() {
		return authors;
	}
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


