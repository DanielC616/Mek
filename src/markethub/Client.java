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

    public List<Order> getOrders() {
        return orders;
    }
    
    

    public void makeOrder(int id, LocalDate date) {
        Order order = new Order(id,date,this);
        this.orders.add(order);
    }
    public Order getOrder(int id){
        for(Order order : this.orders){
            if(order.getId()==id){
                return order;
            }
        }
        return null;
    }

    public void confirmOrder(int orderId) {
        Order order = getOrder(orderId);
        order.confirmOrder();
    }

    public void receiveOrder(int i) {
        Order order = getOrder(i);
        order.setStatus(Status.DELIVERED);
    }
    
    public void cancelOrder(int i) {
        Order order = getOrder(i);
        if (order.getStatus() == Status.SENT){
       for (Element element : order.getProducts()){
           element.getProduct().addInventoryQuantity(element.getQuantity());
       }
        }
       order.setStatus(Status.CANCELED);
    }
    
    public void addProductToOrder(int id, Product productToAdd, int i){
        Element element = new Element(productToAdd, i);
        for(Order order: this.orders){
            if(order.getId() == id){
                order.addProduct(element);
            }
        }
    }
    
    
}
