package com.reserv.main;

import com.reserv.main.dto.CategoryList;
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
        org.assertj.core.api.Assertions.assertThat(categoryList.size()).isEqualTo(5);
    }
}