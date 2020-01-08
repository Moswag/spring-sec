package zw.co.cytex.polls.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.co.cytex.polls.model.Role;
import zw.co.cytex.polls.model.RoleName;

import java.util.Optional;

/**
 * @author : Webster Moswa
 * @since : 1/7/20, Tue
 * email: webstermoswa11@gmail.com
 * mobile: 0771407147
 **/

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}