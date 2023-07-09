package com.geekster.MyntraClone2.Controller;

import com.geekster.MyntraClone2.Models.Order;
import com.geekster.MyntraClone2.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;
    @PostMapping()
    public void placeOrder(@RequestBody Order order) {

        orderService.saveOrder(order);
    }
}
