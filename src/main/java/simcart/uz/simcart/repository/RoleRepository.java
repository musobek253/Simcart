package simcart.uz.simcart.repository;

import simcart.uz.simcart.entity.Role;
import simcart.uz.simcart.entity.enums.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface RoleRepository extends JpaRepository<Role, UUID> {
    Role findByRoleName(RoleName roleName);
}
