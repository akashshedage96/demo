import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Hashing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> h=new TreeSet<>();
	//	HashSet<Integer> h=new HashSet<Integer>();
		h.add(90);
		h.add(30);
		h.add(110);
		h.add(50);
		h.add(6);
		for(Integer n:h)
			System.out.println(n);//prints in bucket order
		//Iterator<Integer> i=h.iterator();
		//while( i.hasNext()) {
			//System.out.println(i.next());
	///	}
		//Enumeration<Integer> e=Collections.enumeration(h);
		//while(e.hasMoreElements()) {
		//	System.out.println(e.nextElement());
		//}
	
		HashSet<MyDate> d=new HashSet<MyDate>();
		TreeSet<MyDate> d1=new TreeSet<MyDate>();
		MyDate d3=(new MyDate(2,22,2022));
		d.add(d3);
	MyDate 	d2=(new MyDate(2,22,2022));
	d.add(d2);
		d.add(new MyDate(4,25,2000));
		d.add(new MyDate(5,2,1998));
		
		//System.out.println(d2.hashCode());
		//System.out.println(d3.hashCode());
		//System.out.println(d2.equals(d3));
		
		HashSet<Person>p=new HashSet<>();
		p.add(new Person("akash",new MyDate(1,22,2017)));
		p.add(new Person("raju",new MyDate(1,5,1917)));
		p.add(new Person("harsh",new MyDate(9,2,2057)));
		Person p1=(new Person("king",new MyDate(5,12,2017)));
		p.add(p1);
		Person p2=(new Person("king",new MyDate(5,12,2017)));
		p.add(p2);
		
		//p.add(new Person("king",new MyDate(5,12,2017)));
		for(Person n:p)
			System.out.println(n);
		System.out.println();
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		//for(MyDate j:d)
			//System.out.println(j);
		//MyDate d1=new MyDate(1,10,1996);
		//d.add(d1);
		//MyDate d2=new MyDate(1,10,1996);
		///System.out.println("equals"+ d1.equals(d2));	
		//String s= d2.getDate()+""+d2.getMonth()+d2.getYear();
		//int st=Integer.parseInt(s);
		//System.out.println(s);
		//System.out.println(st);
		//Collection<Integer> na=*/
		
		//h.addAll(h);
		//System.out.println(h);
		//for(Integer n:h)
		//	System.out.println(n);//prints in bucket order
		
		
		}

}
