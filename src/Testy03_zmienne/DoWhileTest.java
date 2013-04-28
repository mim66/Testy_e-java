/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testy03_zmienne;

/**
 *
 * @author musialm
 */
public class DoWhileTest {  
    public static void main(String[] args) {            
        int a = 7;           
        int limit = a + 10;   

        do {                
            System.out.println(a);            
        } while (a++ < limit);        
    }    
}
