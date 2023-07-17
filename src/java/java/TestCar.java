package java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCar {

	@Test
	public void countCarsNumber() {
		new Car("Jaguar", 1994);
		new Car("Mondeo", 2023);
		assertEquals(2, Car.countCars);
	}
}
