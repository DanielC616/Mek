/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package markethub;

/**
 *
 * @author Revan
 */
public class Product {
    private String name,description;
    private float price;
    private String category;
    private int inventoryQuantity;

    public Product(String name, String description, float price, String category, int inventoryQuantity) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.inventoryQuantity = inventoryQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setInventoryQuantity(int inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }
    public void addInventoryQuantity(int add){
        inventoryQuantity+=add;
    }
    public void consume(int add){
        inventoryQuantity-=add;
    }
    
    
}
