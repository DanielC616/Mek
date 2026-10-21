/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package markethub;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Revan
 */
public class MarketHub {
    
    private List<User> users;
    private List<Store> stores;
   

    public MarketHub(){
        this.users = new ArrayList<>();
        this.stores = new ArrayList<>();
    }
    
    public User getSeller(int id){
        for (User user: this.users){
            if(user.id == id){
                return user;
            }
        }
        return null;
    }
    
    public void addUser(User user){
        this.users.add(user);
    }
    
    public Client getClient(int id){
        for(User client: this.users){
            if(client.getId() == id){
                return (Client)client;
            }
        }
        return null;
    }
    
    public void createStore(String name, LocalDate creationDate, User seller) {
        Store store = new Store(name,creationDate,seller);
    }

    public Store getStore(int index) {
        return this.stores.get(index);
    }
}
