package com.ttulka.myshop.order;

import java.util.Collection;

public interface OrderService {

    Collection<Order> listAllOrders();

    void createOrder(Order order);
}
