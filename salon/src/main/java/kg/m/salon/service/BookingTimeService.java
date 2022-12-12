package kg.m.salon.service;

import kg.m.salon.models.dto.BookingTimeDto;
import kg.m.salon.models.dto.WorkDayDto;
import kg.m.salon.models.request.BookingTimeRequest;
import kg.m.salon.models.request.ScheduleRequest;

import java.util.List;

public interface BookingTimeService extends BaseService<BookingTimeDto>{
    String createBookingTime(BookingTimeRequest request);

    List<BookingTimeDto> getList();

    String setBookingTime(Long BookingTimeId, Long workDayId);

}
