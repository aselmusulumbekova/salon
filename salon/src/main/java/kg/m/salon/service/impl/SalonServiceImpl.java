package kg.m.salon.service.impl;

import kg.m.salon.Maper.SalonMapper;
import kg.m.salon.models.dto.SalonDto;
import kg.m.salon.repositories.SalonRep;
import kg.m.salon.service.SalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SalonServiceImpl implements SalonService {

    @Autowired
    SalonRep rep;
    SalonMapper mapper=SalonMapper.INSTANCE;

    @Override
    public SalonDto save(SalonDto salonDto) {
        return mapper.toDto(rep.save(mapper.toEntity(salonDto)));
    }

    @Override
    public SalonDto findById(Long id) {
        return SalonMapper.INSTANCE.toDto(rep.findById(id).orElseThrow(()->new RuntimeException("")));
    }

    @Override
    public List<SalonDto> findAll() {
        return SalonMapper.INSTANCE.toDtos(rep.findAll());
    }
}
