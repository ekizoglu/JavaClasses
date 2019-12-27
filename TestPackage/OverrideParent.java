package TestPackage;

public class OverrideParent {
	public static void m1() {
		System.out.println("Method m1 with no params and void return type");
	}
}

/* Return types must be compatible/same.
class Override extends OverrideParent{
	public static String m1() { //The return type is incompatible with OverrideParent.m1()
		return "Method m1 with no params and String return type";
	}
}
*/