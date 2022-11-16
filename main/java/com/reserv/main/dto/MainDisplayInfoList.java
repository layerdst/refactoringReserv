package com.reserv.main.dto;

import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@ToString
public class MainDisplayInfoList {

    private int totalCount;
    private List<DisplayInfoList> displayInfoList = new ArrayList<>();

}
