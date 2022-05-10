/**
Name: Kevin Zhou
<p>
Date: April 27, 2022
Description: user's wallet.
*/
import java.util.Scanner;

/**
A class for wallet, managing the amount of USD dollars.
*/
public class Wallet
{
   //attributes
   /**
   quantity of USD
   */
   private double qtyUSD;
   /**
   Constructor that creates a wallet with attributes
   */
   public Wallet() 
   {
       qtyUSD = 0;
   }
   
   //getters
   /**
   get the quantity of USD
   @return quantity of USD
   */
   public double getQtyUSD()
   {
      return qtyUSD;
   }
   
   /**
   Changes money in the wallet
   @param amount the money that is being changed in the wallet
   */
   public void changeMoney(double amount)
   {
      qtyUSD += amount;
   }
   
   /**
   Displays the wallet information
   @return the money amount in the wallet
   */
   public String toString()
   {
      return Double.toString(qtyUSD);
   }
   
   /**
   Main method to test wallet
   */
   public static void main(String[] args)
   {
      Wallet w = new Wallet();
      System.out.println("New wallet is created with $" + w.toString());
      
      double deposit = 1000;
      w.changeMoney(deposit);
      System.out.println("Putting initial $" + deposit +" in the wallet. Now you have $" + w.toString());
   
      double bet = 100;
      w.changeMoney(-bet);
      System.out.println("Betting with $" + bet + ". Now you have $" + w.toString());
      
      double returnMoney = 195;
      w.changeMoney(returnMoney);
      System.out.println("Returning $" + returnMoney + ". Now you have $" + w.toString());
   }
 }