package com.example.bridgelabz;

public class Repeat extends Player_Option {
    static final int NOPLAY = 0, SNAKE = 1, LADDER = 2;

    public static void main(String[] args) {
        int position = new Get_Position().position;

        while(position < 100) {

            switch (getOption()) {
                case NOPLAY -> {
                }
                case SNAKE -> position -= getDiceRoll();
                case LADDER -> position += getDiceRoll();
                default -> throw new IllegalStateException("Unexpected value: " + getOption());
            }

            if(position < 0) {
                position = 0;
            }
        }
        System.out.println("position = "+position);
    }
}
