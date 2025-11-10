/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._question1_exam_brief;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kalis
 */
public class App {

    public static void main(String[] args) {
        String[] month = {"JAN", "FEB", "MAR"};
        String[] technician = {"Joe Bloggs", "Jane Doe"};
        
        double[][] amounts = {{8000, 2500, 5000},
                              {7000, 2200, 5600}};
        
        display(month, technician, amounts);
    }
   public static double[] splittingMethod(double[][] amounts){
        List<Double> values = new ArrayList<>();
        
        for (int i = 0; i < amounts.length; i++) {         
            for (int j = 0; j < amounts[i].length; j++) {
                values.add(amounts[i][j]); 
            }
        }
        double[] totalRepairs = new double[values.size()];
        for (int i = 0; i < values.size(); i++) {
            totalRepairs[i] = values.get(i);
        }
        return totalRepairs;
    } 
    
    public static void display(String[] month, String[] technician, double[][] amounts){
        //Creating an instance of the movie tickets class
        Repairs r = new Repairs(0, 0, 0); // dummy instance to call interface methods
        
        System.out.println("TECHNICIAN VEHICLE REPAIR REPORT\n"); 
        for (int i = 0; i < month.length; i++) {
            System.out.print("\t\t" + month[i]);
        }
        System.out.println("\n" + "-".repeat(72));    
        
        double[] totalRepairsPerTechnician = new double[technician.length];
        
        for (int i = 0; i < technician.length; i++) {
            if (technician[i].length() > 8) {
                System.out.print(technician[i] + "\t");  
            } else {
                System.out.print(technician[i] + "\t\t"); 
            }
            
            double total = 0;
            for (int j = 0; j < amounts[i].length; j++) {
                System.out.print(amounts[i][j] + "\t\t");
                total += amounts[i][j];
            }
            totalRepairsPerTechnician[i] = total;
            System.out.println();
        } 
        
        System.out.println();
        for (int i = 0; i < technician.length; i++) {
            System.out.println("Total repairs for " + technician[i] + " = R " + totalRepairsPerTechnician[i]);
        }
        
        // Display commissions
        System.out.println();
        for (int i = 0; i < technician.length; i++) {
            double commission = r.TechnicianPay(totalRepairsPerTechnician[i]);
            System.out.println("Repair Commission for " + technician[i] + " = R " + commission);
        }

        int topTechIndex = r.TopTechnician(totalRepairsPerTechnician);
        System.out.println("\nTop performing vehicle repair technician: " + technician[topTechIndex]);
    }    
}