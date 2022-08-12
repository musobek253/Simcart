package simcart.uz.simcart.repository;

import simcart.uz.simcart.entity.Tariff;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TariffRepository extends JpaRepository<Tariff, UUID> {
    
}
