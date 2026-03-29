import java.util.List;

// Service class to perform operations on Car objects
public class CarService {

	// Find and display cars by marque
	public static void findByMarque(List<Car> garage, String marque) {
		for (Car car : garage) {
			if (car.getMarque().equals(marque)) {
				System.out.println(car);
			}
		}
	}

	// Find and display cars by exact power
	public static void findByPower(List<Car> garage, int power) {
		for (Car car : garage) {
			if (car.getPower() == power) {
				System.out.println(car);
			}
		}
	}

    // Find and display cars with power less than a given value
	public static void findByPowerLessThan(List<Car> garage, int power) {
		for (Car car : garage) {
            if (car.getPower() < power) {
                System.out.println(car);
            }
        }
    }

	// Find and display cars with power greater than a given value
	public static void findByPowerGreaterThan(List<Car> garage, int power) {
		for (Car car : garage) {
			if (car.getPower() > power) {
				System.out.println(car);
			}
		}
	}
}
