package pl.coderslab.entity;

public class UserDao {
    private static final String CREATE_USER =  "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";

    private static final String READ_USER = "SELECT * FROM users where id = ?";

    private static final String UPDATE_USER = "UPDATE users SET username = ?, email = ?, password = ? where id = ?";

    private static final String DELETE_USER = "DELETE FROM users WHERE id = ?";

    private static final String READ_ALL_USERS =  "SELECT * FROM users";



}
