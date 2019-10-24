package co.grandcircus;

import java.util.Scanner;



public class CircleApp {

	public static void main(String[] args) {
		
	
 
		Scanner scan = new Scanner(System.in);
		String userAns;
		boolean isValid = true;

		do {	
		System.out.println("Put in your radius: ");
		double uerInput = scan.nextDouble(); 
		
		
		Circle circle = new Circle();
		circle.setRadius(uerInput);

	
		System.out.println(circle);
		System.out.println("circumference: " + circle.getCircumfrence(uerInput));
		System.out.println("Area: " + circle.getArea(uerInput));
		userAns = Validator.getString(scan, "Continue? y/n");
		if (userAns.charAt(0) != 'y') {
			isValid = false; 
		}

		} while(isValid);

	
	}
}

