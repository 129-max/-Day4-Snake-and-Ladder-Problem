package com.example.bridgelabz;

public class Winner_no extends Player_Option {
    static final int NOPLAY = 0, SNAKE = 1, LADDER = 2;

    public static void main(String[] args) {
        int position = new Get_Position().position;
        int cnt = 0, Dice_Roll;

        while(position < 100) {

            Dice_Roll = getDiceRoll();

            switch (getOption()) {
                case NOPLAY -> {
                }
                case SNAKE -> position -= Dice_Roll;
                case LADDER -> position += Dice_Roll;
                default -> throw new IllegalStateException("Unexpected value: " + getOption());
            }

            if(position < 0) {
                position = 0;
            }
            else if(position > 100 ) {
                position -= Dice_Roll;
            }
            cnt++;
            System.out.println("position of player = "+position);
        }
        System.out.println("Number of dice required to win = "+cnt);

    }
}
