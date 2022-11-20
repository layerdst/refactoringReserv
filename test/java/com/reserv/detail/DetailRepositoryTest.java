package com.reserv.detail;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@Slf4j
@SpringBootTest
class DetailRepositoryTest {

    @Autowired
    DetailRepository detailRepository;

    @Test
    public void getDisplayInfo(){
        Object temp = detailRepository.find(1L);
        System.out.println(temp);
    }

}