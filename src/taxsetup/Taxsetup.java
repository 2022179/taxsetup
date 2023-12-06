/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taxsetup;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Primm
 */
public class Taxsetup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        
       
        // TODO code application logic here
        System.out.println("welcome to your infoslip");
        System.out.println("Setting up your portal...loading");
        System.out.println("Please enter your name : ");
        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
        
        
    BufferedReader br = new BufferedReader(new FileReader("taxpayer.csv"));// adding a file method
       
         }
    
}
