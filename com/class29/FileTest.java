package com.class29;

public class FileTest {
	public static void main(String[] args) {
		File j =new JavaFile(); 
		File w = new WordFile(); 
		File p = new PDFFile(); 
		
	
		j.open(); 
		j.edit(); 
		j.close();
		System.out.println("***************************");
		w.open(); 
		w.edit(); 
		w.close();
		System.out.println("***************************");
		p.open(); 
		p.edit(); 
		p.close();
	}
}
