package com.reserv.detail;

import com.reserv.detail.dto.DisplayInfoAll;
import com.reserv.detail.dto.DisplayInfoDetail;
import com.reserv.entity.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

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

//    public ReservationInfo findComment(Long displayInfoId){
//        return em.createQuery(
//                "select ri from ReservationInfo ri " +
//                            "join fetch ri.product p " +
//                            "join fetch ri.displayInfo di " +
//                        "where di.id = :displayInfoId", ReservationInfo.class)
//                        .setParameter("displayInfoId", displayInfoId)
//                        .getSingleResult();
//
//    }

    public List<ProductImage> findProductImage(Long productId){
        return em.createQuery(
                "select pi from ProductImage pi " +
                            "join fetch pi.product p " +
                            "join fetch pi.fileInfo f " +
                            "where p.id = :id ")
                .setParameter("id", productId)
                .getResultList();

    }

    public List<ReservationUserComment> findComment(Long productId){
        return em.createQuery(
                "select rc from ReservationUserComment rc " +
                        "join fetch rc.product p " +
                        "join fetch rc.reservationInfo ri " +
                        "where p.id = :productId")
                .setParameter("productId", productId)
                .getResultList();
    }

    public Long findProductId(Long displayInfoId){
        return em.createQuery("select p.id from DisplayInfo di " +
                            " join di.product p " +
                            "where di.id = :diplayInfoId", Long.class)
                            .setParameter("diplayInfoId", displayInfoId)
                            .getSingleResult();
    }

    public List<ReservationUserCommentImage> findCommentImage(Long id){
        return em.createQuery("select ruc from ReservationUserComment ruc " +
                "join ruc.reservationInfo ri " +
                "join ruc.product p " +
                "where p.id = :id").setParameter("id", id).getResultList();
    }


}
