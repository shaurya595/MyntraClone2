package com.geekster.MyntraClone2.Service;

import com.geekster.MyntraClone2.Models.Order;
import com.geekster.MyntraClone2.Repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderRepo orderRepo;
    public void saveOrder(Order order) {
        orderRepo.save(order);
    }
}
