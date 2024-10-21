package org.example.factory;

public class Word implements Document{

	@Override
	public void open() {
		System.out.println("Opened a Word");
	}

}
