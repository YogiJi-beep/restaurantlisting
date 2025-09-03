package com.codedecode.restaurentlisting.entity;

import com.codedecode.restaurentlisting.dto.RestaurentDTO;
import com.codedecode.restaurentlisting.entity.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Utility {
    /*@Autowired
    Restaurant restaurant;
    @Autowired
    RestaurentDTO restaurantdto;*/

    public Restaurant toEntity(RestaurentDTO dto) {
        if (dto == null) return null;
        Restaurant restaurant = new Restaurant();
        restaurant.setId(dto.getId());
        restaurant.setAddress(dto.getAddress());
        restaurant.setCity(dto.getCity());
        restaurant.setRestaurentDescription(dto.getRestaurentDescription());
        restaurant.setName(dto.getName());
        return restaurant;
    }

    public RestaurentDTO toDto(Restaurant restaurant) {
        if (restaurant == null) return null;
        RestaurentDTO  restaurantdto = new RestaurentDTO();
        restaurantdto.setId(restaurant.getId());
        restaurantdto.setAddress(restaurant.getAddress());
        restaurantdto.setCity(restaurant.getCity());
        restaurantdto.setRestaurentDescription(restaurant.getRestaurentDescription());
        restaurantdto.setName(restaurant.getName());
        return restaurantdto;
    }

}
