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
   Constructor that creates a wallet with attributes
   @param qtyUSD  number of USD in wallet
   @param qtyBTC  number of BTC in wallet
   @param qtyETH  number of ETH in wallet
   @param qtyLTC  number of LTC in wallet
   @param qtyDOGE number of DOGE in wallet
   @param qtyBCH  number of BCH in wallet
   @param qtyXRP  number of XRP in wallet
   @param qtyTRX  number of TRX in wallet
   @param qtyEOS  number of EOS in wallet
   */
   public Wallet (double qtyUSD, double qtyBTC, double qtyETH, double qtyLTC, double qtyDOGE, double qtyBCH, double qtyXRP, double qtyTRX, double qtyEOS)
   {
      this.qtyUSD = qtyUSD;
      this.qtyBTC = qtyBTC;
      this.qtyETH = qtyETH;
      this.qtyLTC = qtyLTC;
      this.qtyDOGE = qtyDOGE;
      this.qtyBCH = qtyBCH;
      this.qtyXRP = qtyXRP;
      this.qtyTRX = qtyTRX;
      this.qtyEOS = qtyEOS;
   }
   
   /**
   default constructor for a wallet with all attributes
   */
   public Wallet()
   {
      this.qtyUSD = 0.0;
      this.qtyBTC = 0.0;
      this.qtyETH = 0.0;
      this.qtyLTC = 0.0;
      this.qtyDOGE = 0.0;
      this.qtyBCH = 0.0;
      this.qtyXRP = 0.0;
      this.qtyTRX = 0.0;
      this.qtyEOS = 0.0;
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
   
   
   //methods
   /**
   buy crypto currency in USD
   @param crypto the type of crypto currency being bought
   @param amount the amount of crypto currency being bought
   */
   public void buyCrypto(String crypto, double amount)
   {
      String currency = "";
      currency = "qty" + "crypto";
      
      this.qtyUSD -= amount;
      this. += amount;
   }
}