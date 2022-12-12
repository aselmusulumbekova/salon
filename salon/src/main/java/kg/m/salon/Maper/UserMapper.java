package kg.m.salon.Maper;

import kg.m.salon.models.dto.UserDto;
import kg.m.salon.models.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface UserMapper extends BaseMapper<User, UserDto>{
    UserMapper INSTANCE= Mappers.getMapper(UserMapper.class);
}
