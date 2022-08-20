package org.system;

 class Computer {
	public void computerModel()
	{
		System.out.println("Dell");
	}

}
public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Desktop Size is 14");
	}

	public static void main(String[] args) {
		Desktop obj1 = new Desktop();
		obj1.computerModel();//Parent class Method
		obj1.desktopSize();//Child Class Method
				
		
		// TODO Auto-generated method stub

	}

}
