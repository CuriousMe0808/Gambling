/**
Name: Kevin Zhou
<p>
Date: April 27, 2022
Description: user information
*/
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

/**
a class to hold user information
*/
public class User
{
   //attributes
   
   /**
   Username of the user
   */
   private String username;
   
   /**
   Password of the user
   */
   private String password;
   
   /**
   AccountID of the user
   */
   private String accountID;
   /**
   this is the wallet class
   */
   private Wallet wallet;
   
   /**
   Constructor that creates a user with attributes. 
   @param   username    username of the user, can be changed 
   @param   password    password of the user, can be changed
   @param   accountID   accountID of the user, can NOT be changed
   */
   public User(String username, String password, String accountID)
   {
      this.username = username;
      this.password = password;
      this.accountID = accountID;
      this.wallet = new Wallet();
   }
   
   /**
   Default constructor
   */
   public User()
   {
      this.username = "";
      this.password = "";
      this.accountID = "";
      this.wallet = null;

   }
   
   //getters
   
   /**
   get the username
   @return the username
   */
   public String getUsername()
   {
      return this.username;
   }
   
   /**
   get the password
   @return the password
   */
   public String getPassword()
   {
      return this.password;
   }
   
   /**
   get the accountID
   @return the accountID
   */
   public String getAccountID()
   {
      return this.accountID;
   }
   
   /**
   get wallet
   @return the wallet
   */
   public Wallet getWallet()
   {
      return this.wallet;
   }
   
   //setters
   
   /**
   Changes the password
   @param newPassword the new password
   */
   public void setPassword(String newPassword)
   {
      this.password = newPassword;
   }
   
   /**
   Saves user's information
   */
   public void saveFile()
   {
      try 
      {
         String fileName = "User" + accountID + ".txt";
         File mySave = new File(fileName);
         if (mySave.createNewFile()) 
         {
            System.out.println("File created: " + mySave.getName() + "\n");
         } 
         else 
         {
            System.out.println("File already exists.");
         }
         
         Writer writer = new BufferedWriter(new FileWriter(fileName));
         writer.write("Username: " + this.username + "\n");
         writer.write("Password: " + this.password + "\n");
         writer.write("USD: $" + wallet.getQtyUSD() + "\n");
         writer.close();
      } 
      catch (IOException e) 
      {
         System.out.println("An error occurred.");
      }
   }
   
   /**
   Displays the user information
   @return user name and account ID
   */
   public String toString()
   {
      return "Username: " + username + "\nAccount ID: " + accountID;
   }
   
   /**
   Main method to test adding new users
   */
   public static void main(String[] args)
   {      
      HashMap<String, String[]> masterList = Utility.readMaster();
      
      Utility.addNewUser(masterList, "Kevin@student.tdsb.on.ca", "OWARC");
      Utility.addNewUser(masterList, "ZhouEnLai", "ICS4U");
      Utility.addNewUser(masterList, "Kms", "from ap math class with petres");
   }

}