package com.reserv.entity.embeddable;

import lombok.Getter;
import org.apache.tomcat.jni.Local;

import javax.persistence.Embeddable;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
public class BaseTimeEntity {

    private LocalDateTime createDate;
    private LocalDateTime modifyDate;

}
