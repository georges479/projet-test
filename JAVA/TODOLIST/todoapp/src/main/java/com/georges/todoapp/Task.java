package com.georges.todoapp;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

/**
 *Task.java
 *
 *
 */

 @Entity
public class Task {
	@Id
	@GeneratedValue
	private Long id;

	private String title;
	private boolean completed;


	public Task(String title) {
		this.title = title;
	}

	public Task(){
	}

	public void markAsCompleted() {
		completed = true;
	}

	@Override
	public String toString() {
		if (completed)  {
			return "[x] " + title;
		} else {
			return "[ ] " + title;
		}
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

    public boolean isCompleted() {
        return completed;
    }

}
