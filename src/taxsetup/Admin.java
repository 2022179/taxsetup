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
     private AdminRole AdminRole;
     
     Admin admin = new Admin("CCT","Dublin", "AdminName", "AdminSurname", AdminRole.SUPER_ADMIN);
    public Admin(String name, String birthdate, String email, String password) {
        super(name, birthdate, email, password);
    }
    
}
