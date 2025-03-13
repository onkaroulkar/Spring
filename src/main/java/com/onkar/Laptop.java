package com.onkar;

public class Laptop implements Computer {

    public Laptop(){
        System.out.println("laptop object is created...");
    }

    @Override
    public void compile(){

        System.out.println("compling the laptop");
    }
}
