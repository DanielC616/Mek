/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package markethub;

import java.util.Date;

/**
 *
 * @author Luis
 */
public class Seller extends User{
    private Store store;

    public Seller(int id, String name, String email, Date registrationDate) {
        super(id, name, email, registrationDate);
        this.store = null;
    }
    
    
}
