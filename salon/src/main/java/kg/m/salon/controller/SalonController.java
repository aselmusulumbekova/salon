package kg.m.salon.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kg.m.salon.configs.Swagger2Config;
import kg.m.salon.models.dto.SalonDto;
import kg.m.salon.service.SalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/salon")
@Api(tags = Swagger2Config.Salon)
public class SalonController {

    @Autowired
    private SalonService service;

    @PostMapping("/save")
    @ApiOperation("Сохранение")
    public ResponseEntity<?>save(@RequestBody SalonDto salonDto){
        try {
            return ResponseEntity.ok(service.save(salonDto));
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }

    @GetMapping("/get/{id}")
    @ApiOperation("Найти по ID")
    public ResponseEntity<?>findById(@PathVariable Long id) {
        try {
            System.out.println(id);
            return ResponseEntity.ok("ok");

        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);

        }
    }

    @GetMapping("/get/all")
    @ApiOperation("Вывод списка")
    public ResponseEntity<?>getAll(){
        try {
            return ResponseEntity.ok(service.findAll());
        }catch (Exception e){
            return new ResponseEntity<>(e.getMessage(), HttpStatus.I_AM_A_TEAPOT);
        }
    }


}

