public class Task {

private String title;

private boolean isCompleted;

// Constructor call when creating a new task

    public Task(String title)
    { 
        this.title = title;
        this.isCompleted = false; // default value is false
    
    }
    
    // method to mark the task as completed

    public void markAsDone() {

        this.isCompleted = true;

    }

    // getter methods to retrieve the title 
    public String getTitle() {

        return title;
    }

    public boolean isCompleted() {

        return isCompleted;

    }

    @Override 
    public String toString() {

        return (isCompleted ? "[X] " : "[ ] ") + title;
    }


}
