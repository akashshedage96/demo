

public class Person {

	private String name;
	private MyDate dob;

	
	public Person() {
		name="Akash";
		dob=new MyDate();
		System.out.println("person parameterless called");
	}
	
	public Person(String n,MyDate d) {
		name=n;
		dob=d;
		System.out.println("person parameter called");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyDate getDob() {
		return dob;
	}

	public void setDob(MyDate dob) {
		this.dob = dob;
	}
	public String toString() {
		String str="name-->"+name+"  "+"DOB-->"+dob;
		return str;
		
		
		
		
		
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person temp=(Person)obj;
		if(this.name==temp.name )//&& this.getDob().getDate()==temp.getDob().getDate()&&temp.getDob().getMonth()==this.getDob().getMonth() && this.getDob().getYear()==temp.getDob().getYear())
			return true;
		else
			return false;
		
		
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		String s=name;
		
		int hs=s.charAt(1);
		return hs;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

