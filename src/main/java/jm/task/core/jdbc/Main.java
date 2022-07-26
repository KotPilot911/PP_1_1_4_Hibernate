package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Ruslan", "Yakovlev", (byte) 32);
        userService.saveUser("Svetlana", "Zaripova", (byte) 31);
        userService.saveUser("Anton", "Morozov", (byte) 33);
        userService.saveUser("Sonya", "Usmanova", (byte) 16);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
