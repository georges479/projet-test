package com.georges.todoapp;
import java.util.List;

import org.springframework.stereotype.Service;
/**
 *
 *
 */

@Service
public class TaskService {

	private final TaskRepository repository;

	public TaskService(TaskRepository repository) {
		this.repository = repository;
	}
	
	public void addNewTask(String title) {
		repository.save(new Task(title));
	}

	public void modifyTask(Long id, String newTitle) {
		Task task = repository.findById(id)
			.orElseThrow(() -> new IllegalArgumentException("Tâche intouvable avec l'ID : " + id));
		task.setTitle(newTitle);
		repository.save(task);
		System.out.println("Tâche modifiée avec succès");
	}

	public void markTaskDone(Long id) {
		Task task = repository.findById(id)
			.orElseThrow(() -> new IllegalArgumentException("Tâche intouvable avec l'ID : " + id));
			task.markAsCompleted();
			repository.save(task);
			System.out.println("Tâche terminée : " + task);
	}

	public List<Task> showTasks() {
		List<Task> tasks = repository.findAll();
		if (tasks.isEmpty()) {
			System.out.println("Aucune tâche à afficher");
		}
		return tasks;
	}

	public List<Task> showCompletedTasks() {
		List<Task> tasks = repository.findByCompletedTrue();
		if (tasks.isEmpty()){
			System.out.println("Aucune tâche achever");
		}
		return tasks;
	}

	public List<Task> showPendingTasks() {
		List<Task> tasks = repository.findByCompletedFalse();
		if (tasks.isEmpty()){
			System.out.println("Toutes les tâches sont terminées");
		}
		return tasks;
	}

	public void removeTask(Long id) {
		Task task = repository.findById(id)
			.orElseThrow(() -> new IllegalArgumentException("Tâche intouvable avec l'ID : " + id));
		repository.delete(task);
		System.out.println("Tâche supprimer : " + task);
	}
}

