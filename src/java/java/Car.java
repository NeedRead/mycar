package java;

public class Car {
	public static int countCars;
	private String name;
	private int year;

	public Car(String name, int year) {
		this.name = name;
		this.year = year;
		countCars++;
	}

	public static int getCountCars() {
		return countCars;
	}

	public static void setCountCars(int countCars) {
		Car.countCars = countCars;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
