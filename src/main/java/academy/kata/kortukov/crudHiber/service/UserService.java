package academy.kata.kortukov.crudHiber.service;


import academy.kata.kortukov.crudHiber.model.User;

import java.util.List;

public interface UserService {
    public List<User> findAll();
    public User show(int id);
    public void save(User user);
    public void update(int id, User updatedUser);
    public void delete(int id);
}
