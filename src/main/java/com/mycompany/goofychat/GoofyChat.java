/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.goofychat;
import java.util.*;
/**
 *
 * @author lab_services_student
 */
public class GoofyChat {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        //Welcoming user to the application
        System.out.println("**********HELLO, WELCOME TO GOOFY CHAT!********** \n Do you have an account?If not, Create your account.");
        
        //Prompting user for personal credentials
        System.out.print("\nEnter First Name: ");
        String firstName = scan.nextLine();
        
        System.out.print("\nEnter Last Name: ");
        String lastName = scan.nextLine();
        
        System.out.print("\nEnter Date Of Birth: ");
        String birthDate = scan.nextLine();
      
        
    }
}
