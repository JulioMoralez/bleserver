package pack.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pack.model.User;
import pack.service.UserDetailsServiceImpl;

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
public class BasicAuthController {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @GetMapping(path = "/basicauth")
    public User helloWorldBean() {
        return userDetailsService.getAuthUser();
    }

}
