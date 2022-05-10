/**
Name: Kevin Zhou
<p>
Date: April 27, 2022
Description: main class to test features
*/

import java.util.Scanner;
import java.util.HashMap;

/**
Main class to test features
*/
public class TestMain
{
   
   public static void main(String[] args)
   {
//       createTwoUsersAndSaveToFile();
      playFlipCoin();      
   }
   
   //Test for adding new users
   public static void createTwoUsersAndSaveToFile()
   {      
      HashMap<String, String[]> masterList = Utility.readMaster();
      
      Utility.addNewUser(masterList, "Kevin@student.tdsb.on.ca", "OWARC");
      Utility.addNewUser(masterList, "ZhouEnLai", "ICS4U");
      Utility.addNewUser(masterList, "Kms", "from ap math class with petres");
   }

   //Test for the game of FlipCoin
   public static void playFlipCoin()
   {  
      // Initialize variables
      final int INITIAL_MONEY = 1000;
      final int LEAST_BET = 20;
      int money = INITIAL_MONEY;
      int return_money = 0;
      int bet = 0;
      Scanner scan = new Scanner(System.in);
      String choice;
      boolean validInput = false;
      
      // create a new user
      User u1 = new User("user1", "pww", 223);
      
      // set the user's wallet with initial money
      u1.getWallet().changeMoney(money);
      System.out.println("You have $" + money); 
      
      User[] users = {u1};
      double[] bets = {bet};
      
      // Create an object of class FlipCoin, with the users, zero bet money and game ID.
      FlipCoin gameFlipCoin = new FlipCoin(users, bets, 23);     
      
      // get the bet money from user input
      bet = Utility.getBet(money, LEAST_BET);
      
      // update the bet money for this user
      gameFlipCoin.updateBet(u1.getUsername(), bet);
      
      // deduct the bet money from user's wallet
      u1.getWallet().changeMoney(-bet);
      
      // ask user to input what to bet, head or tail. User must input 1 or 2 to continue     
      do
      {
         System.out.println("What will you bet: head or tail? 1 for head, 2 for tail");
         choice = scan.nextLine();
               
         if (choice.equals("1") || choice.equals("2")) 
         {
            // update the toss desired to be the user input
            gameFlipCoin.setToss(Integer.parseInt(choice));
            validInput = true;            
         }
      }
      while (validInput == false);  //keep asking user to input, if not 1 or 2
      validInput = false;

      // ask user to input the number in a row for the paricular toss
      do
      {
         System.out.println("How many times in a row?");
         choice = scan.nextLine();
           
         if (Utility.isNumeric(choice))
         {
            int input = Integer.parseInt(choice);
            
            if (input > 0)
            {
               // update the number of rows to be the user input
               gameFlipCoin.setRows(Integer.parseInt(choice));
               validInput = true;
            }
            else 
            {
               System.out.println("Please input an positive integer number.");
            }
         }
      }
      while (validInput == false); //keep asking user to input an integer
      
      // get the return money from multiplying the bet money powered by number in a row
      return_money = (int)(bet * gameFlipCoin.multiply());      
      System.out.println("You got back $" + return_money);
       
      // update the bet money for the user by calling method of super class
      gameFlipCoin.updateBet(u1.getUsername(), return_money);
      
      // calls the method of superclass, to put the winning money into user's wallet.     
      gameFlipCoin.returnMoney();      
      System.out.println("Now you have $" + u1.getWallet().getQtyUSD());
      
      // Display who are playing this game
      System.out.println("\n" + gameFlipCoin.toString());    
   }
}
