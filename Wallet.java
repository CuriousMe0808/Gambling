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
   @param qtyBTC  number of BTC in wallet
   @param qtyETH  number of ETH in wallet
   @param qtyLTC  number of LTC in wallet
   @param qtyDOGE number of DOGE in wallet
   @param qtyBCH  number of BCH in wallet
   @param qtyXRP  number of XRP in wallet
   @param qtyTRX  number of TRX in wallet
   @param qtyEOS  number of EOS in wallet
   */
   public Wallet (double qtyBTC, double qtyETH, double qtyLTC, double qtyDOGE, double qtyBCH, double qtyXRP, double qtyTRX, double qtyEOS) 
   {
      this.qtyBTC = qtyBTC;
      this.qtyETH = qtyETH;
      this.qtyLTC = qtyLTC;
      this.qtyDOGE = qtyDOGE;
      this.qtyBCH = qtyBCH;
      this.qtyXRP = qtyXRP;
      this.qtyEOS = qtyEOS;
   }
   
   /**
   default constructor for a wallet with all attributes
   */
   public Wallet()
   {
      this.qtyBTC = 0.0;
      this.qtyETH = 0.0;
      this.qtyLTC = 0.0;
      this.qtyDOGE = 0.0;
      this.qtyBCH = 0.0;
      this.qtyXRP = 0.0;
      this.qtyEOS = 0.0;
   }
}