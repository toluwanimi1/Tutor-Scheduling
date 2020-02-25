/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jarrod
 */

import java.util.*;
import java.io.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Tutor {
    
    //variables
    private String Name;
    private String userName;
    private String userPassword;
    private String studentID;
    
    private double hours;
    
    //constructors
    
    public Tutor(String name)
    {
        Name = name;
    }  
    
        
    public Tutor(String name, String username, String password, String studentid)
    {
        
        Name = name;
        userName = username;
        userPassword = password;
        studentID = studentid;
        
    } 
    
    //methods             
    
    public void setHours(double matrix[][])                                                         //jarrod holley 
    {                                                                                               //needs exceptions 
     
        Scanner input = new Scanner(System.in);                                                     // needs logical hours of the day 
        LocalDateTime myTime = LocalDateTime.now();                                                 // Create a date object
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");          // Format the date easier to read
        
        String finalTime = myTime.format(formatTime);                                               //Use the set time and run format method
        System.out.println(finalTime);
        
        
        for(int row = 0; row < matrix.length; row++)                                                //row major 
        {
        
            for(int col = 0; col < matrix[0].length; col++)                                         //column major
            {
                if(col == 0)                                                         //monday
                {
                    System.out.println("Enter Hours for Monday: ");
                    matrix[row][col] = input.nextDouble();
                }    
                else if(col == 1)                                                   //tuesday
                {
                    System.out.println("Enter Hours for Tuesday ");
                    matrix[row][col] = input.nextDouble();
                }
                else if(col == 2)                                                   //wednesday
                {
                    System.out.println("Enter Hours for Wednesday: ");
                    matrix[row][col] = input.nextDouble();
                }    
                else if(col == 3)                                                   //thursday
                {
                   System.out.println("Enter Hours for Thursday: ");
                   matrix[row][col] = input.nextDouble();
                }    
                else if(col == 4)                                                   //friday
                {
                    System.out.println("Enter Hours for Friday: ");
                    matrix[row][col] = input.nextDouble();
                }    
                else
                {
                    System.out.println("invalid");
                }    
            }    
        
        }
        
        
    }        
    
    public void printHours(String days[], double matrix[][])
    {
        for(int length = 0; length < 5; length++)
        {
            System.out.print(days[length] + " ");
        }    
        
        System.out.println();
        
        for(int row = 0; row < matrix.length; row++)
        {
        
            for(int col = 0; col < matrix[0].length; col++)
            {
                System.out.print(matrix[row][col] + " ");  
            }    
        
        }
        
    }        
    
}
