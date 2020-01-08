package zw.co.cytex.polls.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.co.cytex.polls.model.User;

import java.util.List;
import java.util.Optional;

/**
 * @author : Webster Moswa
 * @since : 1/7/20, Tue
 * email: webstermoswa11@gmail.com
 * mobile: 0771407147
 **/


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);

    Optional<User> findByUsernameOrEmail(String username, String email);

    List<User> findByIdIn(List<Long> userIds);

    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}