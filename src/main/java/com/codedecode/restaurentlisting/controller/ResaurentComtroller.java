package com.codedecode.restaurentlisting.controller;

import com.codedecode.restaurentlisting.dto.RestaurentDTO;
import com.codedecode.restaurentlisting.service.RestaurentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/restaurent")
@CrossOrigin
public class ResaurentComtroller {
    @Autowired
    RestaurentService restaurentService;

    @GetMapping("/fetchAllRestaurents")
    public ResponseEntity<List<RestaurentDTO>>fetchallRestaurents()
    {
        List<RestaurentDTO> allRestaurents = restaurentService.findAllResaurents();
        return new ResponseEntity<>(allRestaurents, HttpStatus.OK);
    }

    @PostMapping("/addRestaurent")
    public ResponseEntity<RestaurentDTO> saveRestaurent(@RequestBody RestaurentDTO restaurentDTO)
    {
        RestaurentDTO restaurentadded= restaurentService.addRestaurentInDB(restaurentDTO);
        return new ResponseEntity<>(restaurentadded, HttpStatus.CREATED);
    }
@GetMapping("fetchById/{id}")
    public ResponseEntity<RestaurentDTO> fetchResturentById(@PathVariable Integer id)
    {

        return restaurentService.fetchResturentById(id);


    }
}
