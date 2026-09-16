/**import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.georges.todoapp.Task;
import com.georges.todoapp.TaskService;

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


		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			System.out.println("1. Créer une tâche");
			System.out.println("2. Mofifier une tâche");
			System.out.println("3. Afficher les tâches");
			System.out.println("4. Afficher les tâches terminée");
			System.out.println("5. Terminer une tâche");
			System.out.println("6. Supprimer une tâche");
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
				case 2: {
					TaskService.showTasks(todolist);
					System.out.println("Entrez le numéro de la tâche à modifier : ");
					int index = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Entrez le nouveau nom pour la tâche : ");
					String newTitle = scanner.nextLine();
					TaskService.modifyTask(todolist, index, newTitle);
				}
				case 3:
					System.out.println("Liste de vos tâches : ");
					TaskService.showTasks(todolist);
					break;
				case 4:
					System.out.println("Liste de vos tâche achevé");
					TaskService.showCompletedTasks(todolist);
					break;
				case 5: {
                    TaskService.showTasks(todolist);
                    System.out.println("Entrez le numéro de la tâche à terminer : ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    TaskService.markTaskDone(todolist, index);
                    break;
				}
				case 6: {
					TaskService.showTasks(todolist);
					System.out.println("Entrez le numéro de la tâche à supprimer : ");
					int index = scanner.nextInt();
					scanner.nextLine();
					TaskService.removeTask(todolist, index);

					break;
				}
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
*/