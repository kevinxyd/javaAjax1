package service;


import dao.UserDao;
import pojo.User;

import java.util.List;

public class UserService {
    private UserDao userDao = new UserDao();

    public List<User> listPrivice(){
        return userDao.listPrice();
    }
    public List<User> listPrice2(Integer pid) {
        return userDao.listPrice2(pid);
    }
}
