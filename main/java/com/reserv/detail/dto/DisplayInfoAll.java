package com.reserv.detail.dto;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
@Getter
public class DisplayInfoAll {

    private DisplayInfoDetail displayInfoDetail;
    private List<ProductImageFile> productImageFileList = new ArrayList<>();
    private DisplayInfoImageFile displayInfoImageFile;
    private List<CommentDetail> commentDetailList= new ArrayList<>();

}
