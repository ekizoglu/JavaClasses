package TestPackage;

public class Repl183 {
/*
 * Create Class Account
Create the below variables:
private long acc_no;  
private String name, email;  
private double amount;  

Create the getter/setter methods for each variable. 

In Main Class and the main method. 
Using setter methods assign the values as:
acc_no = 7560504000
name = Sumair
email = sumair@syntaxsolutions.com 
amount = 50000.0
Using getter methods print the values as below output. 
 */
	//7560504000 Sumair sumair@syntaxsolutions.com 50000.0
	public static void main(String[] args) {
		Account aa = new Account(); 
		aa.setAcc_no(7560504000l);
		aa.setName("Sumair"); 
		aa.setEmail("sumair@syntaxsolutions.com"); 
		aa.setAmount(50000);
		System.out.println(aa.getAcc_no() + " " + aa.getName() + " " + aa.getEmail() + " "
		+ aa.getAmount());
		
		
	}
}
class Account{
	private long acc_no;  
	private String name, email;  
	private double amount;
	
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	} 
	
}
