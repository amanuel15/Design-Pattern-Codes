 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator.pattern;



/**
 *
 * @author hp
 */
public class user {
     private String name;
     private chatroom Chatroom;
     public user(String name,chatroom Chatroom){
         this.name = name;
         this.Chatroom = Chatroom;
     }
     
     public void sendMessage(String message){
         System.out.println(name + " is  sending the  message" +  message);
         Chatroom.sendMessageTousers(message,this);
         
         
     }
     
    public void receiveMessage(String message) {
        System.out.println(name  + " recieves the  message "  +  message);
    }
}