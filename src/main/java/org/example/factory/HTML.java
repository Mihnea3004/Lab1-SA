package org.example.factory;

public class HTML implements Document{

	@Override
	public void open() {
		System.out.println("Opened a HTML");
	}

}
