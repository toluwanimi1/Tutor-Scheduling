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
        
        int row = 1;
        int col = 5;
        
        Tutor t1 = new Tutor("jarrod", "holleyj0831", "password", "02");
        String[] Days = new String[col];
        double[][] hoursLog = new double[row][col];
        
        Days[0] = "Monday";
        Days[1] = "Tuesday";
        Days[2] = "Wednesday";
        Days[3] = "Thursday";
        Days[4] = "Friday";
                
        
        t1.setHours(hoursLog);
        t1.getHours(Days, hoursLog);

        
        
    }
    
}
