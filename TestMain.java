public class TestMain
{
   public static void main(String[] args)
   {
      //variables
      User edwin = new User("EdwinPog", "kekw", "42069");
      Wallet stuff = new Wallet();
      //String output;
      
      System.out.println(edwin.getUsername());
      System.out.println(edwin.getPassword());
      System.out.println(edwin.getAccountID());
      
      //adds 20 dollars
      System.out.println(stuff.getQtyBTC());
      stuff.changeMoney(20);
      System.out.println(stuff.getQtyUSD());
      
      //buy 4 doge with 4 dollars
      stuff.buyCrypto("DOGE", 4);
      System.out.println(stuff.getQtyDOGE());
      System.out.println(stuff.getQtyUSD());
      
   }
}