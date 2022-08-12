package simcart.uz.simcart.repository;

import simcart.uz.simcart.entity.SimCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface SimcardRepository extends JpaRepository<SimCard, UUID> {

    Optional<SimCard> findByCodeAndNumber(String code, String number);

    Optional<SimCard> findBySimCardNumber(String simcardNumber);


}
