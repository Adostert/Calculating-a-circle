package co.grandcircus;

import java.util.Scanner;

/*
 * In java this is considered a concrete class
 * 
 * Classes are considered templates 
 */

public class Circle {
	private double radius;
	private double area;
	static Scanner scan = new Scanner(System.in);

	public double getCircumfrence(double radius) {
		return Math.PI * (2 * radius);
	}

	public double getArea(double radius) {
		return Math.PI * (radius * radius);
	}

	public Circle() {

	}

	public void setRadius(double rad) {
		this.radius = rad;
	}

	public double getRadius() {
		return radius;
	}

	private static String formatNumber(double x) {

		return name;
//	
	}

	// instance variables can we declared anywhere in the class, as long as they
	// are outside of the curly brackets for any method living in the class
	private static String name;

	public String getFormattedCircumfrence1() {

		return this.name = name;

	}

	public String getFormattedArea() {
		return name;
	}

	public static String greeting() {
		return "Welcome to circle tester!";

	}

	{

	}

	@Override
	public String toString() {
		return String.format(" %.2f", radius);

	}

}
