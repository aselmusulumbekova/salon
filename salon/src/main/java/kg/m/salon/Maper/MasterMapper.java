package kg.m.salon.Maper;

import kg.m.salon.models.dto.MasterDto;
import kg.m.salon.models.entities.Master;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface MasterMapper extends BaseMapper<Master, MasterDto>{
    MasterMapper INSTANCE= Mappers.getMapper(MasterMapper.class);

}
