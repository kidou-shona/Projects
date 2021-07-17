package Day15.ToDoList.entity;

import Day15.ToDoList.types.STATUS;

import java.sql.Date;
import java.sql.Time;

public class Todo {

    String description;
    int id;
    Date dueDate;
    Time dueTime;
    STATUS status;

    public Todo() {
    }

    public Todo(String description, int id, Date dueDate, Time dueTime, STATUS status) {
        this.description = description;
        this.id = id;
        this.dueDate = dueDate;
        this.dueTime = dueTime;
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Time getDueTime() {
        return dueTime;
    }

    public void setDueTime(Time dueTime) {
        this.dueTime = dueTime;
    }

    public void setStatus(STATUS status) {
        this.status = status;
    }

    public STATUS getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return id +
                " \t" + status +
                " \t" + dueDate +
                " \t" + dueTime +
                " \t" + description;
    }
}
