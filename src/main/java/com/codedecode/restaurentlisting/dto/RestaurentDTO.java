package com.codedecode.restaurentlisting.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

/*@Data
@AllArgsConstructor
@NoArgsConstructor*/


public class RestaurentDTO {


int id;
         String name;
      String city;
       String address;
       String restaurentDescription;
//  public   RestaurentDTO(){}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRestaurentDescription() {
        return restaurentDescription;
    }

    public void setRestaurentDescription(String restaurentDescription) {
        this.restaurentDescription = restaurentDescription;
    }
}



