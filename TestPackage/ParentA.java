package TestPackage;

public class ParentA {
	void m1() {
		System.out.println("Inside Parent's m1 method");
	}
	
	public static void main(String[] args) {
		ParentA obj = new ChildA();
		obj.m1();
	}
}

class ChildA extends ParentA{
	void m1() {
		System.out.println("Inside Child's m1 method");
	}
}
