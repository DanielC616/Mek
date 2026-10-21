/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package markethub;

/**
 *
 * @author Revan
 */
public class Element {
    private Product product;
    private int quantity;
    private float price;

    public Element(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.price = this.product.getPrice();
    }
    
}
