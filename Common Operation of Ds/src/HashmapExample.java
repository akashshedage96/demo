import java.util.HashMap;
import java.util.Scanner;

public class HashmapExample {
public static void main(String[] args) {
	HashMap<String, String > h=new HashMap<>();
	h.put("Akash", "Shedage");
	h.put("akash", "king");
	System.out.println("please login");
	System.out.println("enter username");
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	System.out.println("enter password");
	String s1=sc.next();
	if(h.containsKey(s)) 
			System.out.println("********right username******");
	else
		System.out.println("wrong username");
	if(h.containsValue(s1))
		System.out.println("right password");
	else
		System.out.println("wrong password");
	
	

	
	
	
}
}
