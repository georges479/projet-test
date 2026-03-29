import java.util.ArrayList;
import java.util.List;

/**
 * Example of a simple Java program that defines a Car class and displays its information.
 */
public class Main {

	// Main method
	public static void main(String[] args) {

		// Example of a garage to hold multiple cars
		List<Car> garage = new ArrayList<>();

		garage.add(new Car("BMW", "X5", 230));
		garage.add(new Car("Audi", "A4", 190));
		garage.add(new Car("Toyota", "Corolla", 130));
		garage.add(new Car("Mercedes", "Class A", 150));
		garage.add(new Car("Renault", "Megane", 110));

		CarService.findByMarque(garage, "Renault");
		CarService.findByPowerLessThan(garage, 180);
		CarService.findByPowerGreaterThan(garage, 160);
		CarService.findByPower(garage, 230);
	}
}
