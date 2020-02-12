package com.serheev.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "product")
public class ProductEntity extends CreatableDateEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "weight")
    private Double weight;

    @Column(name = "cost")
    private Double cost;

    @Column(name = "time_to_prune")
    private Long timeToPrune;

    @ManyToOne
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private OrderEntity order;

    @OneToOne
    @JoinColumn(name = "product_item_id", referencedColumnName = "id")
    private ProductItemEntity productItem;

}

