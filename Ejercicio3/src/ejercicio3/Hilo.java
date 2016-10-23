
package ejercicio3;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Hilo implements Runnable {
    
   
    Thread hilo;
    
    static int c=0;
    
    public void NuevoHilo() throws InterruptedException{
        hilo=new Thread(this,"Hilo");
        hilo.start(); 
        hilo.join();
        
    }
    
 
    @Override
    public void run() {
       for(int i = 0; i<6; i++){
           try {
               
               NuevoHilo();
           } catch (InterruptedException ex) {
               Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
           }
            System.out.println(hilo.getName());
            
       }
    
       
       }
      
        
    int tiempoAleatorio = (int) (Math.random()*600+100);
    }
    

