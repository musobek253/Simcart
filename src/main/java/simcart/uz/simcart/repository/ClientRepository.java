package simcart.uz.simcart.repository;

import simcart.uz.simcart.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ClientRepository extends JpaRepository<Client, UUID> {
    boolean existsByPassportNumber(String passportNumber);

    Optional<Client> findByPassportNumber(String number);

}
