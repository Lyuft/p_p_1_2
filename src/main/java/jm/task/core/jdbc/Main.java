package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) throws Exception {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Nikita", "Steve", (byte)12);
        userService.saveUser("Ivan", "Sergey", (byte)14);
        userService.saveUser("Artem", "Masha", (byte)11);
        userService.saveUser("Vlad", "Svetlana", (byte)72);

        System.out.println("До очистки:" + "\n");
        userService.getAllUsers();

        userService.cleanUsersTable();
        System.out.println("После очистки:" + "\n");

        userService.dropUsersTable();

        Util.close();
    }
}
