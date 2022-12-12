package kg.m.salon.repositories;

import kg.m.salon.models.entities.BookingTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface BookingTimeRep extends JpaRepository<BookingTime,Long> {

    @Modifying
    @Transactional
    @Query(value = "insert into tb_bookingtime_user(bookingtime_id,user_id) VALUES(?1,?2)",nativeQuery = true)
    int create(Long bookingTimeId, Long userId);
}
