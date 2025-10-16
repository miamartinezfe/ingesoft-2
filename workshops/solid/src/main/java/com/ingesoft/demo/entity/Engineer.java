package com.ingesoft.demo.entity;

import lombok.Getter;
import lombok.Setter;

/*
    * Entidad que representa a un ingeniero, que hereda de humano.
 */
@Getter
@Setter
public class Engineer extends Human{
    private String discipline;

    public Engineer(String name, int age, String discipline) {
        super(name, age);
        this.discipline = discipline;
    }

    public String whoAmI() {
        return "I am " + getName() + ", a " + getAge() + " years old engineer specialized in " + discipline + ".";
    }
}
