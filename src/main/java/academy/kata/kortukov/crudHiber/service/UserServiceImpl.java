package academy.kata.kortukov.crudHiber.service;

import academy.kata.kortukov.crudHiber.model.User;
import academy.kata.kortukov.crudHiber.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl {

    private UsersRepository usersRepository;

    @Autowired
    public UserServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }


    public List<User> findAll() {
        return usersRepository.findAll();
    }

    public User show(int id) {
        Optional<User> findedOrNot = usersRepository.findById(id);
        return findedOrNot.orElse(null);
    }

    @Transactional
    public void save(User user) {
        usersRepository.save(user);
    }

    @Transactional
    public void update(int id, User updatedUser) {
        updatedUser.setId(id);
        usersRepository.save(updatedUser);
    }

    @Transactional
    public void delete(int id) {
        usersRepository.deleteById(id);
    }
}
