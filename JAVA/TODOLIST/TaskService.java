import java.util.List;
/**
 *
 *
 */

public class TaskService {

	public static void addNewTask(List<Task> todolist, String title) {
		todolist.add(new Task(title));
	}

	public static void modifyTask(List<Task> todolist, int index, String newTitle) {
		index = index - 1;
		if (index < 0 || index >= todolist.size()) {
			System.out.println("Index invalide");
		} else {
			todolist.get(index).setTitle(newTitle);
			System.out.println("Tâche modifiée avec succès");
		}
	}

	public static void markTaskDone(List<Task> todolist, int index) {
		index = index - 1;
		if (index < 0 || index >= todolist.size()) {
			System.out.println("Index invalide");
		} else {
			todolist.get(index).markAsCompleted();
			System.out.println("Tâche terminée : " + (index + 1));
		}
	}

	public static void showTasks(List<Task> todolist) {
		int index = 0;
		for (Task task : todolist) {
			index++;
			System.out.println(index + ". " + task);
		}
	}

	public static void showCompletedTasks(List<Task> todolist) {
		for (Task task : todolist) {
			if (task.isCompleted()) {
				System.out.println(task);
			}
		}
	}

	public static void showPendingTasks(List<Task> todolist) {
		for (Task task : todolist) {
			if (!task.isCompleted()) {
				System.out.println(task);
			}
		}
	}

	public static void removeTask(List<Task> todolist, int index) {
		index = index - 1;
		if (index < 0 || index >= todolist.size()) {
			System.out.println("Index invalide");
		} else {
			todolist.remove(index);
			System.out.println("Tâche supprimer : " + (index + 1));
		}
	}
}

