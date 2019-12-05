/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator.pattern;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class chatroom {

    public void sendMessageTousers(String message,user sender) {
       for(user User:users){
           if(User!= sender)
           User.receiveMessage(message);
       }
    }
    
    private ArrayList<user> users;
    public chatroom(){
         users= new ArrayList<>();
    }
    public void adduser(user User){
        users.add(User);
        
    }
    
    
    
    
    
}
