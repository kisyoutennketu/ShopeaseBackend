package com.thecodereveal.shopease.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AddressRequest {

    private String name;

    private String street;

    private String city;

    private String state;

    private String zipCode;

    private String phoneNumber;
}
