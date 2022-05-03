import java.util.Scanner;
import java.io.*;
import java.util.HashMap;

public class TestMain
{
   public static void main(String[] args)
   {
      //variables
      Scanner sc = new Scanner(System.in);
      String inputUsername;
      String inputPassword;
      //BufferedReader reader = new BufferedReader(new FileReader());
      
      
//       System.out.println("Enter username: ");
//       inputUsername = sc.nextLine();
//       System.out.println("Enter password: ");
//       inputPassword = sc.nextLine();
      
      
     //  User kevin = new User("kevin.zhou3@student.tdsb.on.ca", "OWARC", "0808");
//       kevin.saveFile();
//       
//       User edwin = new User("ZhouEnLai", "ICS4U", "42069");
//       edwin.saveFile();
      
      HashMap<String, String[]> masterList = Utility.readMaster();
    //   
//       masterList.put("kevin.zhou3@student.tdsb.on.ca", new String[]{"OWARC", "0808"});
         masterList.put("ZhouEnLai", new String[]{"ICS4U", "42069"});

         if (masterList.get("kevin.zhou3@student.tdsb.on.ca") == null)
         {
            masterList.put("kevin.zhou3@student.tdsb.on.ca", new String[]{"OWARC", Utility.getAccountID()});
            Utility.saveMaster(masterList);

         }
         else
         {
            System.out.println("Duplicated username");
         }
            
         
         if (masterList.get("foo") == null)
         {
            masterList.put("foo", new String[]{"Wind", Utility.getAccountID()});
         }
        
         //Utility.saveMaster(masterList);
   }
}