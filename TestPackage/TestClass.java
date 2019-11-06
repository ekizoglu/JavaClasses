package TestPackage;

public class TestClass {
	public static void main(String[] arg) {
		int[][] a = {
				{1,1,1},
				{1,1,1},
				{1,1,1,1}
			};
			boolean squareArray = false;
			for (int i = 0; i<a.length ; i++){
			  for (int j = 0 ; j < a[i].length; j++){
		      if ((a.length) == (a[j].length))
		        squareArray = true;
			  }
			  
			}
			System.out.print(squareArray);
	}
}
