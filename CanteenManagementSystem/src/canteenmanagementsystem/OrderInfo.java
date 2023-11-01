/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canteenmanagementsystem;

import java.util.Queue;

/**
 *
 * @author Ragul S
 */
public class OrderInfo {
    public static int order_id = 0;
    
    public static Queue<CustomerInfo> queue;
    
    public void add_order(CustomerInfo c){
        //c.orderid = order_id;
        queue.add(c);
        order_id++;
    }
    
    public void served(CustomerInfo c){
        queue.remove(c);
    }
}
