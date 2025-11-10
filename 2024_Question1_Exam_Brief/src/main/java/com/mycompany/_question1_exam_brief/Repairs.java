/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._question1_exam_brief;

/**
 *
 * @author kalis
 */
public class Repairs implements IRepairs{
    private double repairCosts;
    private double amount;
    private int repairs;
    
    public Repairs(double repairCosts, double amount, int repairs) {
        this.repairCosts = repairCosts;
        this.amount = amount;
        this.repairs = repairs;
    }

    public double getRepairCosts() {
        return repairCosts;
    }

    public double getAmount() {
        return amount;
    }

    public int getRepairs() {
        return repairs;
    }
    
    @Override
        public double RepairCosts(double[] repairCosts) {
        double total = 0;
        for (double cost : repairCosts) {
            total += cost;
        }
        return total;
    }

    @Override
    public double TechnicianPay(double amount) {
       return amount * 0.10; // 10% commission
    }

    @Override
    public int TopTechnician(double[] repairs) {
        int topIndex = 0;
        double max = repairs[0];
        for (int i = 1; i < repairs.length; i++) {
            if (repairs[i] > max) {
                max = repairs[i];
                topIndex = i;
            }
        }
    return topIndex;
    }
}
