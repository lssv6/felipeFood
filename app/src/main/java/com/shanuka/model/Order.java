package com.shanuka.model;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Order {
    private Long id;
    private LocalDate issuedAt;
    private String status;
}
