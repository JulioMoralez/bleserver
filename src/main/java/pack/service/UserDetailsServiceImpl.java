package pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pack.model.SecurityUser;
import pack.model.User;
import pack.repository.UserRepo;

@Service("userDetailsServiceImpl")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;

    private User authUser;

    public User getAuthUser() {
        return authUser;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUsername(username).stream().findFirst().orElse(null);
        System.out.println(user);
        if (user != null){
            authUser = user;
            return SecurityUser.fromUser(user);
        }
        return null;
    }
}
