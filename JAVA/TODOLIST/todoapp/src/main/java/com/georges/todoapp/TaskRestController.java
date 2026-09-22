package com.georges.todoapp;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskRestController {

    private final TaskService taskService;
    
    public TaskRestController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/tasks")
    public void addTask(@RequestBody Task task) {
        taskService.addNewTask(task.getTitle());
    }

    @GetMapping("/tasks")
    public List<Task> getTask(@RequestParam(required = false) String status) {
        if ("completed".equals(status)) {
            return taskService.showCompletedTasks();
        }
        else if ("pending".equals(status)) {
            return taskService.showPendingTasks();
        }
        else {
            return taskService.showTasks();
        }
    }

    @PutMapping("/tasks/{id}")
    public void renameTask(@PathVariable Long id, @RequestBody Task task) {
        taskService.modifyTask(id, task.getTitle());
    }

    @PutMapping("/tasks/{id}/completed")
    public void completeTask(@PathVariable Long id) {
        taskService.markTaskDone(id);
    } 

    @DeleteMapping("/tasks/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskService.removeTask(id);
    }
}
