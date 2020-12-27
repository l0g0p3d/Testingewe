package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {


    Car car;

    @BeforeEach
    public void createCar(){
        car = new Car("Skoda", "1234", 2020, "Pavel Shuvalov");

    }

    @Test
    void getManufacturer() {
        assertEquals("Skoda", car.getManufacturer());
    }

    @Test
    void getNumber() {
        assertEquals("1234",car.getNumber());
    }

    @Test
    void setNumber() {
        car.setNumber("1234");
        assertEquals("1234", car.getNumber());
    }

    @Test
    void getYear() {
        assertEquals(2020,car.getYear());
    }

    @Test
    void getOwner() {
        assertEquals("Pavel Shuvalov", car.getOwner());
    }

    @Test
    void setOwner() {
        car.setOwner("Alexey Basarukin");
        assertEquals("Alexey Basarukin",car.getOwner());
    }

    @Test
    void getListOfOwners(){
        assertArrayEquals(new String[]{"Pavel Shuvalov"},car.getOwners().toArray());
    }

    @Test
     void getListOfTwoOwners(){
        car.setOwner("Alexey Basarukin");
        assertArrayEquals(new String[]{"Pavel Shuvalov","Alexey Basarukin"},car.getOwners().toArray());

    }

}