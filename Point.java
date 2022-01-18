package hasarelation;

public class Point {
	
	private int x;
	private int y;
	

	public Point() {
		x=0;
		y=0;
	}
	
	public Point(int a,int b) {
		x=a;
		y=b;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public String toString() {
		String str="";
		
		str="points-->"+ x+"\n" + y;
		
		
		return str;
		
	}
	
}
