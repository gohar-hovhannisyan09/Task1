package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        System.out.println("Таблица пользователей создана.");

        userService.saveUser("Иван", "Иванов", (byte) 25);
        userService.saveUser("Мария", "Петрова", (byte) 30);
        userService.saveUser("Алексей", "Смирнов", (byte) 22);
        userService.saveUser("Ольга", "Сидорова", (byte) 28);

        System.out.println("Список всех пользователей:");
        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }

        userService.cleanUsersTable();
        System.out.println("Таблица пользователей очищена.");

        userService.dropUsersTable();
        System.out.println("Таблица пользователей удалена.");

    }
}
