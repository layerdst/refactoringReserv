package com.reserv.entity;

import com.reserv.entity.embeddable.BaseTimeEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FileInfo extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name="file_info_id")
    private Long id;

    private String fileName;

    private String saveFileName;
    private String ContentType;
    private String deleteFlag;


}
