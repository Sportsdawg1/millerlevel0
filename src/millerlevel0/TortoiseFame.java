package millerlevel0;

import java.util.Random;

import org.teachingextensions.logo.Tortoise;

// Copyright Wintriss Technical Schools 2014

/*** Teacher's note ***/
/*
 * Start by reviewing the 3 pieces of a for loop (initialization, condition,
 * increment). Do not give the students the answer to the challenge.
 */

public class TortoiseFame {

	public static void main(String[] args) {

		// 1. Set the X position of the Tortoise so that it starts on the left.
		// You also need to show the Tortoise to see the result of this line.
		Tortoise.setX(0);
		Tortoise.show();
		int num = new Random().nextInt(15);
		// 2. Make the Tortoise draw a star shape. Hint: 144.
		for (int i = 0; i < num; i++) {
			for (int b = 0; b < 5; b++) {
				Tortoise.setSpeed(10);
				Tortoise.turn(144);
				Tortoise.penDown();
				Tortoise.move(30);
			}
			Tortoise.turn(90);
			Tortoise.penUp();
			Tortoise.move(50);
			Tortoise.turn(270);
			Tortoise.penDown();
		} // 3. Set the size of the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the Tortoise draw a line of stars like this:
		 * http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

	private static int random(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
