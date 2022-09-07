package com.brillio.doodling;

import java.util.Scanner;

public class DoodlingTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Color: ");
		
		try {
			String color1 = sc.next().toUpperCase();
			Colors color = Colors.valueOf(color1);
			System.out.println("Enter which instrument you wanna use");
			String instrument1 = sc.next().toUpperCase();
			Instruments tool = Instruments.valueOf(instrument1);

		System.out.println("Enter which shape you wanna draw");
		String shape1 = sc.next().toLowerCase();
		switch(shape1) {
		case "circle":
			Shape circle= new Circle();
			circle.draw(color,tool);
			break;
		case "rectangle":
			Shape rectangle= new Rectangle();
			rectangle.draw(color,tool);
			break;
		case "square":
			Shape square= new Square();
			square.draw(color,tool);
			break;
		default:
			System.out.println("Shape not found");
	
		}
		}catch(Exception e) {
			System.err.println("Please give correct input");
		}
		
		

	}

}
