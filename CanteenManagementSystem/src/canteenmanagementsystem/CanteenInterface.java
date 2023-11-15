/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canteenmanagementsystem;
import Model.AdminLogin;
import Model.Login;

/**
 *
 * @author Selva
 */
public class CanteenInterface {
    public static void main(String args[])
    {
        AdminInfo ai = new AdminInfo("Admin","admin");
        AdminInfo.Admin_array.add(ai);
        CustomerInfo ci = new CustomerInfo("User","user","user@gmail.com",100);
        
        new Login().setVisible(true);
        new AdminLogin().setVisible(true);
    }
}
