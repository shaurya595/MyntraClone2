package com.geekster.MyntraClone2.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order")

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;

    private Integer productQuantity;
    @ManyToOne(cascade = CascadeType.ALL)
    private User orderUser;
    @ManyToOne(cascade = CascadeType.ALL)
    private Address orderAddress;
    @ManyToOne(cascade = CascadeType.ALL)
    private Products orderProduct;
}
