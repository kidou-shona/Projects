package Day15.ToDoList.controllers;

import Day15.ToDoList.controllers.TodoController;

import javax.swing.*;

public class TodoMenu {

    TodoController todoController = new TodoController();

    public void start() {
        showOptions();
        handleUserChoice();
    }

    private void handleUserChoice() {
        String userChoice = JOptionPane.showInputDialog("Choose an option"); //Like Scanner but not a scanner
        switch (userChoice) {
            case "1":
                //add todo
                todoController.addTodo();
                break;
            case "2":
                // view todo list
                todoController.viewAllTodo();
                break;
            case "3":
                // remove todo
                todoController.removeTodo();
                break;
            case "4":
                // view todo
                todoController.viewTodo();
                break;
            case "5":
                // update todo
                todoController.updateTodo();
                break;
            case "6":
                // exit
                System.exit(0);
                break;
            default:
                System.out.println("Choose an option from the list");
                break;
        }
        start();
    }

    private void showOptions() {
        System.out.println(""
                + "Welcome to Todo Application"
                + "\n 1. Add todo"
                + "\n 2. View todo list"
                + "\n 3. Remove todo"
                + "\n 4. View todo"
                + "\n 5. Update todo"
                + "\n 6. Exit"
        );
    }
}
