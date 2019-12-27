package com.class29;

public abstract class File {
	abstract void open();
	void edit() {
		System.out.println("editing file");
	}
	void close() {
		System.out.println("closing file");
	}
}

class JavaFile extends File{
	void open() {
		System.out.println("opening java file");
	}
}

class WordFile extends File{
	void open() {
		System.out.println("opening word file");
	}
}

class PDFFile extends File{
	void open() {
		System.out.println("opening pdf file");
	}
}


