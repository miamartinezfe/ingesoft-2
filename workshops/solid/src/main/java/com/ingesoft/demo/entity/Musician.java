package com.ingesoft.demo.entity;
/*
    * Entidad que representa a un músico, que hereda de humano.
 */
public class Musician extends Human {
    private String instrument;

    public Musician(String name, int age, String instrument) {
        super(name, age);
        this.instrument = instrument;
    }

    public String playMusic() {
        return "Playing the " + instrument;
    }
}
