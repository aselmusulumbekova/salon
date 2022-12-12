package kg.m.salon.service;

import kg.m.salon.models.dto.MasterDto;

import java.util.List;

public interface MasterService extends BaseService<MasterDto>{
    List<MasterDto> findBySalon(Long id);
}
