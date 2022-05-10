/**
Name: Kevin Zhou
<p>
Date: April 27, 2022
Description: Utility Class providing various tools
*/
import java.io.*;
import java.util.*;

/**
a class to provide various tools
*/
public final class Utility
{
   //variables
   /** Name of the file that holds all user information*/
   private final static String MATER_FILE_NAME = "MasterAccount.txt";
   
   /** token for username*/
   private final static String USERNAME_TOKEN = "Username";
   
   /** token for password*/
   private final static String PASSWORD_TOKEN = "Password";
   
   /** token for accountID*/
   private final static String ACCOUNTID_TOKEN = "AccountID";
   
   /** start of the counter for an id*/
   private static long idCounter = 0;
   
   /**
   generate unique account id
   @return a String value for the account ID
   */
   public static String generateAccountID()
   {
      return String.valueOf(++idCounter);
   }
   
   /**
   Generate a list/hashmap for key = username and value = password & accountID
   @return list of usernames, passwords, and accountID
   */
   public static HashMap<String, String[]> readMaster()
   {     
      //variables
      HashMap<String, String[]> masterList = new HashMap<String, String[]>();      //HashMap uses password as key, and value is the String array with password and accountID.
      String username, password, accountID, token, line;
      username = "";
      password = "";
      accountID = "";
      File saveFile = new File(MATER_FILE_NAME);
      
      if (saveFile.isFile())
      {
         try
         {
            BufferedReader myReader = new BufferedReader(new FileReader(MATER_FILE_NAME)); //reader     
            line = myReader.readLine(); //reads next line
            while(line != null && !line.isEmpty())
            {                   
               if(line.length() > 8)
               {
                  token = line.substring(0, 8);
                  if (USERNAME_TOKEN.equals(token)) //checks for username
                  {
                     username = line.substring(10,line.length());
                  }
               
                  if (PASSWORD_TOKEN.equals(token)) //checks for password
                  {
                     password = line.substring(10,line.length());
                  }
               }
               
               if(line.length() > 9)
               {
                  token = line.substring(0, 9);
                  if (ACCOUNTID_TOKEN.equals(token)) //checks for AccountID
                  {
                     accountID = line.substring(11,line.length());
                     
                     masterList.put(username, new String[]{password, accountID});
                  }
               }
               line = myReader.readLine();               
            }
         }
         catch (Exception e) 
         {
             System.out.println("An error occurred.");
         }
      }
      idCounter = masterList.size(); //gets number of accounts through the size of the hashmap masterlist
      return masterList;
   }
   
   /**
   Writes the list of users to the master account file
   @param HashMap<String, String[]> masterList the hashmap to write into the master account file
   */
   public static void saveMaster(HashMap<String, String[]> masterList)
   {
      try 
      {  
         //If the master file does not exist, create a new one.
         File mySave = new File(MATER_FILE_NAME);
         if (!mySave.isFile())
         {
            mySave.createNewFile();
         }
         
         //variable
         String line;
         
         //write in the master account
         Writer writer = new BufferedWriter(new FileWriter(MATER_FILE_NAME));
            
         for (String i : masterList.keySet()) 
         {               
            writer.write("Username: " + i + "\n");
            writer.write("Password: " + masterList.get(i)[0] + "\n");
            writer.write("AccountID: " + masterList.get(i)[1] + "\n");
         }
         writer.close();
         System.out.println("Master file updated");         
      } 
      catch (IOException e) 
      {
         System.out.println("An error occurred.");
      }
   }
   
   /**
   Adds a new user and save to user file and master file
   @param HashMap<String, String[]> masterList the hashmap to write into the master account file
   @param String username username
   @param String password password
   @return list of usernames, passwords, and accountID
   */
   public static HashMap<String, String[]> addNewUser(HashMap<String, String[]> masterList, String username, String password)
   {
      //Check if there is duplicated username in the master list
      if (masterList.get(username) == null)
      {
         String accountID = generateAccountID();
         masterList.put(username, new String[]{password, accountID});
         Utility.saveMaster(masterList);
         User newUser = new User(username, password, accountID);
         System.out.println("Created: " + newUser.toString());
         newUser.saveFile();
      }
      else
      {
         System.out.println("Duplicated username: " + username);
      }
      return masterList;
   }
   
   /**
   Check if the input string is an integer.
   @return true if integer, false if not
   */
   public static boolean isNumeric(String s) 
   {
      if (s == null)
         return false;
         
      Scanner scan = new Scanner(System.in);

      try
      {
         double d = Integer.parseInt(s);
      } 
      catch (Exception e) 
      {   
         return false;
      }
      return true;
   }
   
   /**
   Get the bet money that user input to play the game
   @param money the amount of money that user has in vallet
   @param leastBet the amount of minimum money that user has to bet
   @return the bet money that user input
   */
   public static int getBet(double money, int leastBet) 
   {
      boolean validNumber = false;
      int bet = 0;
      String userInput;
      Scanner scan = new Scanner(System.in);
   
      System.out.println("You have $" + money + " available.");
   
      do 
      {        
         System.out.println("How much to bet?");
         userInput = scan.nextLine();
         
         // check if the user input is an integer
         // if not, display a message asking user to input again.
         if (isNumeric(userInput))
         {
            bet = Integer.parseInt(userInput);
         
            // check if the bet is less than the money in wallet
            // if less, display a message asking user to input again.
            if (Double.compare(bet, money) > 0) 
            {
               System.out.println("Not enough money to bet. You only have $" + money + " to bet.");				
            }
            
            // check if the bet is less than the minimum money to bet
            // if less, display a message asking user to input again.
            else if (bet < leastBet)
            {
               System.out.println("Please input an integer number " + leastBet + " or more.");            
            } 
            
            // all good, the bet number is valid
            else
            {
               validNumber = true;
            } 
         }
         else 
         {
            System.out.println("Please input an integer number " + leastBet + " or more.");
         }
      } 
      while (!validNumber);
      
      return bet;
   }
}