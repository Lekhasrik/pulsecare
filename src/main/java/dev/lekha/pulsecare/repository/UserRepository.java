//package dev.lekha.pulsecare.repository;
//
//public class UserRepository {
//}

package dev.lekha.pulsecare.repository;

import dev.lekha.pulsecare.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
