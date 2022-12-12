package kg.m.salon.repositories;

import kg.m.salon.models.entities.Master;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MasterRep extends JpaRepository<Master,Long> {

    @Query("select m from Master m where m.salonId.id=:salonId")
    List<Master> findBySalon(Long salonId);
}
