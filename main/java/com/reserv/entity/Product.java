package com.reserv.entity;

import com.reserv.entity.embeddable.BaseTimeEntity;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class Product extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name="product_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    private String content;
    private String description;
    private String event;

}
