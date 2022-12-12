package kg.m.salon.repositories;

import kg.m.salon.models.entities.Salon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalonRep extends JpaRepository<Salon,Long> {
}
