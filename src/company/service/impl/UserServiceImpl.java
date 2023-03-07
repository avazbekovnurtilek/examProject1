package service.impl;

import dao.UserDao;
import model.User;
import service.UserService;

public class UserServiceImpl implements UserService {
    private final UserDao userDao = new UserDao();


    @Override

    public void saveUser(User user) {
        userDao.getUser1().add(user);
        System.out.println(user);
    }

    @Override
    public void FindID(int id) {
        
    }

    @Override
    public void DeliteId(int id) {

    }

    @Override
    public void GetAllUser() {

    }
}
