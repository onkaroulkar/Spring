package com.onkar;

public class Alien {

    private Computer com;

   // private Laptop laptop;

    private int age;

    /*public Alien(int age,Laptop laptop) {
        this.age = age;
        this.laptop = laptop;
        System.out.println("object created");
    }*/

    public void code(){
        com.compile();
        System.out.println("coding......");
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    /*public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }*/

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }
}
