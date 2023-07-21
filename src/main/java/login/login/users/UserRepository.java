package login.login.users;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserRepository {
    private static final Map<String, User> users = new HashMap<>();

    static {
        // Przykładowe dane użytkowników
        User user1 = new User("user1", "$2a$12$p9m.Gl2U7Gt/FPGddjl3geaEZBLH4yqpSM6Aonl5hkfJl/5i0ZJXK"); // Hasło: password1
        User user2 = new User("user2", "$2a$12$cX.stdFKZxhv7ZKbChqI5eTIbt71c3xPMdjvZv4EGnCm8pSf9yQlG"); // Hasło: password2

        users.put(user1.getUsername(), user1);
        users.put(user2.getUsername(), user2);
    }

    public User findByUsername(String username) {
        return users.get(username);
    }

}
