import java.util.Collection;
import java.util.TreeSet;
import java.util.stream.Stream;

public class UserOfPalette {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 way of passsing treeset to functions in palette
		TreeSet<String>j=new TreeSet<>();
		 Palette p =new Palette(j);
		 //Palette p =new Palette(new TreeSet<>());//---2 way of passing function but not by treeset but by converting to array.!!!
		p.AddToPalette("white");
		p.AddToPalette("BLACK");
		p.AddToPalette("red");
		p.AddToPalette("purple");
		p.ShowAll(j);
		p.RemoveFrmpalette("white");
		p.ShowAll(j);
	boolean result=	p.IsColourInpalette("red");
	System.out.println(result);
		//Stream<String> i=j.stream();
		
	}
}