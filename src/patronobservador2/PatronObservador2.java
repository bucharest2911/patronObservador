/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronobservador2;

/**
 *
 * @author carlo
 */
public class PatronObservador2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ObservadorConcreto obj1=new  ObservadorConcreto();
       ObservableConcreto objobserv=new ObservableConcreto();
       objobserv.add(obj1);
       
          
         
          
    }
    
}
