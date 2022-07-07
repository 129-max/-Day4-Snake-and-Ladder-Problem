package com.example.bridgelabz;

import java.util.Random;

public class Dice_Roll {

    static int getDiceRoll() {
        int Dice_min = 1, Dice_max = 6;
        Random random = new Random();
        return random.nextInt(Dice_max)+Dice_min;
    }
    public static void main(String[] args) {
        System.out.println(getDiceRoll());
    }
}
