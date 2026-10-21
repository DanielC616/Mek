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
public class Store {
    private String name;
    private LocalDate creationDate;
    private Seller owner;
    private List<Product> products;
    
    public Store(String name, LocalDate creationDate, User seller){
        this.name = name;
        this.creationDate = creationDate;
        this.owner = (Seller)seller;
        this.owner.setStore(this);
        this.products = new ArrayList<>();
    }

    public void createProduct(String laptop, String high_performance_laptop, double d, String electronics, int i) {
        Product product = new Product(laptop,high_performance_laptop, (float) d,electronics,i);
    }
    public Product getProduct(int index){
        return this.products.get(index);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public Seller getOwner() {
        return owner;
    }

    public void setOwner(Seller owner) {
        this.owner = owner;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    
    
    
}
