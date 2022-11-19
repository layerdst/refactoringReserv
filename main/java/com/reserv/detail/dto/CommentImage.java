package com.reserv.detail.dto;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
public class CommentImage {

    private Long imageId;
    private Long reservationInfoId;
    private Long reservationUserCommentId;
    private Long fileId;
    private String fileName;
    private String saveFileName;
    private String contentType;
    private boolean deleteFlag;
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;


}
