package com.simon.bicycle.app;

import com.simon.bicycle.domain.Bicycle;

public class BicycleApp {

    public static void main(String[] args) {

        Bicycle myBici = new Bicycle();

        myBici.accelerating(20);
        myBici.upChange();
        myBici.upChange();
        myBici.upChange();
        myBici.upChange();
        myBici.upChange();
        myBici.upChange();
        myBici.upChange();
        myBici.upChange();
        myBici.downChange();
        myBici.downChange();
        System.out.printf(myBici.getCurrentSpeed());

    }

}
