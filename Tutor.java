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
    
    private String Name;
    private String userName;
    private String password;
    private String studentID;
    
    private double hours;
    
    
    public Tutor(String nm)
    {
        Name = nm;
    }        
    
    public Tutor(String nm, String un, String pd, String si)
    {
        
        Name = nm;
        userName = un;
        password = pd;
        studentID = si;
        
    }        
    
    public void setHours(double h[][])
    {
     
        
        
        Scanner input = new Scanner(System.in);
        LocalDateTime myTime = LocalDateTime.now();     // Create a date object
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        
        String finalTime = myTime.format(formatTime);
        System.out.println(finalTime);
        
        
        
        
        for(int row = 0; row < h.length; row++)
        {
        
            for(int col = 0; col < h[0].length; col++)
            {
                if(col == 0)                      //monday
                {
                    System.out.println("Enter Hours for Monday: ");
                    h[row][col] = input.nextDouble();
                }    
                else if(col == 1)                 //tuesday
                {
                    System.out.println("Enter Hours for Tuesday ");
                    h[row][col] = input.nextDouble();
                }
                else if(col == 2)                 //wednesday
                {
                    System.out.println("Enter Hours for Wednesday: ");
                    h[row][col] = input.nextDouble();
                }    
                else if(col == 3)                 //thursday
                {
                   System.out.println("Enter Hours for Wednesday: ");
                   h[row][col] = input.nextDouble();
                }    
                else if(col == 4)                 //friday
                {
                    System.out.println("Enter Hours for Wednesday: ");
                    h[row][col] = input.nextDouble();
                }    
                else
                {
                    System.out.println("invalid");
                }    
            }    
        
        }
        
        
    }        
    
    public void getHours()
    {
        
    }        
    
}
