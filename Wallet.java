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
   quantity of BTC
   */
   private double qtyBTC;
   
   /**
   quantity of ETH
   */
   private double qtyETH;
   
   /**
   quantity of LTC
   */
   private double qtyLTC;
   
   /**
   quantity of DOGE
   */
   private double qtyDOGE;
   
   /**
   quantity of BCH
   */
   private double qtyBCH;
   
   /**
   quantity of XRP
   */
   private double qtyXRP;
   
   /**
   quantity of TRX
   */
   private double qtyTRX;
   
   /**
   quantity of EOS
   */
   private double qtyEOS;
   
   /**
   1 BTC = 1000 USD for conversion
   */
   private double BTC_CONVERSION = 1000;
   
   /**
   1 ETH = 500 USD for conversion
   */
   private double ETH_CONVERSION = 500;
   
   /**
   1 LTC = 200 USD for conversion
   */
   private double LTC_CONVERSION = 200;
   
   /**
   1 DOGE = 200 USD for conversion
   */
   private double DOGE_CONVERSION = 100;
   
   /**
   1 BCH = 200 USD for conversion
   */
   private double BCH_CONVERSION = 70;
   
   /**
   1 XRP = 200 USD for conversion
   */
   private double XRP_CONVERSION = 50;
   
   /**
   1 TRX = 200 USD for conversion
   */
   private double TRX_CONVERSION = 40;
   
   /**
   1 EOS = 200 USD for conversion
   */
   private double EOS_CONVERSION = 30;
  
   /**
   Constructor that creates a wallet with attributes
   */
    public Wallet() 
    {
       this.qtyUSD = 0;
       this.qtyBTC = 0;
       this.qtyETH = 0;
       this.qtyLTC = 0;
       this.qtyDOGE = 0;
       this.qtyBCH = 0;
       this.qtyXRP = 0;
       this.qtyTRX = 0;
       this.qtyEOS = 0;
    }
   
   //getters
   /**
   get the quantity of USD
   @return quantity of USD
   */
   public double getQtyUSD()
   {
      return this.qtyUSD;
   }
   
   /**
   get the quantity of BTC
   @return quantity of BTC
   */
   public double getQtyBTC()
   {
      return this.qtyBTC;
   }
   
   /**
   get the quantity of ETH
   @return quantity of ETH
   */
   public double getQtyETH()
   {
      return this.qtyETH;
   }
   
   /**
   get the quantity of LTC
   @return quantity of LTC
   */
   public double getQtyLTC()
   {
      return this.qtyLTC;
   }
   
   /**
   get the quantity of DOGE
   @return quantity of DOGE
   */
   public double getQtyDOGE()
   {
      return this.qtyDOGE;
   }
   
   /**
   get the quantity of BCH
   @return quantity of BCH
   */
   public double getQtyBCH()
   {
      return this.qtyBCH;
   }
   
   /**
   get the quantity of XRP
   @return quantity of XRP
   */
   public double getQtyXRP()
   {
      return this.qtyXRP;
   }
   
   /**
   get the quantity of TRX
   @return quantity of TRX
   */
   public double getQtyTRX()
   {
      return this.qtyTRX;
   }
   
   /**
   get the quantity of EOS
   @return quantity of EOS
   */
   public double getQtyEOS()
   {
      return this.qtyEOS;
   }
   
   
   //setters
   /**
   Changes money
   @param amount the money that is being changed in the wallet
   */
   public void changeMoney(double amount)
   {
      this.qtyUSD += amount;
   }
   
   //methods
   /**
   buy crypto currency in USD
   @param crypto the type of crypto currency being bought
   @param amount the amount of crypto currency being bought
   */
   public void buyCrypto(String crypto, double amount, boolean exchange)
   {
      if (exchange == true)
      {
         this.qtyUSD -= amount;
      }
      
      switch(crypto)
      {
         case "BTC":
         this.qtyBTC += amount / BTC_CONVERSION;
         break;
         
         case "ETH":
         this.qtyETH += amount / ETH_CONVERSION;
         break;
      
         case "LTC":
         this.qtyLTC += amount / LTC_CONVERSION;
         break;
      
         case "DOGE":
         this.qtyDOGE += amount / DOGE_CONVERSION;
         break;
      
         case "BCH":
         this.qtyBCH += amount / BCH_CONVERSION;
         break;
      
         case "XRP":
         this.qtyXRP += amount / XRP_CONVERSION;
         break;
      
         case "TRX":
         this.qtyTRX += amount / TRX_CONVERSION;
         break;
      
         case "EOS":
         this.qtyEOS += amount / EOS_CONVERSION;
         break;
      }
   }
   
   /**
   Changes the amount of money in the wallet, useful for when moving crypto between wallet and games
   @param crypto the amount of crypto currency
   @param amount the amount of crypto currency 
   */
   public void changeCrypto(String crypto, double amount)
   {
      switch(crypto)
      {
         case "BTC":
         this.qtyBTC += amount;
         break;
         
         case "ETH":
         this.qtyETH += amount;
         break;
      
         case "LTC":
         this.qtyLTC += amount;
         break;
      
         case "DOGE":
         this.qtyDOGE += amount;
         break;
      
         case "BCH":
         this.qtyBCH += amount;
         break;
      
         case "XRP":
         this.qtyXRP += amount;
         break;
      
         case "TRX":
         this.qtyTRX += amount;
         break;
      
         case "EOS":
         this.qtyEOS += amount;
         break;
      }
   }
}