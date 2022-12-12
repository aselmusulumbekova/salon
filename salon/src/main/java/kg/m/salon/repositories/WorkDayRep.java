package kg.m.salon.repositories;

import kg.m.salon.models.entities.WorkDay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface WorkDayRep extends JpaRepository<WorkDay,Long> {

    @Modifying
    @Transactional
    @Query(value = "insert into tb_work_day_master(work_day_id,master_id) VALUES(?1,?2)",nativeQuery = true)
    int create(Long workDayId,Long masterId);
}
