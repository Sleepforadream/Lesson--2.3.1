package web.UserDao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void createUser();
    List<User> viewAllUsers();
    void updateUser();
    void deleteUser();
}
