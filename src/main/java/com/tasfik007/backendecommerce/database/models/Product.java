package com.tasfik007.backendecommerce.database.models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Product {
    private int id;
    private String name;
    private int price;
}
