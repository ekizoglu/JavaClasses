package com.class22;

public class AccessModifiersTest {

	public static void main(String[] args) {
		AccessModifiers.hello();
		AccessModifiers.hello1();
		AccessModifiers.hello2();
		//not acceptable since permission is set to private
		//AccessModifiers.hello3();

	}
}