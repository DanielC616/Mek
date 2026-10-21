/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package markethub;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Luis
 */
public class Client extends User{
    private List<Order> orders;

    public Client(int id, String name, String email, Date registrationDate) {
        super(id, name, email, registrationDate);
        this.orders = new ArrayList<>();
    }
    
    
}
