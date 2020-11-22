package com.Bridgelabz.SnakeandLadder;

public class SnakeAndLadderGame {
	int player1 = 0;
	int position = 0;

	public static void main(String[] args) {
		int roll_Dice = (int) ((Math.random() * 10 % 6) +1);
		System.out.println("Die Value : " + roll_Dice);
	}
}
