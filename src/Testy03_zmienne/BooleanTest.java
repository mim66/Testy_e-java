/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testy03_zmienne;

/**
 *
 * @author musialm
 */
public class BooleanTest {           
    public static void main(String[] args) { 
        int a = 10; 
        int b = 23; 

        // a i b nie są równe                
        System.out.println("a = " + a);                
        System.out.println("b = " + b);                
        System.out.print("a == b: ");                

        System.out.println(a == b); 

        // przypisane wartości b do a                
        a = b;  

        // a i b są teraz równe                
        System.out.println("a = " + a);                
        System.out.println("b = " + b);                
        System.out.print("a == b: ");                
        System.out.println(a == b);           
    }       
}
