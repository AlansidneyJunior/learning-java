package javacore.oop.test;

import javacore.oop.classes.Car;

public class CarTest {

	public static void main(String[] args) {
		Car car = new Car();

		car.name = "HB20";
		car.brand = "Hyundai";
		car.year = 2020;

		System.out.println(car);

	}

}
