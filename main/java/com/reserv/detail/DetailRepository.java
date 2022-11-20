package com.reserv.detail;

import com.reserv.detail.dto.DisplayInfoAll;
import com.reserv.detail.dto.DisplayInfoDetail;
import com.reserv.entity.DisplayInfo;
import com.reserv.entity.ReservationInfo;
import com.reserv.entity.ReservationUserComment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
@RequiredArgsConstructor
public class DetailRepository {

    private final EntityManager em;

    public DisplayInfo find(Long id){
        return em.createQuery(
                "select d from DisplayInfo d " +
                            "join fetch d.product p " +
                            "join fetch d.displayInfoImage di " +
                        "where d.id = :id", DisplayInfo.class)
                        .setParameter("id", id)
                        .getSingleResult();
            }

    public ReservationInfo findComment(Long displayInfoId){
        return em.createQuery(
                "select ri from ReservationInfo ri " +
                            "join fetch ri.product p " +
                            "join fetch ri.displayInfo di " +
                        "where di.id = :displayInfoId", ReservationInfo.class)
                        .setParameter("displayInfoId", displayInfoId)
                        .getSingleResult();

    }
}
