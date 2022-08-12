package simcart.uz.simcart.repository;

import simcart.uz.simcart.entity.Filial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FilialRepository extends JpaRepository<Filial, UUID> {

}
