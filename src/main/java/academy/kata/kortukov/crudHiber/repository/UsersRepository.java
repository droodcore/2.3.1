package academy.kata.kortukov.crudHiber.repository;

import academy.kata.kortukov.crudHiber.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsersRepository extends JpaRepository<User, Integer> {
}
