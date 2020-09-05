package com.simpleOOExercise;

public class Car {
    public final int MAXIMUM_SPEED;
    public final int ACCELERATION;
    public int currentSpeed = 0;

    public Car(int MAXIMUM_SPEED, int ACCELERATION){
        this.MAXIMUM_SPEED = MAXIMUM_SPEED;
        this.ACCELERATION = ACCELERATION;
    }

    public void speedUp(){
        if(this.currentSpeed + this.ACCELERATION > this.MAXIMUM_SPEED){
            this.currentSpeed = this.MAXIMUM_SPEED;
        }else{
            this.currentSpeed += this.ACCELERATION;
        }
    }

    public void brake(){
        if(this.currentSpeed >= 5){
            this.currentSpeed -= 5;
        }else{
            this.currentSpeed = 0;
        }
    }
}
