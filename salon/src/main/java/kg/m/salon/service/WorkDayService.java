package kg.m.salon.service;

import kg.m.salon.models.dto.WorkDayDto;
import kg.m.salon.models.request.ScheduleRequest;


import java.util.List;

public interface WorkDayService extends BaseService<WorkDayDto>{
    String createSchedule(ScheduleRequest scheduleRequest);

    List<WorkDayDto> getList();

    String setSchedule(Long workDayId, Long masterId);
}
