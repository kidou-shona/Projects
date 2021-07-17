package Day15.ToDoList.repository;

import Day15.ToDoList.entity.Todo;
import Day15.ToDoList.types.STATUS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TodoRepository {

    private DBHandler dbHandler = new DBHandler();

    public void addTodoToDB(Todo todo) throws SQLException {
        Connection connection = dbHandler.getConnection();
        String query = "INSERT INTO todos(description, dueDate, dueTime, status)" + "VALUE (?, ?, ?, ?);";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, todo.getDescription());
        preparedStatement.setDate(2, todo.getDueDate());
        preparedStatement.setTime(3, todo.getDueTime());
        preparedStatement.setString(4, todo.getStatus().toString());

        preparedStatement.execute();
    }

    public ArrayList<Todo> getAllTodoFromDB() throws SQLException {
        ArrayList<Todo> todoItems = new ArrayList<>();
        String query = "SELECT * FROM todos";
        PreparedStatement preparedStatement = dbHandler.getConnection().prepareStatement(query);
        ResultSet result = preparedStatement.executeQuery();

        while (result.next()) {
            Todo todo = new Todo(
                    result.getString("description"),
                    result.getInt("id"),
                    result.getDate("dueDate"),
                    result.getTime("dueTime"),
                    STATUS.valueOf(result.getString("status"))
            );
            todoItems.add(todo);
        }
        return todoItems;
    }

    public int getSingleTodoFromDB() throws SQLException {
        int idOfSingleTodo = 0;
        String query = "SELECT * FROM todos WHERE id =" + idOfSingleTodo;
        PreparedStatement preparedStatement = dbHandler.getConnection().prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            resultSet.getInt("id");
        }
        return idOfSingleTodo;
    }
}
