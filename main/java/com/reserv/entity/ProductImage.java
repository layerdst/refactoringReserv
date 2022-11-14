package com.reserv.entity;

import javax.persistence.*;

@Entity
public class ProductImage {

    @Id

    @Column(name="product_image_id")
    private Long id;

    private String type;

    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name="file_id")
    private FileInfo fileInfo;

}
