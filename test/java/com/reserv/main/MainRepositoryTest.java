package com.reserv.main;

import com.reserv.main.dto.CategoryList;
import com.reserv.main.dto.DisplayInfoList;
import com.reserv.main.dto.PromotionList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest

class MainRepositoryTest {

    @Autowired
    MainRepository mainRepository;

    @Test
    public void getCategory(){
        List<CategoryList> categoryList = mainRepository.getCategoryList();
        System.out.println(categoryList);
        org.assertj.core.api.Assertions.assertThat(categoryList.size()).isEqualTo(5);
    }

    @Test
    public void getPromotions(){
        List<PromotionList> promotionList = mainRepository.getPromotionList();
        System.out.println(promotionList);
        org.assertj.core.api.Assertions.assertThat(promotionList.size()).isEqualTo(11);
    }

    @Test
    public void getDisplayInfos(){
        List<DisplayInfoList> displayInfoList = mainRepository.getDisplayInfos();
        System.out.println(displayInfoList);
        org.assertj.core.api.Assertions.assertThat(displayInfoList.size()).isEqualTo(59);
    }

    @Test
    public void getDisplayInfoByCategory(){
        List<DisplayInfoList> displayInfoLists = mainRepository.getDisplayInfoByCategory(1L);
        System.out.println(displayInfoLists);
        System.out.println(displayInfoLists.size());
        org.assertj.core.api.Assertions.assertThat(displayInfoLists.size()).isEqualTo(10);
    }
}