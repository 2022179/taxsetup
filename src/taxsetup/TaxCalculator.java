/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package taxsetup;

/**
 *
 * @author User
 */
public interface TaxCalculator {
    
    double calculator(double grossIncome, double taxCredits,TaxType taxType);
}
