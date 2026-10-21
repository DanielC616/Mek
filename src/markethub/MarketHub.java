/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package markethub;

import java.util.List;

/**
 *
 * @author Revan
 */
public class MarketHub {
    
    private List<User> users;
    private List<Store> stores;
   

    public MarketHub(){
        
    }
    
    public User getSeller(int id){
        for (User user: this.users){
            if(user.id == id){
                return user;
            }
        }
        return null;
    }
}
