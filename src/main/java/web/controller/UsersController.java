package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.User;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UsersController {

    @GetMapping(value = "/users")
    public String viewUsers(ModelMap model, HttpServletRequest request) {
        List<User> users = new ArrayList<>();
        return null;
    }
}
