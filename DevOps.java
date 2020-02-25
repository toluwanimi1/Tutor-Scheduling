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

public class DevOps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int row = 1;                                                                //set for one week
        int col = 5;                                                                //set for five days
        
        Tutor t1 = new Tutor("jarrod", "holleyj0831", "password", "02");
        String[] Days = new String[col];                                            //hold the days of the week 
        double[][] hoursLog = new double[row][col];                                 //hold hours for the days of the week 
        
        Days[0] = "Monday";                                                         //assign the days starting with monday
        Days[1] = "Tuesday";
        Days[2] = "Wednesday";
        Days[3] = "Thursday";
        Days[4] = "Friday";                                                         //last day friday tutoring center closes
                
        
        t1.setHours(hoursLog);                                                      //allows tutor object to set their hours within matrix
        t1.printHours(Days, hoursLog);                                                //print the hours 

        
        
    }
    
}
