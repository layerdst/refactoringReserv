package com.reserv.main;

import com.reserv.main.dto.CategoryList;
import com.reserv.main.dto.DisplayInfoList;
import com.reserv.main.dto.PromotionList;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@Slf4j
@RequiredArgsConstructor
public class MainRepository {

    private final EntityManager em;

    public List<CategoryList> getCategoryList(){
        return em.createQuery("select new com.reserv.main.dto.CategoryList(c.id, c.name, count(d))" +
                " from Category c" +
                " join c.products p "+
                " join p.displayInfos d" +
                " group by c.id " +
                " order by c.id").getResultList();
    }

    public List<PromotionList> getPromotionList(){
        return em.createQuery("select new com.reserv.main.dto.PromotionList(pm.id, p.id, fi.fileName) " +
                " from Promotion pm " +
                " join pm.product p " +
                " join p.productImages pi " +
                " join pi.fileInfo fi" +
                " where pi.type = \'th\' and fi.deleteFlag = 0 " ).getResultList();
    }

    public List<DisplayInfoList> getDisplayInfos(){
        return em.createQuery("select new com.reserv.main.dto.DisplayInfoList(di.id, p.id,p.description,di.placeName,p.content,fi.saveFileName) " +
                "from DisplayInfo di " +
                "join di.product p " +
                "join p.productImages pi " +
                "join p.category c " +
                "join pi.fileInfo fi " +
                "where pi.type = \'th\' and fi.deleteFlag = 0").getResultList();
    }

    public List<DisplayInfoList> getDisplayInfoByCategory(Long category){
        return em.createQuery("select new com.reserv.main.dto.DisplayInfoList(di.id, p.id,p.description,di.placeName,p.content,fi.saveFileName) " +
                "from DisplayInfo di " +
                "join di.product p " +
                "join p.productImages pi " +
                "join p.category c " +
                "join pi.fileInfo fi " +
                "where c.id = :category " +
                        "and pi.type = \'th\' " +
                        "and fi.deleteFlag = 0")
                .setParameter("category", category)
                .getResultList();
    }


}
