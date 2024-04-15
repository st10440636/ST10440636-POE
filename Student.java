/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.st10440636.poe;

/**
 *
 * @author sammy_50quonu
 */

import java.util.regex.Pattern;
import java.util.jar.Attributes.Name;

class Student {
      public String FirstName;
      public String LastName;
      public String StudentID;
      public String UserName;
      public String Password;
      
      public Student(String FirstName,String LastName, String StudentID, String UserName, String Password){
          this.FirstName = FirstName;
          this.LastName = LastName;
          this.StudentID = StudentID;
          this.UserName = UserName;
          this.Password = Password;
      }
      //Getters and Setters
      public String getFirstName(){
          return FirstName;
      }
      
      public void setFirstName(){
          this.FirstName = FirstName;
      }
      
      public String getLastName(){
          return FirstName;
      }
      
      public void setLastName(){
          this.LastName = LastName;
      }
      
      public String setStudentID(){
          return StudentID;
      }
      public void getStudentID(){
          this.StudentID = StudentID;
      }
      
      public String setUserName(){
          return UserName;
      }
      
      public void getUserName(){
          this.UserName = UserName;
      }
      
      public String setPassword(){
          return Password;
      }
      
      public void getPasssword(){
          this.Password = Password;
      }
      
     // Regular expression for username validation
    private static final Pattern USERNAME_PATTERN = Pattern.compile("^[a-zA-Z0-9_]{1,5}$");

    // Regular expression for password validation
    private static final Pattern PASSWORD_PATTERN = Pattern.compile(
            "^(?=.*[A-Z])" + // At least one uppercase letter
            "(?=.*[0-9])" + // At least one digit (0-9)
            "(?=.*[!@#$%^&*()_+\\-=`~\\[\\]{}|;:'\",.<>/?])" + // At least one special character
            ".{8,}$"); // At least 8 characters long

    // Function to validate the username
    public static boolean validateUsername(String username) {
        // Check if the username matches the criteria
        return USERNAME_PATTERN.matcher(username).matches() && username.contains("_");
    }

    // Function to validate the password
    public static boolean validatePassword(String password) {
        // Check if the password matches the criteria
        return PASSWORD_PATTERN.matcher(password).matches();
    }

    public static void main(String[] args) {
        
        String username = "user_";
        String password = "Password1!";

        // Validate the username
        boolean isUserNameValid = validateUsername(username);

        if(isUserNameValid){
            System.out.println("Username sucessfully captured");
        } else {
            System.out.println("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
        }
        // Validate the password
        boolean isPasswordValid = validatePassword(password);
       
        if(isPasswordValid){
            System.out.println("Password successfully captured.");
        } else{
            System.out.println("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character");
        }
      
    }
}
      
      
