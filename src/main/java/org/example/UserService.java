package org.example;

public class UserService {

    private UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public String getUserNameById(int id) {

        User user = userDao.findById(id);

        return user.name;
    }
}
