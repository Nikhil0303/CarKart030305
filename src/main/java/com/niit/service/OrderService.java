package com.niit.service;

import com.niit.model.UserOrder;


public interface OrderService {

    void addOrder(UserOrder order);

    double getOrderGrandTotal(int cartId);
}
