package com.tutorialspoint;  
import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException;  
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.io.ObjectInputStream; 
import java.io.ObjectOutputStream; 
import java.util.ArrayList; 
import java.util.List;  
public class UserDao { 
   @SuppressWarnings("unchecked")
public List<User> getAllUsers(){ 
      List<User> userList = null; 
      List<User> userList1 = null; 
      try {          File file = new File("Users.dat"); 
         if (!file.exists()) { 
            User user = new User(1, "Mahesh", "Teacher");
            User user1 = new User(2, "Jayesh", "Teacher");
            userList = new ArrayList<User>();
            userList1 = new ArrayList<User>();
            userList.add(user);
            userList.add(user1);
            saveUserList(userList);
            saveUserList(userList1);         } 
         else{             FileInputStream fis = new FileInputStream(file); 
            ObjectInputStream ois = new ObjectInputStream(fis); 
            userList = (List<User>) ois.readObject(); 
            ois.close();         } 
      } catch (IOException e) { 
         e.printStackTrace(); 
      } catch (ClassNotFoundException e) { 
         e.printStackTrace();      }   
      return userList;    } 
   private void saveUserList(List<User> userList){ 
      try {          File file = new File("Users.dat"); 
         FileOutputStream fos;  
         fos = new FileOutputStream(file); 
         ObjectOutputStream oos = new ObjectOutputStream(fos); 
         oos.writeObject(userList); 
         oos.close(); 
      } catch (FileNotFoundException e) { 
         e.printStackTrace(); 
      } catch (IOException e) { 
         e.printStackTrace(); 
      } 
   }    
}