package com.class12;

public class SingleArrayRecapDemo {

	public static void main(String[] args) {

		int [] array1=new int[4];
		array1[0]=12;
		array1[1]=13;
		array1[2]=14;
		array1[3]=14;
		
		//System.out.println(array1[1]);//A
		int num1=0;
		for (int s = 0; s < 4; s++) {
			
			num1=num1+array1[s];
			System.out.println(array1[s]);
		}
		System.out.println("The sum of Array1 is= "+num1);
		System.out.println("===========");
		
		
		int [] array2= {2,5,4,7};
		
		for(int i: array2) {
			System.out.println(i);
		}
		
		
		
		
		
	}

}
