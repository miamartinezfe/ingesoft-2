package com.ingesoft.demo;

import com.ingesoft.demo.entity.Doctor;
import com.ingesoft.demo.entity.Engineer;
import com.ingesoft.demo.entity.Human;
import com.ingesoft.demo.entity.Musician;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class main {

    public static void main(String[] args) {
        SpringApplication.run(main.class, args);
        List<Human> population = new ArrayList<>();
        population.add(new Doctor("Alice", 30, "Cardiology"));
        population.add(new Engineer("Bob", 28, "Software"));
        population.add(new Musician("Charlie", 25, "Guitar"));
        for (Human human : population) {
            System.out.println("Name: " + human.getName() + ", Age: " + human.getAge());
            if (human instanceof Doctor doctor) {
                System.out.println(doctor.message());
            } else if (human instanceof Engineer engineer) {
                System.out.println(engineer.whoAmI());
            }
            else if (human instanceof Musician musician) {
                System.out.println(musician.playMusic());
            }
        }
    }

}