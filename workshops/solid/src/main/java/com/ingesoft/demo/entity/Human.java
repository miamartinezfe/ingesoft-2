package com.ingesoft.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
    * Entidad que representa a un humano.
 */
@Data
@AllArgsConstructor
public class Human {
    private String name;
    private int age;
}
