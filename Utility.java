/**
Name: Kevin Zhou
<p>
Date: April 27, 2022
Description: Utility Class providing various tools
*/
import java.io.*;
import java.util.*;

public final class Utility
{

   final static String MASTERFILENAME = "MasterAccount.txt";
   final static String USERNAMETOKEN = "Username";
   final static String PASSWORDTOKEN = "Password";
   final static String ACCOUNTIDTOKEN = "AccountID";
   
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
      HashMap<String, String[]> masterList = new HashMap<String, String[]>();   
      String username, password, accountID, token, line;
      username = "";
      password = "";
      accountID = "";
      File saveFile = new File(MASTERFILENAME);
      
      if (saveFile.isFile())
      {
         try
         {
            BufferedReader myReader = new BufferedReader(new FileReader(MASTERFILENAME));         
            line = myReader.readLine(); //reads next line
            while(line != null && !line.isEmpty())
            {                   
               if(line.length() > 8)
               {
                  token = line.substring(0, 8);
                  if (USERNAMETOKEN.equals(token)) //checks for username
                  {
                     username = line.substring(10,line.length());
                  }
               
                  if (PASSWORDTOKEN.equals(token)) //checks for username
                  {
                     password = line.substring(10,line.length());
                  }
               }
               
               if(line.length() > 9)
               {
                  token = line.substring(0, 9);
                  if (ACCOUNTIDTOKEN.equals(token)) //checks for AccountID
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
      return masterList;
   }
   
   
   /**
   Writes the master account file
   @param HashMap<String, String[]> masterList the hashmap to write into the master account file
   */
   public static void saveMaster(HashMap<String, String[]> masterList)
   {
      try 
      {  
         File mySave = new File(MASTERFILENAME);
         if (!mySave.isFile())
         {
            mySave.createNewFile();
         }
         
         //variable
         String line;
         
         //write in the master account
         Writer writer = new BufferedWriter(new FileWriter(MASTERFILENAME));
            
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
}