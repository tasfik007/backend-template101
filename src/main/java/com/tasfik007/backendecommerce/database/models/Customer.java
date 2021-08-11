package com.tasfik007.backendecommerce.database.models;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Customer {
    private int id;
    private String name;
    private String email;
}
