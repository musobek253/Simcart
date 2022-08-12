package simcart.uz.simcart.repository;

import simcart.uz.simcart.entity.UssdCode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface USSDRepository extends JpaRepository<UssdCode, UUID> {


}
