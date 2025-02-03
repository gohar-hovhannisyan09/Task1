package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoJDBCImpl();
    UserDao userDaoHibernate = new UserDaoHibernateImpl();

    public void createUsersTable() {
        userDao.createUsersTable();
        userDaoHibernate.createUsersTable();
    }

    public void dropUsersTable() {
        userDao.dropUsersTable();
        userDaoHibernate.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
        userDaoHibernate.saveUser(name, lastName, age);
        System.out.println("Пользователь с именем " + name + " " + lastName + " создана.");
    }

    public void removeUserById(long id) {
        userDao.removeUserById(id);
        userDaoHibernate.removeUserById(id);
    }

    public List<User> getAllUsers() {
        //userDao.getAllUsers();
        return userDaoHibernate.getAllUsers();

    }

    public void cleanUsersTable() {
        userDao.cleanUsersTable();
        userDaoHibernate.createUsersTable();
    }
}
