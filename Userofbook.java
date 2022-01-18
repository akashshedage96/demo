package hasarelation;

public class Userofbook {

	static Book[] brr=new Book[3];
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		brr[0]=new Book("karna",500.00, new String []{"shivaji" });  
		brr[1]=new Book("shambhuraje",800.00, new String []{"akash","mayur","raj"});
		brr[2]=new Book("Chatrapati",520.90, new String []{"deshpande" ,"shinde","kolhe"});
		oneauthorbooks(brr);
		BooknameCost(brr); 
	}
		//books having only one author
		public static void oneauthorbooks(Book []brr) {
		for(int i=0;i<brr.length;i++) {
			if(brr[i].getAuthors().length==1) {
		
				System.out.println("books having single author are:-->"+brr[i].getBookname());
		}
		}
			
		
		}
		//cost and book name
		public  static void BooknameCost(Book []brr) {
			for(int i=0;i<brr.length;i++) {
				System.out.println("bookname:--->"+brr[i].getBookname()+"\n"+"costOfbook-->"+brr[i].getCost());
			}
			
			
			
		}
		
		
		
		
		
	}


