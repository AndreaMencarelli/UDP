/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udptime;
/**
 *
 * @author andrea
 */
public class AvvioClient {
    public static void main(String[] args) {
        
       ClientUDP cli = new ClientUDP(2000);    
       cli.invia();
       cli.ricevi();  
    }
}
