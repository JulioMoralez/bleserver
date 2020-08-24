package pack.rest;

import org.springframework.web.bind.annotation.*;
import pack.model.User;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private List<User> users = Stream.of(
            new User(1L, "Sam", "123456"),
            new User(2L, "Max", "1"),
            new User(3L, "Jane", "q")
    ).collect(Collectors.toList());

    @GetMapping
    public List<User> getAll() {
        return users;
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Long id) {
        return users.stream().filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public User create(@RequestBody User user) {
        users.add(user);
        return user;
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        users.removeIf(user -> user.getId().equals(id));
    }
}
