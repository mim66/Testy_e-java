/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testy03_zmienne;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DateTimeDV;
import javax.xml.crypto.Data;

/**
 *
 * @author musialm
 */
public class TextAndNumbers {
    public static void main(String[] args) {
        String imie         = "Marek";
        String nazwisko     = "Noname";
        int rokUrodzenia    = 1980;
        //boolean mezczyzna   = true;
        int rokBiezacy      = 2013;

        int wiek = rokBiezacy - rokUrodzenia;
        System.out.println("Jestem "+ imie+" "+ nazwisko+". Moja płeć to mężczyzna i w tym roku mam "+ wiek +" lat...");       
    }

}
