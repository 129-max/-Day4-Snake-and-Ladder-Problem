package com.example.bridgelabz;

public class Ensure_Repatation extends Player_Option {
    static final int NOPLAY = 0, SNAKE = 1, LADDER = 2;

    public static void main(String[] args) {
        int position = new Get_Position().position;


        while(position < 100) {
            int diceroll = getDiceRoll();
            switch (getOption()) {
                case NOPLAY -> {
                }
                case SNAKE -> position -= diceroll;
                case LADDER -> position += diceroll;
                default -> throw new IllegalStateException("Unexpected value: " + getOption());
            }

            if(position < 0) {
                position = 0;
            }
            else if(position > 100 ) {
                position -= diceroll;
            }
            System.out.println("position = "+position);
        }

    }
}