package com.serheev.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
public class Order {

    private long id;
    private long createdDate;
    @NotNull
    private String origin;
    @NotNull
    private String destination;
    @NotNull
    private Double currentPositionLatitude;
    @NotNull
    private Double currentPositionLongitude;
    @NotNull
    private String ownerName;
    private String phone;
    private Long timeOfArrival;
    @Min(0)
    private Double totalSum;
    private List<Product> products;

}
