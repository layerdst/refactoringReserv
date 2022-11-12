package com.reserv.entity;

import com.reserv.entity.DisplayInfo;
import org.springframework.jmx.export.annotation.ManagedMetric;

import javax.persistence.*;

@Entity
public class DisplayInfoImage {

    @Id
    @GeneratedValue
    @Column(name="display_info_image_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="display_info_id")
    private DisplayInfo displayInfo;

    @ManyToOne
    @JoinColumn(name="file_info_id")
    private FileInfo fileInfo;


}
