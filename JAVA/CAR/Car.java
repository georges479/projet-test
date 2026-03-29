/**
 * Class representing a car with basic attributes and methods.
 */

public class Car {

	// Attributes
	private String marque;
	private String model;
	private int power;
	private int speed;

	// Constructor
	public Car(String marque, String model, int power) {
		this.marque = marque;
		this.model = model;
		this.power = power;
		this.speed = 0;
	}

	// Method to display car information
	public void showInfo() {
		System.out.println("Marque: " + marque);
		System.out.println("Model: " + model);
		System.out.println("Power: " + power + " hp");
		System.out.println("Speed: " + speed + " km/h");
	}

	// Method to accelerate the car
	public void accelerate(int value) {
		speed += value;
		System.out.println("Speed increased: " + speed + " km/h");
	}

	// Method to brake the car
	public void brake(int value) {
		speed -= value;
		if (speed < 0) {
			speed = 0;
		}
		System.out.println("Speed decreased: " + speed + " km/h");
	}

	// Getters
	public int getSpeed() {
		return speed;
	}

	public String getMarque() {
		return marque;
	}

	public String getModel() {
		return model;
	}

	public int getPower() {
		return power;
	}

	// toString method
	@Override
	public String toString() {
		return "Car [marque=" + marque +
		", model=" + model +
		", power=" + power +
		", speed=" + speed + " km/h]";
	}
}
