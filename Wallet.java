/**
 Name: Kevin Zhou
 <p>
 Date: April 27, 2022
 Description: user's wallet
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
 }
