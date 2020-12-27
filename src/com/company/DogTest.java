package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @BeforeEach
    void prepareData(){
        Dog dog = new Dog("Robert",  2);
    }

    @Test
    void testGetDogNameMethod() {
        Dog dog = new Dog("Robert",  2);
      assertEquals("Robert", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void testSetDogNameMethod() {
        Dog dog = new Dog("Robert", 2);
        dog.setName("Richard");
        assertEquals("Robert", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void testSetDogNameMethodIfEmpty() {
        Dog dog = new Dog("", 2);
        dog.setName("Richard");
        assertEquals("Richard", dog.getName());
    }

    @org.junit.jupiter.api.Test
    void getAge() {
    }

    @org.junit.jupiter.api.Test
    void setAge() {
    }
}