/**
Name: Gary Chung
Date: May 9, 2022
Description: A slot machine game in which the first 3 numbers need to be connected to get winnings, with a max of a 5 number combination.
*/
import java.util.*;
public class SlotMachine extends Game {
	/* Attributes */


	public SlotMachine(User[] players, double[] bets, int gameID) {
		super(players, bets, gameID);
		takeMoney();
	}

    public void playGame() {
       Random generator = new Random();
       Scanner console = new Scanner(System.in);
  	   //initializing variables
       int input;
	   double[] wagers = getBets();
       double sBalance = wagers[0];
       int mTokens;
       int sTokens;
       int mSlot1, mSlot2, mSlot3,mSlot4,mSlot5;
      
       sTokens = (int) (sBalance/5); 
	   User[] players = getPlayers();
	   players[0].getWallet().changeMoney(sTokens%5); //add extra coins
      
      
      //do while loop for the game
		try {
			do{
	         mTokens = sTokens;
	                  
	         System.out.println("Slot Machine");
	         System.out.println("Tokens available: " + mTokens);
	         System.out.println("Press 1 to spin, otherwise anything else to quit");
	      
	         input = console.nextInt();
	      
	      //randomizing numbers
	      
	         mSlot1 = generator.nextInt(5) + 1;
	         mSlot2 = generator.nextInt(5) + 1;
	         mSlot3 = generator.nextInt(5) + 1;
	         mSlot4 = generator.nextInt(5) + 1;
	         mSlot5 = generator.nextInt(5) + 1;
	      
	         System.out.println(mSlot1 + "   " + mSlot2 + "   " + mSlot3 + "   " + mSlot4 + "   " + mSlot5);
	      // This if statement is for if all 5 of the slot spaces are the same number, hitting the jackpot of 50
	         if(mSlot1 == mSlot2 && mSlot1 == mSlot3 && mSlot1 == mSlot4 && mSlot1 == mSlot5){
	            System.out.println(" !!!MEGA WIN!!!");
	            System.out.println("You won 50 tokens");
	            sTokens +=50;
	         }
	         // This else if statement is for when the first 3 
	         else if(mSlot1 == mSlot2 && mSlot1 == mSlot3 && mSlot1 != mSlot4 && mSlot1 != mSlot5){
	            System.out.println(" NICE!");
	            System.out.println("You won 15 tokens");
	            sTokens +=15;
	         }
	         // This else if s tatement is for when the first 4 connect in a row as the same numbers
	         else if(mSlot1 == mSlot2 && mSlot1 == mSlot3 && mSlot1 == mSlot4 && mSlot1 != mSlot5){
	            System.out.println(" BIG WIN!");
	            System.out.println("You won 30 tokens");
	            sTokens +=30;
	         }
	         // If there isnt atleast the first 3 connecting, no tokens are rewarded
	         else{
	            sTokens -=1;
	         }
	      }while(input == 1 && sTokens !=0);
	      
	      if(sTokens < 1){
	      System.out.println("You are out of funds, restart the game to play again");
	      }
	                     
	      if( input != 1){
	         System.out.println("Thanks for playing, come again!");
			 wagers[0] += (sTokens*5);
			 returnMoney();
	      }
		}
   
	catch (InputMismatchException e) {
		System.out.println("Thanks for playing, come again!");
		wagers[0] = (sTokens*5);
		returnMoney();
		}
	}
}
