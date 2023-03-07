package service;

import model.User;

public interface UserService {
    void saveUser (User user);
    void FindID(int id);
    void DeliteId (int id);
    void GetAllUser()
}
