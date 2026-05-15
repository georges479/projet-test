import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 *
 */
public class Main {

	public static void main(String[] args) {

		List<Task> todolist = new ArrayList<>();

		/**TaskService.addNewTask(todolist, "Apprendre à coder en Java");
		TaskService.addNewTask(todolist, "Lire le chapitre 2 de mon livre");
		TaskService.addNewTask(todolist, "Faire du sport");
		TaskService.addNewTask(todolist, "Préparer le dîner");

		TaskService.markTaskDone(todolist, 1);
		TaskService.markTaskDone(todolist, 3);
		
		TaskService.showCompletedTasks(todolist);

		TaskService.removeTask(todolist, 0);

		for (Task task : todolist) {
			System.out.println(task);
		}
		*/

		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			System.out.println("1. Créer une tâche");
			System.out.println("2. Afficher les tâches");
			System.out.println("0. Quitter");

			System.out.println("Séléctionez une option : ");
			 choice = scanner.nextInt();
			 scanner.nextLine();

			switch (choice) {
				case 1:
					System.out.println("Entrez le nom de la nouvelle tâche : ");
					String line = scanner.nextLine();
					TaskService.addNewTask(todolist, line);
					System.out.println("Tâche créée avec succès! ");
					System.out.println("Tâche ajoutée: " + line);
					break;
				case 2:
					System.out.println("Liste de vos tâches : ");
					TaskService.showTasks(todolist);
					break;
				case 0:
					System.out.println("A bientôt !");
					break;
				default:
					System.out.println("Option invalide");
					break;
			}
		} while (choice != 0);
	}
}
