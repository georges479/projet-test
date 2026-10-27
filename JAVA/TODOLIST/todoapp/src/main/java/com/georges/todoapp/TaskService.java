package com.georges.todoapp;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.georges.todoapp.dto.TaskCreateDto;
import com.georges.todoapp.dto.TaskDto;
import com.georges.todoapp.exceptions.MissingArgumentException;
import com.georges.todoapp.exceptions.TaskNotFoundException;
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

	//Transfert vers la DB
	private Task toEntity(TaskCreateDto taskCreateDto) {
		Task task = new Task();
		task.setTitle(taskCreateDto.getTitle());
		return task;
	}

	//Transfert vers le client
	private TaskDto toDto(Task task) {
		TaskDto dto = new TaskDto();
		dto.setId(task.getId());
		dto.setTitle(task.getTitle());
		return dto;
	}

	private List<TaskDto> listToDto(List<Task> tasks) {
		List<TaskDto> tasksDto = new ArrayList<>();
		for (Task task : tasks) {
			tasksDto.add(toDto(task));
		}
		return tasksDto;
	}
	
	public void addNewTask(TaskCreateDto taskCreateDto) {
		if (taskCreateDto.getTitle() == null || taskCreateDto.getTitle().isBlank()) {
			throw new MissingArgumentException();
		}
		Task task = toEntity(taskCreateDto);
		repository.save(task);
	}

	public void modifyTask(Long id, String newTitle) {
		Task task = repository.findById(id)
			.orElseThrow(() -> new TaskNotFoundException(id));
		task.setTitle(newTitle);
		repository.save(task);
		System.out.println("Tâche modifiée avec succès");
	}

	public void markTaskDone(Long id) {
		Task task = repository.findById(id)
			.orElseThrow(() -> new TaskNotFoundException(id));
			task.markAsCompleted();
			repository.save(task);
			System.out.println("Tâche terminée : " + task);
	}

	public List<TaskDto> showTasks() {
		List<Task> tasks = repository.findAll();
		return listToDto(tasks);
	}

	public List<TaskDto> showCompletedTasks() {
		List<Task> tasks = repository.findByCompletedTrue();
		return listToDto(tasks);
	}

	public List<TaskDto> showPendingTasks() {
		List<Task> tasks = repository.findByCompletedFalse();
		return listToDto(tasks);
	}

	public void removeTask(Long id) {
		Task task = repository.findById(id)
			.orElseThrow(() -> new TaskNotFoundException(id));
		repository.delete(task);
		System.out.println("Tâche supprimer : " + task);
	}
}

