package com.reserv.main.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class CategoryList {
    private Long id;
    private String name;
    private Long count;

    public CategoryList(Long id, String name, Long count) {
        this.id = id;
        this.name = name;
        this.count = count;
    }
}
