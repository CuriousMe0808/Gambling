import java.util.*;
class SlotMachine{
   public static void main(String args[]){
      Random generator = new Random();
      Scanner console = new Scanner(System.in);
   //initializing variables
      int input;
      int sBalance = 100;
      int mTokens;
      int sTokens;
      int mSlot1, mSlot2, mSlot3,mSlot4,mSlot5;
      String redepo;
      
      System.out.println(" Currently you have " + sBalance + " in your account. Each token is 5 dollars. How many tokens would you like to purchase?");
      sTokens = console.nextInt();
      
      int tValue = sTokens*2;
      
      if(tValue > sBalance){
         System.out.println("Sorry you do not have the funds to purchase this many tokens");
      }
      else if (tValue <= sBalance){
      mTokens = sTokens;
         System.out.println("You have purchased " + sTokens + " tokens, and your new balance is " + mTokens);
      }
      
      
      
      //do while loop for the game
      do{
             mTokens = sTokens;
                  
         System.out.println("Slot Machine");
         System.out.println("Tokens available: " + mTokens);
         System.out.println(" Press 1 to spin, otherwise anything else to quit");
      
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
      }
         
   }
}