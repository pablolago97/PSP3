
package ejercicio3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pablo
 */
public class Ejercicio3 extends Thread {
    
    static int  thread = 1;
    
    public Ejercicio3 (String str){
        super(str);
    }
   
    @Override
    public void run() {
        
     System.out.println(getName()+" en ejecución.");
     thread++;
     for(int i = 0; i < 6; i++){
     while(thread<5){
     new Ejercicio3("Hilo "+thread).start();
         try {
             join();
         } catch (InterruptedException ex) {
             Logger.getLogger(Ejercicio3.class.getName()).log(Level.SEVERE, null, ex);
         }
         
     }
     for(int w = 0; w<6;w++){
         
     while(thread==w){
         
         for(int k = 0;k<11;k++){
         System.out.println(getName() +" siguele");
         
         
         try {
             Thread.sleep(nAleatorio());
         } catch (InterruptedException ex) {
             
         }
         }
         thread++;
         
     }
     }
     
     
     
     }
         
    }
        
    public int nAleatorio(){
        int x = (int) (Math.random() * 600 + 100);
        return x;
    }
      

    public static void main(String[] args) {
       
       new Ejercicio3("Hilo "+thread).start();    
       
     
    }
}
    

