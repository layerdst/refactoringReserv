package com.reserv.main.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PromotionList {

    private Long id;
    private Long productId;
    private String productImageUrl;

    public PromotionList(Long id, Long productId, String productImageUrl) {
        this.id = id;
        this.productId = productId;
        this.productImageUrl = productImageUrl;
    }
}
