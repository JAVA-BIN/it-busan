package tk.meokeobolre.user.repository;

import tk.meokeobolre.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findById(String id);

    User findByName(String name);
}
