package com.reserv.detail.dto;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
public class DisplayInfoImageFile {

    private Long productId;
    private Long productImageId;
    private String Type;
    private Long fileInfoId;
    private String fileName;
    private String saveFileName;
    private String contentType;
    private boolean deleteFlag;
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
    
}
