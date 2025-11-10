/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany._question1_exam_brief;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kalis
 */
public class RepairsTest {
    
    public RepairsTest() {
    }

    @Test
    void CalculateCosts_ReturnsRepairCosts() {
        Repairs repairs = new Repairs(0, 0, 0);
        double[] costs = {8000, 2500, 5000};
        double expectedTotal = 8000 + 2500 + 5000; // 15500
        assertEquals(expectedTotal, repairs.RepairCosts(costs), 0.001);
    }

    @Test
    void CalculatePay_ReturnsExpectedPay() {
        Repairs repairs = new Repairs(0, 0, 0);
        double amount = 15500;
        double expectedPay = 15500 * 0.10; // 10% commission
        assertEquals(expectedPay, repairs.TechnicianPay(amount), 0.001);
    }

    @Test
    void TopTechnician_ReturnsExpectedPay() {
        Repairs repairs = new Repairs(0, 0, 0);
        double[] totals = {15500, 14800};
        int expectedTopIndex = 0; // first technician has higher total
        assertEquals(expectedTopIndex, repairs.TopTechnician(totals));

        double[] totals2 = {12000, 14800};
        int expectedTopIndex2 = 1; // second technician has higher total
        assertEquals(expectedTopIndex2, repairs.TopTechnician(totals2));
    }
}