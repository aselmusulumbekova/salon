package kg.m.salon.Maper;

import kg.m.salon.models.dto.WorkDayDto;
import kg.m.salon.models.entities.WorkDay;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface WorkDayMapper extends BaseMapper<WorkDay, WorkDayDto>{
WorkDayMapper INSTANCE= Mappers.getMapper(WorkDayMapper.class);
}
