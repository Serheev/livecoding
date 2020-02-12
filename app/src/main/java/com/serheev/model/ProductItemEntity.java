package com.serheev.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@Table(name = "product_item")
public class ProductItemEntity extends BaseEntity {

    @Column(name = "name")
    private String name;

    @OneToOne(mappedBy = "productItem")
    private ProductEntity product;

}
