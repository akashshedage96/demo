import java.util.Arrays;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Palette {
	private TreeSet<String> colours;
	
	
	public Palette() {
		System.out.println("parameterless");
	}
public Palette(TreeSet<String> c) {
	System.out.println("parameterised");
	colours=c;
	
}
public TreeSet<String> getColours() {
	return colours;
}
public void setColours(TreeSet<String> colours) {
	this.colours = colours;
}

public void AddToPalette(String colour) {
	
	colours.add(colour.toLowerCase());
	
	//for(String n:colours)
	//System.out.println(n);
	
	
	
}

public void ShowAll(TreeSet<String> colours ) {
	// TODO Auto-generated method stub
	System.out.println("in showw");
	
	//Arrays.asList(colours).stream().forEach((ele)->{System.out.println(ele);});
	
	colours.stream().forEach((ele)->{System.out.println(ele);});
	
}
public void RemoveFrmpalette(String colour) {
	colours.remove(colour);
	
}

public boolean IsColourInpalette(String colour) {
	//boolean result=false;
	if(colours.contains(colour))
		
		return true;
	
	return false;
}


}


