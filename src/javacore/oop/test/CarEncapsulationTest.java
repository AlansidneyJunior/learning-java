package javacore.oop.test;

import javacore.oop.classes.CarEncapsulation;

public class CarEncapsulationTest {

	public static void main(String[] args) {
		CarEncapsulation car = new CarEncapsulation();

		car.setName("Fusca");
		car.setBrand("VW");
		car.setYear(1970);

		System.out.println(car);
	}

}
