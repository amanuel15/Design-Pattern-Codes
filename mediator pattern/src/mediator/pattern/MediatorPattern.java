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
public class MediatorPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        chatroom Chatroom = new chatroom();
        user albert = new user("albert",Chatroom);
        user Nancy = new user("nancy",Chatroom);
        user marc = new user("marc",Chatroom);
        Chatroom.adduser(marc);
        Chatroom.adduser(Nancy);
        Chatroom.adduser(albert);
        albert.sendMessage(" hello all");
    }
    
}
