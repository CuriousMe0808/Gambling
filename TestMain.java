import java.util.Scanner;
import java.io.*;
import java.util.HashMap;

//Main class to test features
public class TestMain
{
   public static void main(String[] args)
   {
      createTwoUsersAndSaveToFile();
   }
   
   //Test for adding new users
   public static void createTwoUsersAndSaveToFile()
   {      
      HashMap<String, String[]> masterList = Utility.readMaster();
      
      Utility.addNewUser(masterList, "Kevin@student.tdsb.on.ca", "OWARC");
      Utility.addNewUser(masterList, "ZhouEnLai", "ICS4U");
   }
   
}