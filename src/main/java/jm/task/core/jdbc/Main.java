package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {



        UserServiceImpl userService = new UserServiceImpl();

//        List<User> users = userService.getAllUsers();
//        System.out.println(users);
//        userService.saveUser("Igor", "Orlov", (byte) 22);
        userService.createUsersTable();
        userService.saveUser("Ruslan", "Yakovlev", (byte) 32);
        userService.saveUser("Svetlana", "Zaripova", (byte) 31);
        userService.saveUser("Anton", "Morozov", (byte) 33);
        userService.saveUser("Sonya", "Usmanova", (byte) 16);
//        userService.saveUser("Petr", "Petrov", (byte) 24);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
