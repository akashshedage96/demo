package hasarelation;

import java.util.Scanner;

public class User {

	
	static Circle[] arr=new Circle[3];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Populate();
		Getradius();
		Getcentradi();
		OnlyYcordinate();
		
		
	}
	
		//populate array from user
		
		public static void Populate() {
			
		
		
		for(int i=0;i<arr.length;i++) {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("enter the radius");
			int r=sc.nextInt();
			
			System.out.println("enter the first point");
			int a=sc.nextInt();
			
			System.out.println("enter the second point");
			int b=sc.nextInt();
			
			arr[i]=new Circle(r, new Point(a,b));
			System.out.println(arr[i]);
		}
		
		
	}

	// show radius only
	
	public static void Getradius() {
		for(int i=0;i<arr.length;i++) {
			if(arr[i].getCentre().getY()>=10&&arr[i].getCentre().getY()<=90) {
			int radiii=arr[i].getRadius();
			System.out.println("radius of circles-->"+radiii+"--->");
			
		}
		
		}
	}
	
	
	public static void Getcentradi() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("centre-->"+arr[i].getCentre()+"radius-->"+arr[i].getRadius());
			
			
		}
	}
	
	public  static void OnlyYcordinate() {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Y cordinate of circles--->"+arr[i].getCentre().getY());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
