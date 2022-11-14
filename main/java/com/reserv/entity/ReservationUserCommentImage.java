package com.reserv.entity;

import javax.persistence.*;

@Entity
public class ReservationUserCommentImage {

    @Id
    @Column(name="reservation_user_comment_image_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="reservation_info_id")
    private ReservationInfo reservationInfo;

    @ManyToOne
    @JoinColumn(name="reservation_user_comment_id")
    private ReservationUserComment reservationUserComment;

    @ManyToOne
    @JoinColumn(name="file_id")
    private FileInfo fileInfo;

}
