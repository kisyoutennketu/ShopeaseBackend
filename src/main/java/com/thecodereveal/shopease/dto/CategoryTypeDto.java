package com.thecodereveal.shopease.dto;


import com.thecodereveal.shopease.entities.CategoryType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoryTypeDto {

    private UUID id;
    private String name;
    private String code;
    private String description;

}
