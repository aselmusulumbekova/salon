package kg.m.salon.models.dto;

import kg.m.salon.models.enums.BookingStatus;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
public class BookingTimeDto {
    Long id;
    Date startDate;
    Date endDate;
    Date addDate;
    Date updateDate;
    BookingStatus status;

    List<WorkDayDto> recordId;
    UserDto userDto;
}
