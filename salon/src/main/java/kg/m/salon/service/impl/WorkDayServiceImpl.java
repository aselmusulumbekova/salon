package kg.m.salon.service.impl;

import kg.m.salon.Maper.WorkDayMapper;
import kg.m.salon.models.dto.WorkDayDto;
import kg.m.salon.models.request.ScheduleRequest;
import kg.m.salon.repositories.WorkDayRep;
import kg.m.salon.service.MasterService;
import kg.m.salon.service.WorkDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class WorkDayServiceImpl implements WorkDayService {

    private final WorkDayRep rep;
    private final MasterService masterService;


    WorkDayMapper mapper= WorkDayMapper.INSTANCE;

    @Autowired
    public WorkDayServiceImpl(WorkDayRep rep, MasterService masterService) {
        this.rep = rep;
        this.masterService = masterService;
    }

    @Override
    public WorkDayDto save(WorkDayDto workDayDto) {
        return mapper.toDto(rep.save(mapper.toEntity(workDayDto)));
    }

    @Override
    public WorkDayDto findById(Long id) {
        return WorkDayMapper.INSTANCE.toDto(rep.findById(id).orElseThrow(()->new RuntimeException("Клиент не найден")));
    }

    @Override
    public List<WorkDayDto> findAll() {
        return WorkDayMapper.INSTANCE.toDtos(rep.findAll());
    }

    @Override
    public String createSchedule(ScheduleRequest scheduleRequest) {
        WorkDayDto dto=new WorkDayDto();
        dto.setStatus(scheduleRequest.getStatus());
        dto.setStartDate(scheduleRequest.getStartDate());
        dto.setEndDate(scheduleRequest.getEndDate());
        save(dto);
        return "Success";
    }

    @Override
    public List<WorkDayDto> getList() {
        List<WorkDayDto> dayDtos=findAll();
        System.out.println(dayDtos);
        return dayDtos;
    }

    @Override
    public String setSchedule(Long workDayId, Long masterId) {
        int result=rep.create(workDayId,masterId);
        System.out.println(result);
        return "Success";
    }
}
