package com.example.bridgelabz;

import java.util.Random;

public class Player_Option extends Dice_Roll {
    static final int NOPLAY = 0, SNAKE = 1, LADDER = 2;

    static int getOption() {
        Random random = new Random();
        return random.nextInt(3);
    }

    public static void main(String[] args) {
        int position = new getposition().position;
        switch(getOption()) {
            case NOPLAY:
                break;
            case SNAKE:
                position -= getDiceRoll();
                break;
            case LADDER:
                position += getDiceRoll();
                break;
        }
        System.out.println("Player position = "+position);

    }

    private static class getposition {
        public int position;
    }
}
