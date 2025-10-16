package com.ingesoft.demo.entity;

import lombok.Getter;
import lombok.Setter;
/*
    * Entidad que representa a un doctor, que hereda de humano.
 */

@Getter
@Setter
public class Doctor extends Human{
    private String specialty;

    public Doctor(String name, int age, String specialty) {
        super(name, age);
        this.specialty = specialty;
    }

    /*
        * Método que devuelve un mensaje indicando que el paciente está bien.
     */
    public String message() {
        return "You are fine";
    }
}
