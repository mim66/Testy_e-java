/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testy03_zmienne;

/**
 *
 * @author musialm
 */
public class DrawRectangle {  
    public static void main(String[] args) {            
        int dlugosc = 9;            
        int wysokosc = 7;              
        int i = 0;            
        int j = 0;              

        while (i < wysokosc){
            while (j < dlugosc){
                System.out.print("*");
                j++;
            }
            j=0;
            System.out.println("");
            i++;
        }
    
    }    
}
