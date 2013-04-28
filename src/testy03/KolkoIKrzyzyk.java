/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testy03;;

import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;
import java.util.Scanner;


/**
 *
 * @author musialm
 */
public class KolkoIKrzyzyk {

    public enum Znak { o,x }
    public enum Gracze { gracz1,gracz2,komputer }
    public KolkoIKrzyzyk() {}

    /*
    * Gra w kółko i krzyżyk     
    */
    public void GraDwochGraczy(){
        // Deklaracja zmiennych
        Scanner skaner = new Scanner(System.in);
        String[][] plansza = new String[3][3];
        for (int i = 0; i < 3; i++) {
            plansza[i][0] = "   "; 
            plansza[i][1] = "   "; 
            plansza[i][2] = "   "; 
        }
        Gracze gracz = Gracze.gracz1;
        Znak znak = Znak.o;
        String pole = ""; 
        int pion=0, poziom=0;
        boolean wygrana = false;
        
        // Pytamy użytkownika o kolejne liczby tak długo, dopóki ma ruchy
        // Każdy z graczy ma 5 i 4 ruchy
        // Na początek wyświetlaj tablicę z planszam do gry i zaznaczonymi ruchami
        System.out.println("Proszę podać gdzie chcesz umieścić kółko lub krzyżyk.");
        System.out.println("np. w polu A3,C1...");
        PokazPole(plansza);
        for (int ruchy = 0; ruchy < 9; ruchy++) {
            znak = (gracz == Gracze.gracz1) ? Znak.o : Znak.x;
                    
            System.out.print("Podaj pole: ");
            pole = skaner.nextLine();
            pion = pole.contains("1") ? 0:
                    pole.contains("2") ? 1: 
                     pole.contains("3") ? 2: 3;
            poziom = (pole.contains("a") || pole.contains("A")) ? 0:
                      (pole.contains("b") || pole.contains("B")) ? 1: 
                       (pole.contains("c") || pole.contains("C")) ? 2: 3;

            System.out.print("pion,poziom: "+pion+", "+poziom);
            plansza[pion][poziom] = (gracz == Gracze.gracz1) ? " o " : " x ";
            gracz = (gracz == Gracze.gracz1) ? Gracze.gracz2 : Gracze.gracz1;
            PokazPole(plansza);
            wygrana = SprawdzWygrana(plansza, znak);
            if (wygrana) 
                break;
        }
        if (!wygrana)
            System.out.println("Remis!!!...");
        
    }

    public void GraZKomputerem(){
        // Deklaracja zmiennych
        Scanner skaner = new Scanner(System.in);
        String[][] plansza = new String[3][3];
        for (int i = 0; i < 3; i++) {
            plansza[i][0] = "   "; 
            plansza[i][1] = "   "; 
            plansza[i][2] = "   "; 
        }
        Gracze gracz = Gracze.gracz1;
        Znak znak = Znak.o;
        String pole = ""; 
        int pion=0, poziom=0;
        boolean wygrana = false;
        
        // Pytamy użytkownika o kolejne liczby tak długo, dopóki ma ruchy
        // Każdy z graczy ma 5 i 4 ruchy
        // Na początek wyświetlaj tablicę z planszam do gry i zaznaczonymi ruchami
        System.out.println("Proszę podać gdzie chcesz umieścić kółko lub krzyżyk.");
        System.out.println("np. w polu A3,C1...");
        PokazPole(plansza);
        for (int ruchy = 0; ruchy < 9; ruchy++) {
            znak = (gracz == Gracze.gracz1) ? Znak.o : Znak.x;
            
            if (gracz == Gracze.gracz1 || gracz == Gracze.gracz2) {
                System.out.print("Podaj pole: ");
                pole = skaner.nextLine();
            }
            else if (gracz == Gracze.komputer) {
                pole = RuchKomputera(plansza, ruchy);
            }
            
            pion = pole.contains("1") ? 0:
                    pole.contains("2") ? 1: 
                     pole.contains("3") ? 2: 3;
            poziom = (pole.contains("a") || pole.contains("A")) ? 0:
                      (pole.contains("b") || pole.contains("B")) ? 1: 
                       (pole.contains("c") || pole.contains("C")) ? 2: 3;

            System.out.print("pion,poziom: "+pion+", "+poziom);
            plansza[pion][poziom] = (gracz == Gracze.gracz1) ? " o " : " x ";
            gracz = (gracz == Gracze.gracz1) ? Gracze.komputer : Gracze.gracz1;
            PokazPole(plansza);
            wygrana = SprawdzWygrana(plansza, znak);
            if (wygrana) 
                break;
        }
        if (!wygrana)
            System.out.println("Remis!!!...");
        
    }

    /*
     * _ruchy - liczba ruchów od 0 do 8 - 9 ruchów
     */
    private String RuchKomputera(String[][] _plansza, int _ruchy) {
        String wynik = "";
        if (_ruchy == 1){
            //sprawdz gdzie jest postawiony kółko
            
        }
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    private void PokazPole(String[][] _plansza){
        //Runtime.getRuntime().exec("cls");
        System.out.println("");
        System.out.println( "     A   B   C  ");
        for (int i=0; i<3; i++) {
            System.out.println(" "+(i+1)+" |"+ _plansza[i][0]+"|"+_plansza[i][1]+"|"+_plansza[i][2] +"|");
        }
    }
            
    private boolean SprawdzWygrana(String[][] _pl, Znak _znak){
        boolean wygrana = false;
        String znak = _znak == Znak.x ? " x " : " o ";
        //for (int i=0; i<3; i++) 
            if (    (  _pl[0][0] == znak && _pl[1][0] == znak && _pl[2][0] == znak) 
                 || (  _pl[0][0] == znak && _pl[1][0] == znak && _pl[2][0] == znak)  
                 || (  _pl[0][2] == znak && _pl[1][2] == znak && _pl[2][2] == znak)  
                 || (  _pl[0][0] == znak && _pl[0][1] == znak && _pl[0][2] == znak)  
                 || (  _pl[1][0] == znak && _pl[1][1] == znak && _pl[1][2] == znak)  
                 || (  _pl[2][0] == znak && _pl[2][1] == znak && _pl[2][2] == znak)  
                 || (  _pl[0][0] == znak && _pl[1][1] == znak && _pl[2][2] == znak)  
                 || (  _pl[0][2] == znak && _pl[1][1] == znak && _pl[2][0] == znak)  
                    ){
                System.out.println((znak == " x " ? "Krzyżyki" : "Kółka") +" wygrały...");
                wygrana = true;
            }
        return wygrana;
    }

    

}
       