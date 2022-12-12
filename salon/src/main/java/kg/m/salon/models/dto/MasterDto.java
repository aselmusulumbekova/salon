package kg.m.salon.models.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MasterDto {
    Long id;
    String name;
    int experience;
    SalonDto salonId;


}
