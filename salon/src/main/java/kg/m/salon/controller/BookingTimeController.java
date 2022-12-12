package kg.m.salon.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.m.salon.configs.Swagger2Config;
import kg.m.salon.models.dto.BookingTimeDto;
import kg.m.salon.models.request.BookingTimeRequest;
import kg.m.salon.service.BookingTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/book")
@Api(tags = Swagger2Config.BookingTime)
public class BookingTimeController {
    @Autowired
    private BookingTimeService service;

    @PostMapping("/save")
    @ApiOperation("Сохранение")
    public ResponseEntity<?>save(@RequestBody BookingTimeDto bookingTimeDto){
        try {
            return ResponseEntity.ok(service.save(bookingTimeDto));
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }

    @PostMapping("create/bookingTime")
    @ApiOperation("Создать  время бронирования")
    public ResponseEntity<?> createBookingTime(@RequestBody BookingTimeRequest request){
        try {
            return ResponseEntity.ok(service.createBookingTime(request));
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }

    @GetMapping("get/bookingTime/list")
    @ApiOperation("Вывод всех")
    public ResponseEntity<?> getBookingTimeList(){
        try {
            return ResponseEntity.ok(service.getList());
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }

    @PutMapping("set/workDay/bookingTime")
    @ApiOperation("Вывести по id_workDay, id_bookingTime")

    public ResponseEntity<?> setBookingTime(@RequestParam Long bookingTimeId, @RequestParam Long workDayId){
        try {
            return ResponseEntity.ok(service.setBookingTime(bookingTimeId,workDayId));
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }


}
