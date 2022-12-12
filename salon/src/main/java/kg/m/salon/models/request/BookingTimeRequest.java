package kg.m.salon.models.request;

import kg.m.salon.models.enums.BookingStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookingTimeRequest {

    Date startDate;
    Date endDate;
    Date addDate;
    Date updateDate;
    BookingStatus status;
}
