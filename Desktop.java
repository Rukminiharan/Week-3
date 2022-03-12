package org;

public class Desktop extends Computer {

	public void desktopSize()
	{
		System.out.println("The Size of the desktop is 16 inches");
	}
	
	public static void main (String xx[])
	
	{
		Desktop obj = new Desktop();
		obj.desktopSize();
		obj.computerModel(); //with the same object of child class can call the parent class.
		//This is single inheritence
	}
}
