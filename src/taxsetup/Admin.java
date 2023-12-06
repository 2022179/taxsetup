/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taxsetup;

/**
 *
 * @author User
 */
public class Admin extends employee {
     private AdminRole adminRole;
     
     Admin admin = new Admin("CCT","Dublin", "AdminName", "AdminSurname");
    public Admin(String name, String birthdate, String email, String password) {
        super(name, birthdate, email, password);
        this.adminRole = adminRole;
    }

    private static class AdminRole {

        public AdminRole() {
        }
    }

    public AdminRole getAdminRole() {
        return adminRole;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdminRole(AdminRole adminRole) {
        this.adminRole = adminRole;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    
   public double calculateTax(double grossIncome, double taxIncome, Taxtype taxType){
   //admins they dont pay tax this will return 0
   return 0;
   
   }

    private static class Taxtype {

        public Taxtype() {
        }
    }
}
