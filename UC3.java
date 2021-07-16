package SnakesLadder;

import java.util.Random;

public class UC3 {
	public static final int ladder = 1, snake = 2;
	
	public static void main(String[] args) {
		int position = 0;
		System.out.println("Position of the Dice : "+position);
		Random rand = new Random();
		int dice  = rand.nextInt(6);
		int Choice = rand.nextInt(3);
	System.out.println("State of Dice :"+dice);
	switch(Choice){
	case ladder:
		System.out.println("Current position is:" + position);
		position += dice;
		System.out.println("Player got ladder, New position is:" + position);
		break;
		
	case snake:
		System.out.println("Current position is:" + position);
		position -= dice;
		System.out.println("Player got the snake, New position is:" + position);
		break;
		
	default:
		System.out.println("No Play, Stay at the same position:" + position);
		
	}
}
}

