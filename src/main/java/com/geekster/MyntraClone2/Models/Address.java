package com.geekster.MyntraClone2.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table

public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer AddressId;
    private String AddressName;
    private String Landmark;
    private String zipcode;
    private String state;
    @ManyToOne(cascade = CascadeType.ALL)
    private User user;
}
