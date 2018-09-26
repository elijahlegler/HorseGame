//Honor Pledge: Ipledge that I have neither given nor received any help on this assignment.

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Game {
	
	Player player1;
	Player player2;
	public static boolean keepGoing;
	boolean p1;
	boolean p2;
	public static boolean yesno = true;
	
	public static void main(String[] args) { 
		do {
		Player.x1 = -1;
		Player.x2 = -1;
		
		//declare new scanner
		Scanner scanner = new Scanner(System.in);
		keepGoing = true;
		
		//declares new game
		Game game = new Game();
		
		//runs shoot method until a player reaches E
		do{
		game.Shoot();
		} while (keepGoing);
		
		//asks player if they want to play again
		System.out.println("Would you like to play again (Y|N)?");
		char determiner = scanner.next().charAt(0);
		
		//determines whether user wants to play again
		if (determiner == 'Y'){
		}
		else if (determiner == 'N') {
			yesno = false;
		}
		else {
			System.out.println("Please enter 'Y' if you would like to play again and 'N' if you would not like to play again");
		}
		
		} while (yesno);
	}

	//Declaring constructor
	public Game() {
		player1 = new Player();
		player2 = new Player();
	}
	
	//Declaring functions
	public void Shoot() {
		Random randomGenerator = new Random();
		//random number generator to determine make or miss
		//0 = miss, 1 = make
		int player1Shot = randomGenerator.nextInt(2);
		int player2Shot = randomGenerator.nextInt(2);
		
		//prints make or miss
		if (player1Shot == 0) {
			System.out.println("Player #1: Missed Shot!");
		}
		else {
			System.out.println("Player #1: Hit Shot!");
		}
		
		if (player2Shot == 0) {
			System.out.println("Player #2: Missed Shot!");
		}
		else {
			System.out.println("Player #2: Hit Shot!");
		}
		
		//if statement to add letter to appropriate player
		if (player1Shot == player2Shot) {
		}
		else if (player1Shot > player2Shot) {
			Player.x1 = Player.x1 + 1;
			//adds a letter to Player 2
			//prints player added letter
			System.out.println("\t Player #2: Added an '" + (player2.getScore(Player.x1)) + "'");
				if (Player.x1 == 4) {
					System.out.println("Player 1 Wins :: Player 2 = HORSE");
					keepGoing = false;
				}
		}
		else if (player1Shot < player2Shot) {
			Player.x2 = Player.x2 + 1;
			//adds a letter to Player 2
			//prints player added letter
			System.out.println("\t Player #1: Added an '"+(player1.getScore(Player.x2))+ "'");
				if (Player.x2 == 4) {
					System.out.println("Player 2 Wins :: Player 1 = HORSE");
					keepGoing = false;
				}
		}
		
	}
}
		