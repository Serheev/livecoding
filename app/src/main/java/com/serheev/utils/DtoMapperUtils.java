package com.serheev.utils;

import com.serheev.dto.Order;
import com.serheev.dto.Product;
import com.serheev.model.OrderEntity;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class DtoMapperUtils {

    public static Order buildOrder(OrderEntity e) {
        Order order = new Order();
        order.setId(e.getId());
        order.setCreatedDate(e.getCreatedDate());
        order.setOrigin(e.getOrigin());
        order.setDestination(e.getDestination());
        order.setCurrentPositionLatitude(e.getCurrentPosition().getLatitude());
        order.setCurrentPositionLongitude(e.getCurrentPosition().getLongitude());
        order.setOwnerName(e.getOwnerName());
        order.setPhone(e.getPhone());
        order.setTimeOfArrival(e.getTimeOfArrival());
        order.setTotalSum(e.getTotalSum());
        order.setProducts(buildProducts(e));
        return order;
    }

    public static List<Product> buildProducts(OrderEntity entity) {
        return entity.getProducts().stream()
                .map(e -> new Product()
                        .setId(e.getId())
                        .setCost(e.getCost())
                        .setCreatedDate(e.getCreatedDate())
                        .setName(e.getName())
                        .setTimeToPrune(e.getTimeToPrune())
                        .setWeight(e.getWeight())
                        .setProductItem(e.getProductItem().getName()))
                .collect(Collectors.toList());
    }

}
