package com.onkar;

public class Desktop implements Computer {

    public Desktop(){
        System.out.println("Desktop object is created...");
    }
    @Override
    public void compile() {
        System.out.println("compling the desktop");
    }
}
