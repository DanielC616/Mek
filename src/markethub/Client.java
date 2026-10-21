/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package markethub;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Luis
 */
public class Client extends User{
    private List<Order> orders;

    public Client(int id, String name, String email, LocalDate registrationDate) {
        super(id, name, email, registrationDate);
        this.orders = new ArrayList<>();
    }

    public void makeOrder(int id, LocalDate date) {
        Order order = new Order(id,date,this);
        this.orders.add(order);
    }
    
    public void addProductToOrder(int id, Product productToAdd, int i){
        for(Order order: this.orders){
            if(order.)
        }
    }
    
    
}
