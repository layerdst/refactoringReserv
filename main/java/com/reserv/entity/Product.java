package com.reserv.entity;

import com.reserv.entity.embeddable.BaseTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
public class Product extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name="product_id")
    private Long id;

    @Column(length = 10000)
    private String content;

    @Column(length = 1000)
    private String description;

    @Column(length = 1000)
    private String event;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="category_id")
    private Category category;

    @OneToMany(mappedBy = "product")
    private List<DisplayInfo> displayInfos = new ArrayList<>();

    @OneToMany(mappedBy = "product")
    private List<ProductPrice> productPrices= new ArrayList<>();

    public void setCategory(Category category){
        this.category = category;
        category.getProducts().add(this);
    }


}
