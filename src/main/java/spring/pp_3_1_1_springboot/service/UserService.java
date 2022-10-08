package spring.pp_3_1_1_springboot.service;



import spring.pp_3_1_1_springboot.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public void saveUser(User user);

    public void updateUser(User user);

    public User getUser(int id);

    public void deleteUser(int id);

}
