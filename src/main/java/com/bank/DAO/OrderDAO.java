package com.bank.DAO;

import com.bank.entities.Order;

import java.util.List;

/**
 * Created by bobyk on 1/24/18.
 */
public interface OrderDAO {
    void createOrder(Order order) throws Exception;
    Order getOrder(long id) throws Exception;
    List<Order> getOrderList() throws Exception;
    void updateOrder(Order order) throws Exception;
}
