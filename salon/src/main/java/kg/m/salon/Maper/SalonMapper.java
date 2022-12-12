package kg.m.salon.Maper;

import kg.m.salon.models.dto.SalonDto;
import kg.m.salon.models.entities.Salon;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface SalonMapper extends BaseMapper<Salon, SalonDto>{
    SalonMapper INSTANCE=Mappers.getMapper(SalonMapper.class);
}
