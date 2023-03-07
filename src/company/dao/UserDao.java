package dao;

import model.User;

import java.util.ArrayList;

public class UserDao {
    private ArrayList<User> user1 = new ArrayList<>();
    public UserDao() {
    }

    public ArrayList<User> getUser1() {
        return user1;
    }

    public void setUser1(ArrayList<User> user1) {
        this.user1 = user1;
    }

    @Override
    public String toString() {
        return "UserDao{" +
                "user1=" + user1 +
                '}';
    }
}
