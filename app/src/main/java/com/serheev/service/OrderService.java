package com.serheev.service;

import com.serheev.dto.Order;
import com.serheev.model.OrderEntity;
import com.serheev.model.Point;
import com.serheev.repository.OrderRepository;
import com.serheev.utils.DtoMapperUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository repository;

    @Transactional
    public void createOrder(Order order) {
        OrderEntity entity = new OrderEntity();
        entity.setOrigin(order.getOrigin());
        entity.setDestination(order.getDestination());
        entity.setOwnerName(order.getOwnerName());
        entity.setCurrentPosition(new Point(0.0, 0.0));
        entity.setPhone(order.getPhone());
        repository.save(entity);
    }

    public Order getOrderById(Long id) {
        return repository.findById(id)
                .map(DtoMapperUtils::buildOrder)
                .orElseThrow(IllegalArgumentException::new);
    }

}
