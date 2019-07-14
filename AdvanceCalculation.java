package com.pioneercoders.interfac;
class calcs implements Calculation2 { // class implements the Calculation2  
	int x = 10;
	int y = 8;

	public void add() { // implementing the abstract method add()
		int z = x + y;
		System.out.println("Addition value is: " + z);
	}

	public void sub() { // implementing the abstract method sub()
		int z = x - y;
		System.out.println("Subtraction value is: " + z);
	}
}

class adscalcs implements Calculation1 { // class implements the Calculation1 
	public void add() {
		int x = 10;
		int y = 15;
		int z = x + y;
		System.out.println("Addition value is: " + z);
	}
}

public class AdvanceCalculation {
	public static void main(String args[]) {
	Calculation1 A1 = new calcs(); // creating objects with reference of Calculation1 for class which implements Calculation2
	A1.add();
	Calculation1 A = new adscalcs(); // creating object with reference of Calculation1 for class which implements Calculation1
	A.add();
	Calculation2 B1 = new calcs(); 
	B1.sub();
}
}