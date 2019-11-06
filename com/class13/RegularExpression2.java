package com.class13;

public class RegularExpression2 {
	public static void main(String[] args) {
		String str = "Today is our java class"; 
		
		System.out.println(str.replace(" ", ""));
		System.out.println("*********************");
		System.out.println(str.replaceAll("\\s", ""));
		
		String doc = "Video provides a powerful way to help you "
				+ "prove your point. When you click Online Video,"
				+ " you can paste in the embed code for the video you "
				+ "want to add. You can also type a keyword to search "
				+ "online for the video that best fits your document.";
		// If you do not do toLowerCase() then since java is case sensitive
		// It will not replace the words with different casing
		System.out.println(doc.toLowerCase().replace("video", "Audio"));
		
		// Replace everything including the word powerful and what ever comes after that
		// with "" (nothing basically)
		System.out.println(doc.replaceAll("powerful(.*)", ""));
	}
}
