package com.serheev.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "order_table")
public class OrderEntity extends CreatableDateEntity {

    @Column(name = "origin")
    private String origin;

    @Column(name = "destination")
    private String destination;

    @Embedded
    private Point currentPosition;

    @Column(name = "owner_name")
    private String ownerName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "time_of_arrival")
    private Long timeOfArrival;

    @Column(name = "total_sum")
    private Double totalSum;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<ProductEntity> products = new ArrayList<>();

}
