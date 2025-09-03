package com.codedecode.restaurentlisting.service;

import com.codedecode.restaurentlisting.dto.RestaurentDTO;
import com.codedecode.restaurentlisting.entity.Restaurant;
import com.codedecode.restaurentlisting.entity.Utility;
import com.codedecode.restaurentlisting.repo.RestaurentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RestaurentService {

    @Autowired
    Utility utility;
    @Autowired
    RestaurentRepo restaurentRepo;

    public List<RestaurentDTO> findAllResaurents() {

        List<Restaurant> restaurents =restaurentRepo.findAll();



        List<RestaurentDTO> restaurantDTOList = restaurents.stream().map(restaurant ->
                utility.toDto(restaurant)).collect(Collectors.toList());
        return restaurantDTOList;


    }

    public RestaurentDTO addRestaurentInDB(RestaurentDTO restaurentDTO) {

        Restaurant restaurant=restaurentRepo.save(utility.toEntity(restaurentDTO));
 return utility.toDto(restaurant);
    }


    public ResponseEntity<RestaurentDTO> fetchResturentById(Integer id)
    {
      Optional<Restaurant> resturent = restaurentRepo.findById(id);
            if(resturent.isPresent())
            {
                return new ResponseEntity<>(utility.toDto(resturent.get()), HttpStatus.OK);
            }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
}
