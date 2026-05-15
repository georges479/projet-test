/**
 *Task.java
 *
 *
 */

public class Task {
	private String title;
	private boolean completed;


	public Task(String title) {
		this.title = title;
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

    public boolean isCompleted() {
        return completed;
    }

}
