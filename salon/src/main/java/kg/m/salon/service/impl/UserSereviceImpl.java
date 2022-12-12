package kg.m.salon.service.impl;

import kg.m.salon.Maper.UserMapper;
import kg.m.salon.models.dto.UserDto;
import kg.m.salon.repositories.UserRep;
import kg.m.salon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserSereviceImpl implements UserService {

    @Autowired
    UserRep rep;
    UserMapper mapper=UserMapper.INSTANCE;
    @Override
    public UserDto save(UserDto userDto) {
        return mapper.toDto(rep.save(mapper.toEntity(userDto)));
    }

    @Override
    public UserDto findById(Long id) {
        return UserMapper.INSTANCE.toDto(rep.findById(id).orElseThrow(()->new RuntimeException("Клиент не найден")));
    }

    @Override
    public List<UserDto> findAll() {

        return UserMapper.INSTANCE.toDtos(rep.findAll());
    }
}
