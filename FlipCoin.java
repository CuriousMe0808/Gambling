/**
Name: Kevin Zhou
<p>
Date: May 7, 2022
Description: A game that allows user to bet on the result of flipping a coin.
*/

import java.lang.Math;
import java.util.Scanner;

/**
FlipCoin class extends from superclass Game, and allows user to bet on the result of
flipping a coin. User can choose how much to bet, head or tail, how many times in 
a row for the head or tail. If user is correct, the return money will be put back 
into user's wallet.
*/
public class FlipCoin extends Game
{
   /**
	constructor calls superclass Game, and displays a logo
   @param players[] players in the game
   @param bet players' bets on the game
   @param gameID identification number of the game 
	*/
   public FlipCoin(User[] players, double[] bets, int gameID) 
   {
      super(players, bets, gameID);
      System.out.println("-----Flip a Coin------");     
   }

   // private attributes
   /** number to represent the desired result: head = 1; tail = 2 */
   private int toss; // only can be read within the class
   
   /** number of times that head or tail appears in a row */
   private int rows; // only can be read within the class
   
   /**
   setters
   */
   /** set toss for the game.
   @param tossInput an integer represents head = 1, tail = 2
   */
   public void setToss(int tossInput)
   {
      this.toss = tossInput;
   }
   
   /*
   set the number in a row for the coin, 1 or bigger
   @param rowsInput an integer for number of times in a row for a toss.
   */
   public void setRows(int rowsInput)
   {
      this.rows = rowsInput;
   }
   
   /**
	Returns a randomly generated integer, 1 or 2, representing head and tail
   @return integer 1 or 2
   */
   public static int flip()
   {
      int min = 1;
      int max = 2;
      int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
      
      return random_int;
   }
   
   /**
   Returns the multiplier to which the bet will be multiplied if winning
   @return multiplier if winning
   */
   public double multiply()
   {
      final double CONST_MULTIPLY = 1.95; // constant multiply number
      int multiply = 0; // exponent to the constant multiply number
      int roundCounter = 0; // number of flips
      boolean leave = false;  // determine when to stop multiplying
      
      while(leave == false)
      {
         int result = flip();
         roundCounter ++;
         String strResult;
         if (result == 1)
         {
            strResult = "head";
         }
         else 
         {
            strResult = "tail";
         }
         System.out.println("Round " + roundCounter + ": You got a " + strResult);
         
         // If guess is wrong, and number of flips is equal or fewer than the desired number in a row,
         // the multiplying should be stopped, and return zero.
         if (result != toss && roundCounter <= rows)
         {  
            multiply = 0;
            leave = true;
         }
         else
         {
            // multiply time increased by 1
            multiply++;
            
            // if number in a row equals the number of flips, stop multiplying
            if (rows == roundCounter)
            {  
               leave = true;
            }
         }
      }
      
      if(multiply == 0)
      {
         return 0;
      }
      else
      {
         // return a power to the constant multiply number
         // for example, if 1 in a row, then return 1.95.
         // if 2 in a row, then return 1.95^2
         return Math.pow(CONST_MULTIPLY, multiply);
      }
   }
   
   /**
   To print out the users who are playing the game
   @retrun the name of the game, and user names
   */
   public String toString()
   {      
      return "----Flip Coin----\nUsers: " + super.getPlayers();
   }
}
