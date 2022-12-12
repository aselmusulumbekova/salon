package kg.m.salon.service.impl;

import kg.m.salon.Maper.MasterMapper;
import kg.m.salon.models.dto.MasterDto;
import kg.m.salon.models.entities.Master;
import kg.m.salon.repositories.MasterRep;
import kg.m.salon.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MasterServiceImpl implements MasterService {
    @Autowired
    MasterRep rep;

    MasterMapper mapper=MasterMapper.INSTANCE;
    @Override
    public MasterDto save(MasterDto masterDto) {
        return mapper.toDto(rep.save(mapper.toEntity(masterDto)));
    }

    @Override
    public MasterDto findById(Long id) {
        return MasterMapper.INSTANCE.toDto(rep.findById(id).orElseThrow(()->new RuntimeException("Клиент не найден")));
    }

    @Override
    public List<MasterDto> findAll() {
        return MasterMapper.INSTANCE.toDtos(rep.findAll());
    }

    @Override
    public List<MasterDto> findBySalon(Long id) {
        List<Master> masters=rep.findBySalon(id);
        return mapper.toDtos(masters);
    }
}
