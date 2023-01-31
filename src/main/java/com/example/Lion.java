package com.example;

import java.util.List;

public class Lion {
    String sex;
    boolean hasMane;
    private Feline feline;

    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

//    public Lion(Feline feline) {
//        this.feline = feline; // объект попадает в переменную класса
//    }

    public  Lion(String sex, Feline feline) throws Exception  {
        this.sex = sex; // объект попадает в переменную класса
        this.feline = feline;
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}
