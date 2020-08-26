package pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pack.model.User;
import pack.repository.UserRepo;

import java.util.Collection;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    PasswordEncoder passwordEncoder;

    public User findById(Long id){
        return userRepo.findById(id).orElse(null);
    }

    public User findByUsername(String username){
        return userRepo.findByUsername(username).stream().findAny().orElse(null);
    }

    public List<User> findAll() {
        return userRepo.findAll();
    }

    public User save(User user){
        if (user.getPassword() != null) {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
        }
        return userRepo.save(user);
    }

    public Long deleteById(Long id) {
        if (userRepo.findById(id).isPresent()) {
            userRepo.deleteById(id);
            return id;
        }
        return -1L;
    }

}
