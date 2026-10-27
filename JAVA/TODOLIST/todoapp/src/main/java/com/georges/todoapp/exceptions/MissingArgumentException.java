package com.georges.todoapp.exceptions;

public class MissingArgumentException extends RuntimeException {
    public MissingArgumentException() {
        super("Titre de la tâche invalide");
    }
}
