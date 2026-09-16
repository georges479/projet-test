package com.georges.todoapp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
/**
 *
 *
 */

@Service
public class TaskService {

	private List<Task> tasks;

	public TaskService() {
		this.tasks = new ArrayList<>();
	}
	
	public void addNewTask(String title) {
		tasks.add(new Task(title));
	}

	public void modifyTask(int index, String newTitle) {
		index = index - 1;
		if (index < 0 || index >= tasks.size()) {
			System.out.println("Index invalide");
		} else {
			tasks.get(index).setTitle(newTitle);
			System.out.println("Tâche modifiée avec succès");
		}
	}

	public void markTaskDone(int index) {
		index = index - 1;
		if (index < 0 || index >= tasks.size()) {
			System.out.println("Index invalide");
		} else {
			tasks.get(index).markAsCompleted();
			System.out.println("Tâche terminée : " + (index + 1));
		}
	}

	public List<Task> showTasks() {
		if (tasks.isEmpty()) {
			System.out.println("Aucune tâche à afficher");
		}
		return tasks;
	}

	public List<Task> showCompletedTasks() {
		List<Task> completedTasks = new ArrayList<>();
		for (Task task : tasks) {
			if (task.isCompleted()) {
				completedTasks.add(task);
			}
		}
		return completedTasks;
	}

	public List<Task> showPendingTasks() {
		List<Task> pendingTasks = new ArrayList<>();
		for (Task task : tasks) {
			if (!task.isCompleted()) {
				pendingTasks.add(task);
			}
		}
		return pendingTasks;
	}

	public void removeTask(int index) {
		index = index - 1;
		if (index < 0 || index >= tasks.size()) {
			System.out.println("Index invalide");
		} else {
			tasks.remove(index);
			System.out.println("Tâche supprimer : " + (index + 1));
		}
	}
}

