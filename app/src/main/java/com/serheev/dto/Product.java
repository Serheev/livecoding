package com.serheev.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Product {

    private long id;
    private long createdDate;
    private String name;
    private Double weight;
    private Double cost;
    private Long timeToPrune;

    private String productItem;

}
