package simcart.uz.simcart.repository;

import simcart.uz.simcart.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StaffRepository extends JpaRepository<Staff,Integer> {

    Optional<Staff> findByUserName(String username);
}
