
public class MyDate implements Comparable<MyDate> {
	private int month;
	private int date;
	private int year;
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
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
		month=2;
		date=10;
		year=1996;
		
		System.out.println("date parameterless called");
		
		
	}

	public MyDate(int m,int d, int y) {
		month=m;
		date=d;
		year=y;
		
		
	}
	
	public String toString() {
		String str="";
		str= "DOB-->"+date+ "-"+ month + "-" + year;
		return str;
	}

	@Override
	public int compareTo(MyDate d) {
		// TODO Auto-generated method stub

		
		
		if(this.year>d.year)
	return 1;
if (this.year<d.year)
	return -1;
else {
if(this.month>d.month)
		return 1;
	if (this.month<d.month)
		return -1;
	else {
		if(this.date>d.date)
			return 1;
		if (this.date<d.date)
			return -1;
		else {
			return 0;
		}
	}
	
		
	
//}

	}	
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		MyDate temp=(MyDate)obj;
		if( this.year==temp.year && this.month==temp.month && this.date==temp.date)
			return true;
		else
			return false;
		
		
	}	
		
		
		
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			String s=date+""+month+""+year;
			int hs=Integer.parseInt(s);
			return hs;
		}
		
		
		
		
		
		
		
	

}
