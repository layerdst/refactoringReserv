package com.reserv.entity;

import com.reserv.entity.DisplayInfo;
import org.springframework.jmx.export.annotation.ManagedMetric;

import javax.persistence.*;

@Entity
public class DisplayInfoImage {

    @Id
    @Column(name="display_info_image_id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="display_info_id")
    private DisplayInfo displayInfo;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="file_id")
    private FileInfo fileInfo;


}
