package test2;

import java.util.Scanner;

abstract class Shape {
	int width;

	abstract void area();
}
//your code goes here

class Square extends Shape {

	Square(int sq) {
		this.width = sq;
	}

	void area() {
		System.out.println(width = width * width);
	}
}

class Circle extends Shape {
	Circle(int cr) {
		this.width = cr;

	}

	void area() {
		System.out.println(width = (int) (width * width * Math.PI));
	}
}

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();

		Square a = new Square(x);
		Circle b = new Circle(y);
		a.area();
		b.area();
	}
}
