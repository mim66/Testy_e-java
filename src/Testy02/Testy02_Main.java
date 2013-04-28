/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testy02;

/**
 *
 * @author musialm
 */
public class Testy02_Main {

    public static void main(String[] args) {
        PrzeniesienieLinii();
        Dane();
        
    }
    
    public static void PrzeniesienieLinii(){
        System.out.println("Print a println to dwie inne rzeczy\n"
                +"w jednej linii wyświetla ten pierwszy\n" 
                +"drugi to samo, lecz trochę inaczej\n" 
                +"na koniec tekstu dodaje pewien znaczek\n" 
                +"znak specjalny – \\n – jak wiesz dobrze\n" 
                +"to nowa linia, a \\t to odstęp\n" 
                +"cudzysłów to \\”, a \\’ jest apostrofem\n" 
                +"pamiętaj o tym. I na tym już koniec.");
    }

    public static void Dane(){
        //uzytkownik 1
        String[]   imie     = {"antonina", "darek", "franek"};
        String[]   nazwisko = {"kimono","kopania", "kimono"}; 
        String[]   urodziny = {"1 stycznia 1980","2 luty 1978", "3 marca 1982"}; 
        int[]      pesel    = {12345,23456,23456};
        String[]   adres    = {"Granatowa 15, Rokicie", "Fioletowa 15, Nowe Rokicie", "Granatowa 15, Rokicie"};

        //Jan Kowalski:          ur. 1 Stycznia 1971 r. 
        //Adres zamieszkania:    ul. Żwirki i Wigury 2, 00−000 Warszawa 
        //Pesel:                 71010154321
        int i = 0,j = 0;
        int granica = 3;
        while (i<granica){
            System.out.println(imie[i]+" "+nazwisko[i]+":        ur. "+urodziny[i]+" r.");
            System.out.println("  Adres zamieszkania: "+adres[i]);
            System.out.println("  Pesel:              "+pesel[i]);
            i++;
        }
        
//        System.out.println("te same osoby mogą się tak samo nazywać ale już nie mogą mieszkać w tym samym miejscu "
//                + "(mogą za to mieszkać razem jeśli różnią się imieniem bądź nazwiskiem)");
        
        boolean czyToSamoNazwisko = false;
        boolean czyToSamoImie   = false;
        boolean czyTenSamAdres  = false;
        boolean czyTenSamPesel  = false;
        String  toSamoNazwisko  = "";
        i = j = 0;
        while (i<granica){
            while (j<granica){
                if (i!=j){
                    if (nazwisko[i] == nazwisko[j]) {
                        czyToSamoNazwisko = true;
                        czyToSamoImie = (imie[i] == imie[j]);
                        toSamoNazwisko = nazwisko[j];
                        czyTenSamAdres = (adres[i] == adres[j]);
                    }
                }
                j++;
            }
            i++;
        }
        if ((!czyToSamoNazwisko || !czyToSamoImie) && czyTenSamAdres)
            System.out.println("Osoby mogą  mieszkać razem jeśli różnią się imieniem bądź nazwiskiem...");
        else if (czyToSamoNazwisko && czyToSamoImie && czyTenSamAdres)
            System.out.println("Te same osoby mogą się tak samo nazywać ale już nie mogą mieszkać w tym samym miejscu...");

        i = j = 0;
        while (i<granica){
            while (j<granica){
                if (i!=j)
                    czyTenSamPesel = (pesel[i] == pesel[j]);
                j++;
            }
            i++;
        }
        if (czyTenSamPesel)
            System.out.println("Pesel musi jest zawsze unikalny dla każdej z osób");
        
    }
    
    
    
}
