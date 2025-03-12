package com.onkar;

public class Alien {

    private Laptop laptop;

    private int age;

    public Alien() {

        System.out.println("object created");
    }

    public void code(){
        laptop.compile();
        System.out.println("coding......");
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
}
