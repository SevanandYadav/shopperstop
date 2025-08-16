package com.arsenal.ecomm.shopperstop.entity;

import lombok.Getter;
import lombok.Setter;

// @Entity
@Getter
@Setter
public class Product {
    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;
    // getters and setters
}