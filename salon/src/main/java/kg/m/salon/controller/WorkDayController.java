package kg.m.salon.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.m.salon.configs.Swagger2Config;
import kg.m.salon.models.dto.WorkDayDto;
import kg.m.salon.models.enums.WorkDayStatus;
import kg.m.salon.models.request.ScheduleRequest;
import kg.m.salon.service.WorkDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("api/v1/day")
@Api(tags = Swagger2Config.WorkDay)
public class WorkDayController {

    @Autowired
    private WorkDayService service;

    @PostMapping("/save")
    @ApiOperation("Сохраниение")
    public ResponseEntity<?>save(@RequestBody WorkDayDto workDayDto){
        try {
            return ResponseEntity.ok(service.save(workDayDto));
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }


    @PostMapping("create/schedule")
    @ApiOperation("Создать график")
    public ResponseEntity<?> createSchedule(@RequestBody ScheduleRequest request){
        try {
            return ResponseEntity.ok(service.createSchedule(request));
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }

    @GetMapping("get/schedule/list")
    @ApiOperation("Получить график по массиву")
    public ResponseEntity<?> getScheduleList(){
        try {
            return ResponseEntity.ok(service.getList());
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }

    @PutMapping("set/master/schedule")
    @ApiOperation("вернуть график мастера по ID")
    public ResponseEntity<?> setSchedule(@RequestParam Long workDayId,@RequestParam Long masterId){
        try {
            return ResponseEntity.ok(service.setSchedule(workDayId,masterId));
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }




}
