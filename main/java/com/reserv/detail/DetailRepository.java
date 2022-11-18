package com.reserv.detail;

import com.reserv.detail.dto.DisplayInfoAll;
import com.reserv.detail.dto.DisplayInfoDetail;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class DetailRepository {

    private final EntityManager em;

    private DisplayInfoAll find(Long id){
        return null;
    }
}
