/**
 *
 * Description: Simple condition for checking if
 * temperature is hot, nice, or cold.
 */

public class TemperatureChecker {
	public static void main(String[] args) {
		int temperature = 3;

		System.out.println("Current temperature: " + temperature);

		if (temperature >= 30) {
			System.out.println("It's hot today!");
		} else if (temperature >= 15 && temperature <= 30) {
			System.out.println("Nice weather.");
		} else {
			System.out.println("It's cold.");
		}
	}
}
