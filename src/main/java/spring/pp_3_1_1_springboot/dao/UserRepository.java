package spring.pp_3_1_1_springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.pp_3_1_1_springboot.model.User;

public interface UserRepository extends JpaRepository <User, Integer> {
}
