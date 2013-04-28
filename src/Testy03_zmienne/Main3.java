/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testy03_zmienne;

/**
 *
 * @author musialm
 */
public class Main3 {
    public static void main(String[] args){
        System.out.println("2+2="+(2+2));
        int rok;
        rok = 2013;
        System.out.println("Zacząłem kurs Javy w "+ rok + " roku...");
        System.out.println(rok* 2);
        
        int liczba = 15;       
        System.out.println(liczba);       
        liczba = 16;       
        System.out.println(liczba);       
        liczba = liczba + 1;       
        System.out.println(liczba);  
        
        String tekst = "Ala"; 
        tekst = tekst + " ma "; 
        String tekst2 = "kota"; 
        System.out.println(tekst + tekst2);   // Ala ma kota
        
//      Float, który zajmuje 4 bajty,
//      Double, który pobiera 8 bajtów z pamięci.

        //float ulamek = 1.25;      // ŹLE!!        
        float ulamek_f = 1.25F;     // DOBRZE        
        //double ulamek = 1.25D;    // DOBRZE        
        double ulamek_d = 1.25;     // DOBRZE
        
        int     liczba1 = 12;         
        double  ulamek1 = 23.25;          
        int     liczba2;         
        double  ulamek2;           

        //liczba2 = liczba1 + ulamek1;                  // ŹLE!!         
        ulamek2 = liczba1 + ulamek1;               // DOBRZE           
        System.out.println(liczba1 + ulamek1);

    }
}
