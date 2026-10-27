package com.georges.todoapp.exceptions;

public class TaskNotFoundException extends RuntimeException {
    public TaskNotFoundException(Long id) {
        super("Tâche intouvable avec l'ID : " + id);
    }
}