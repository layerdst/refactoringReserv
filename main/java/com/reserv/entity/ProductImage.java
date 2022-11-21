package com.reserv.entity;

import lombok.ToString;

import javax.persistence.*;

@Entity
@ToString
public class ProductImage {

    @Id

    @Column(name="product_image_id")
    private Long id;

    private String type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="product_id")
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="file_id")
    private FileInfo fileInfo;

}
