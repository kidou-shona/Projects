package Day15.ToDoList.controllers;

import Day15.ToDoList.entity.Todo;
import Day15.ToDoList.repository.TodoRepository;
import Day15.ToDoList.types.STATUS;

import javax.swing.*;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

public class TodoController {

    TodoRepository todoRepository = new TodoRepository();

    public void addTodo() {
        // collect information
        Todo todo = collectTodoInfo();
        // send to DB
        try {
            todoRepository.addTodoToDB(todo);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void markTodo() {

    }

    public void updateTodo() {

    }

    public void viewTodo() {
        int id = 0;
        getUserInput("the id of a todo you want to view");
        try {
            id = Integer.parseInt(String.valueOf(todoRepository.getSingleTodoFromDB()));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        displaySingleTodo();
    }

    public void viewAllTodo() {
        ArrayList<Todo> todoList = new ArrayList<>();
        try {
           todoList = todoRepository.getAllTodoFromDB();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        displayTodoList(todoList);
    }

    public void removeTodo() {

    }

    private Todo collectTodoInfo() {
        Todo todo = new Todo();
        todo.setDescription(getUserInput("description"));
        todo.setDueDate(Date.valueOf(getUserInput("due date (2021-07-31)")));
        todo.setDueTime(Time.valueOf(getUserInput("due time (21:40)") + ":00"));
        todo.setStatus(STATUS.PENDING);
        return todo;
    }

    private String getUserInput(String info) {
        return JOptionPane.showInputDialog("Enter " + info);
    }

    private void displayTodoList(ArrayList<Todo> todoList){
        System.out.println("id \tstatus \tdue date & time \tdescription");
        todoList.forEach(System.out::println);
    }

    private void displaySingleTodo() {
        System.out.println();
    }
}
