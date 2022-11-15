package com.reserv.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Category {

    @Id
    @Column(name="category_id")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "category")
    private List<Product> products = new ArrayList<>();

}
