/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxsetup;

/**
 *
 * @author Primm
 */
public class employee {

    //getter for tax ID
    public static int getTaxID() {
        return taxID;
    }

    public static void setTaxID(int aTaxID) {
        taxID = aTaxID;
    }
 
    private String name;
    private String birthdate;
    private String email;
    private int staffID;
    private String password;
    private static int taxID =1;// this means its final and cant be changed 
   //constructors 
    public employee(String name, String birthdate, String email) {
        this.name = name;
        this.birthdate = birthdate;
        this.email = email;
        this.staffID = staffID;
    }
//setters 
    public void setName(String name) {
        this.name = name;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }
    
}
