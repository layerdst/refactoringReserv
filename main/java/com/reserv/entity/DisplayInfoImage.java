package com.reserv.entity;

import com.reserv.entity.DisplayInfo;

import javax.persistence.*;

@Entity
public class DisplayInfoImage {

    @Id
    @GeneratedValue
    @Column(name="display_info_image")
    private Long id;

    @ManyToOne
    @JoinColumn(name="display_Info_id")
    private DisplayInfo displayInfo;

}
