package dice;

import java.util.Random;
//import java.util.Scanner;

public class RollingDice {

	public static void main(String[] args) {

//		Scanner ui = new Scanner(System.in);

//		System.out.println("What is your max range for your dice ?");
//		int range = ui.nextInt();

//		int mid = range / range + 10 ;

		Random rando = new Random();
//		int y = rando.nextInt(range)+1 ; // 6 range is off by 1 (0 - 5) so you + 1
		int y = rando.nextInt(5) + 1; // 6 range is off by 1 (0 - 5) so you + 1
		System.out.println("You rolled a: " + y);

//	if (y >= range)	{
		if (y >= 4) {
			System.out.println("You are lucky!!");
		} else
			System.out.println("You should try again, sorry you lose");

	}

}
