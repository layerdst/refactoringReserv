package com.reserv.main;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class MainRepository {

    @PersistenceContext
    EntityManager em;



}
