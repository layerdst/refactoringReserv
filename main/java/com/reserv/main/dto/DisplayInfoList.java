package com.reserv.main.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class DisplayInfoList {
    private Long displayInfoId;
    private Long productId;
    private String productDescription;
    private String placeName;
    private String productContent;
    private String productImageUrl;

    public DisplayInfoList(Long displayInfoId, Long productId, String productDescription, String placeName, String productContent, String productImageUrl) {
        this.displayInfoId = displayInfoId;
        this.productId = productId;
        this.productDescription = productDescription;
        this.placeName = placeName;
        this.productContent = productContent;
        this.productImageUrl = productImageUrl;
    }
}
