package hasarelation;

public class MyDate {
	
	private String month;
	private int date;
	int year;
	
	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public MyDate() {
		month="january";
		date=10;
		year=1996;
		
		System.out.println("date parameterless called");
		
		
	}

	public MyDate(String m,int d, int y) {
		month=m;
		date=d;
		year=y;
		
		
	}
	
	public String toString() {
		String str="";
		str= "DOB-->"+date+ "-"+ month + "-" + year;
		return str;
	}
	
}
