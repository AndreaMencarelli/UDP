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
public class AvvioServer {
    public static void main(String[] args) {
    
        ServerUDP sv = new ServerUDP(2000);
        
        while(true){
           sv.ascolta();
           sv.ricevuto();
           sv.invia();
       }     
    }
}
