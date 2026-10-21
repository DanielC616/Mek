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
 * @author Revan
 */
public class Order {
    private int id;
    private Client client;
    private LocalDate date;
    private Status status;
    private List<Product> products;

    public Order(int id, LocalDate date) {
        this.id = id;
        this.date = date;
        this.products = new ArrayList<>();
    }
    
    
}
