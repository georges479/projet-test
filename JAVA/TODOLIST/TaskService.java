import java.util.List;
/**
 *
 *
 */

public class TaskService {

	public static void addNewTask(List<Task> todolist, String title) {
		todolist.add(new Task(title));
	}

	public static void markTaskDone(List<Task> todolist, int index) {
		todolist.get(index).markAsCompleted();
	}

	public static void showTasks(List<Task> todolist) {
		for (Task task : todolist) {
				System.out.println(task);
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
		if (index < 0 || index >= todolist.size()) {
			System.out.println("Index invalide");
		} else {
			todolist.remove(index);
		}
	}
}

