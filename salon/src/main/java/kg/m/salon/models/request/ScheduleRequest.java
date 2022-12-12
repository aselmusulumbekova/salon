package kg.m.salon.models.request;

import kg.m.salon.models.enums.WorkDayStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Setter
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ScheduleRequest {
    Date startDate;
    Date endDate;
    WorkDayStatus status;
}
