package pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pack.model.User;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    public List<User> findByUsername(String username);
}
