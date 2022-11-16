package com.reserv.main;

import com.reserv.main.dto.CategoryList;
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


}
