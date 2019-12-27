package TestPackage;

public class Repl184 {
	public static void main(String[] args) {
		Person p = new Person("John", "Doe", 10, 25, 1900, "123-45-6789"); 
		System.out.println(p.getFirstname());
		System.out.println(p.getLastname());
		int bDay = p.getBirthday(); 
		int bMonth = p.getBirthmonth();
		int bYear = p.getBirthyear();
		System.out.println(p.formatBirthday(bMonth, bDay, bYear));
		System.out.println(p.getSsn());
	}
	
}

class Person{
	private String firstname;
	private String lastname;
	private int birthmonth;
	private int birthday;
	private int birthyear;
	private String ssn;
	public String formatBirthday(int birthmonth, int birthday, int birthyear) {
		return birthmonth + "/" + birthday + "/" + birthyear; 
	}
	public Person(String firstname, String lastname, int birthmonth, int birthday, int birthyear,
			String ssn) {
		this.firstname = firstname; 
		this.lastname = lastname; 
		this.birthyear = birthyear; 
		this.birthmonth = birthmonth; 
		this.birthday = birthday; 
		this.ssn = ssn; 
		}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getBirthmonth() {
		return birthmonth;
	}
	public void setBirthmonth(int birthmonth) {
		this.birthmonth = birthmonth;
	}
	public int getBirthday() {
		return birthday;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	public int getBirthyear() {
		return birthyear;
	}
	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	
}
