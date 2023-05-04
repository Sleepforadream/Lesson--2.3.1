package web.service;

import web.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    public static List<User> getUsersByCount(List<User> allUsers, String count) {
        if (count == null) return allUsers;
        List<User> viewedUsers = new ArrayList<>();
        try {
            int countOfUsers = Integer.parseInt(count);
            if (countOfUsers >= 5) {
                return allUsers;
            }
            for (int i = 0; i < countOfUsers; i++) {
                viewedUsers.add(allUsers.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return allUsers;
        }
        return viewedUsers;
    }
}