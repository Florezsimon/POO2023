package com.simon.bicycle.domain;

public class Bicycle {

    public long serial;  // UML serial: long
    public String brand;
    public String color;
    public double speed;
    public byte currentChange =1;
    public byte maxChange =7; // -128 hasta 127 el byte


    //+accelerating ( in amount:int)

    public void accelerating(int amount) {
        this.speed += amount; // this.speed = this.speed + amount;
    }

    // + brakin():boolean
    public void braking(int amount) {
        if (this.speed - amount < 0) {
            System.out.printf("the bicycle are stopped");

        }
        this.speed -= amount; // this.speed = this.speed - amount;
    }

    // +upChange():boolean
    public boolean upChange() {
        if (this.currentChange + 1 > maxChange) {
            System.out.printf("canot up change");
            return false;

        }
        this.currentChange++; // this.currentChange = this.currentChange + 1;
        System.out.printf("current change: " + this.currentChange);
        return true;
    }


    public boolean downChange() {
        if (this.currentChange - 1 == 0) {
            System.out.printf("cannot dow change. ");
            return false;
        }

        this.currentChange--;
        System.out.printf("current change:  " + this.currentChange);
        return true;
    }

    public String getCurrentSpeed() {
        return "the current speed is " +  this.speed + " km/h  & the current change is " + this.currentChange;

    }







}
