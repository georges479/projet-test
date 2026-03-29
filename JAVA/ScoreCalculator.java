/**
 *
 * Description: Score clalculation based on arithmetic operations.
 */

public class ScoreCalculator {

	public static void main(String[] args) {
		int score = 10;
		System.out.println("Initial score: " + score);

		score += 5;
		System.out.println("After adding 5: " + score);

		score -= 2;
		System.out.println("After subtracting 2: " + score);

		score *= 2;
		System.out.println("After multiplying by 2: " + score);

		score /= 3;
		System.out.println("After dividing by 3: " + score);
	}
}
