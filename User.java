/**
Name: Kevin Zhou
<p>
Date: April 27, 2022
Description: user information
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
   }
   
   /**
   Default constructor
   */
   public User()
   {
      this.username = "";
      this.password = "";
      this.accountID = "";
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
   
   //setters
   /**
   Changes the username
   @param newUsername the new username
   */
   public void setUsername(String newUsername)
   {
      this.username = newUsername;
   }
   /**
   Changes the password
   @param newPassword the new password
   */
   public void setPassword(String newUsername)
   {
      this.username = newUsername;
   }
}