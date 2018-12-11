package dao;

import model.Login;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private static List<User> userList =new ArrayList<>();
    static {
        User u1 = new User("Dat", "18", "phamdat", "phamdat@gmail.com", "12345678");
        User u2 = new User("Khoi", "18", "duckhoi", "duckhoi@gmail.com", "12345678");
        User u3 = new User("Chinh", "18", "minhchinh", "minhchinh@gmail.com", "12345678");
        userList.add(u1);
        userList.add(u2);
        userList.add(u3);
    }

    public static User checkLogin(Login login){
        for (User user: userList){
            if (user.getAccount().equals(login.getAccount()) && user.getPassword().equals(login.getPassword())){
                return user;
            }
        }
        return null;
    }
}
