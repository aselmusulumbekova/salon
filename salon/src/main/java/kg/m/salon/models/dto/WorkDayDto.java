package kg.m.salon.models.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import kg.m.salon.models.entities.Master;
import kg.m.salon.models.enums.WorkDayStatus;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

import static org.springframework.format.annotation.DateTimeFormat.*;

@Setter
@Getter
public class WorkDayDto {
    Long id;
    Date startDate;
    Date endDate;

    List<MasterDto> masterId;
    WorkDayStatus status;
}
