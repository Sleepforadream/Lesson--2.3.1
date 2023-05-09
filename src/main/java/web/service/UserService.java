package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    List<User> getAllUsers();

    User getUserById(Long userId);

    void updateUser(Long id, User user);

    void deleteUser(Long userId);
}
