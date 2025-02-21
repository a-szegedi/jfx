package de.gfn.gui.firstapp1;

import java.time.LocalDateTime;

public class Task {

    private  String title;
    private LocalDateTime createdAt;
    private boolean done;
    private LocalDateTime doneAt;

    public Task() {
    }

    public Task(String title) {
        this.title = title;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Task(boolean done, LocalDateTime createdAt, LocalDateTime doneAt1, String title) {
        this.done = done;
        this.createdAt = createdAt;
        this.doneAt = doneAt1;
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public LocalDateTime getDoneAt() {
        return doneAt;
    }

    public void setDoneAt(LocalDateTime doneAt) {
        this.doneAt = doneAt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
