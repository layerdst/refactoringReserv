package com.reserv.detail.dto;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
public class CommentDetail {

    private Long commentId;
    private Long productId;
    private Long reservationId;
    private float score;
    private String comment;
    private String reservationName;
    private String reservationTelephone;
    private String reservationEmail;
    private LocalDateTime reservationDate;
    private LocalDateTime createDate;
    private LocalDateTime modifyDate;
    private List<CommentImage> commentImages= new ArrayList<>();


}
