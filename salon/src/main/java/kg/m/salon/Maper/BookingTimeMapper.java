package kg.m.salon.Maper;

import kg.m.salon.models.dto.BookingTimeDto;
import kg.m.salon.models.entities.BookingTime;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface BookingTimeMapper extends BaseMapper<BookingTime, BookingTimeDto> {
    BookingTimeMapper INSTANCE= Mappers.getMapper(BookingTimeMapper.class);
}
