import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap<Integer, String > m= new TreeMap<>();
		//HashMap<Integer, String> m=new HashMap<Integer,String>();
		m.put(1, "akash");
		m.put(2, "Akash");
		m.put(3, "king");
		m.put(4, "hello");
		
		Collection<String> n=m.values();//String printed
		
		for(String r:n)
			System.out.println(r);
		
		Set<Integer> keys=m.keySet();//keys printed
		for(Integer s:keys)
			System.out.println(s);
		System.out.println("enter the key");
		Scanner sc=new Scanner (System.in);
		int k=sc.nextInt();
		String name=m.get(k);
		System.out.println(name);
		
		
		
		
		
		
	}

}
