package kg.m.salon.service.impl;

import kg.m.salon.Maper.BookingTimeMapper;
import kg.m.salon.models.dto.BookingTimeDto;
import kg.m.salon.models.dto.WorkDayDto;
import kg.m.salon.models.request.BookingTimeRequest;
import kg.m.salon.repositories.BookingTimeRep;
import kg.m.salon.service.BookingTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingTimeServiceImpl implements BookingTimeService {

    @Autowired
    BookingTimeRep rep;

    BookingTimeMapper mapper = BookingTimeMapper.INSTANCE;


    @Override
    public BookingTimeDto save(BookingTimeDto bookingTimeDto) {
        return mapper.toDto(rep.save(mapper.toEntity(bookingTimeDto)));
    }

    @Override
    public BookingTimeDto findById(Long id) {
        return BookingTimeMapper.INSTANCE.toDto(rep.findById(id).orElseThrow(() -> new RuntimeException("")));
    }

    @Override
    public List<BookingTimeDto> findAll() {
        return BookingTimeMapper.INSTANCE.toDtos(rep.findAll());
    }

    @Override
    public String createBookingTime(BookingTimeRequest request) {
        BookingTimeDto dto=new BookingTimeDto();
        dto.setStartDate(request.getStartDate());
        dto.setStatus(request.getStatus());
        dto.setEndDate(request.getEndDate());
        dto.setUpdateDate(request.getUpdateDate());
        save(dto);
        return "Success";
    }

    @Override
    public List<BookingTimeDto> getList() {
        List<BookingTimeDto> timeDtos=findAll();
        System.out.println(timeDtos);
        return timeDtos;

    }

    @Override
    public String setBookingTime(Long BookingTimeId, Long workDayId) {
        int result=rep.create(BookingTimeId,workDayId);
        System.out.println(result);
        return "Success";

    }
}
