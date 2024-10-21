package org.example.factory;

public class PDF implements Document{

	@Override
	public void open() {
		System.out.println("Opened a PDF");
	}

}
