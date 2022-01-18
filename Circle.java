package hasarelation;

public class Circle {
	
	private int radius;
	private Point centre;

	
	public Circle() {
		radius=10;
		centre=new Point();
	}

public Circle(int r,Point p){
	radius=r;
	centre=p;
}

public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}

public Point getCentre() {
	return centre;
}

public void setCentre(Point centre) {
	this.centre = centre;
}


public String toString() {
	String str="";
	str=str+"radis-->" + radius+ "centre X -->"+centre.getX() +"centre Y--->"+ centre.getY();
	return str;
}







}



