/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testy03;

import java.util.Scanner;

/**
 *
 * @author musialm
 */
public class Main03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //OdczytDanychZKlawiatury();
        //ImieNazwisko();
        //LiczbaZKlawiatury();
        Cwiczenia cw = new Cwiczenia();
        //cw.Kalkulator();
        //cw.CountToZero();
        //cw.LiczbaDoPotegi();
        
        //From0To9ByIfElse();
        //From0To9BySwitch();
        //ForLoopTest();
        //MathTest();
        //ArrayTest();
        //cw.TabliceJednowymiarowe_3();
        KolkoIKrzyzyk gra = new KolkoIKrzyzyk();
        //gra.GraDwochGraczy();
        //gra.GraZKomputerem();
        //OperacjeTekstowe();
        //cw.Tekst_PobierzISortujDwaWyrazy();
        //cw.Tekst_Szyfruj();
        //cw.Tekst_PiecImion();
        
        //Rzutowanie();
        Printf_Test();
        
        
    }

    public static void OdczytDanychZKlawiatury(){
        //zmienna do odczytu danych. 
        //Bedzie to obiekt klasy Scanner
        //Jako strumień wejścia bedą znaki wprowadzone z klawiatury
        Scanner scanner = new Scanner(System.in);
        String imie;
        String nazwisko;
        
        //Metoda nextLine pobiera całą linijkę od użytkownika, czyli w momencie,
        //gdy on wciśnie ENTER (bo to jest rozpoczęcie nowej linii) program pobiera dane.
        System.out.print("Podaj swoje imię: "); 
        imie = scanner.nextLine();
        System.out.print("Podaj swoje nazwisko: "); 
        nazwisko = scanner.nextLine();
        
        System.out.println("Nazywasz się "+imie+ " "+nazwisko);
    }
    
    public static void ImieNazwisko(){
        //zmienna do odczytu danych. 
        //Bedzie to obiekt klasy Scanner
        //Jako strumień wejścia bedą znaki wprowadzone z klawiatury
        Scanner scanner = new Scanner(System.in);
        String imie;
        String nazwisko;
        
        //Metoda nextLine pobiera całą linijkę od użytkownika, czyli w momencie,
        //gdy on wciśnie ENTER (bo to jest rozpoczęcie nowej linii) program pobiera dane.
        System.out.print("Podaj swoje imię: "); 
        imie = scanner.nextLine();
        System.out.print("Podaj swoje nazwisko: "); 
        nazwisko = scanner.nextLine();
        
        System.out.println("Nazywasz się "+imie+ " "+nazwisko);
    }
    
    public static void LiczbaZKlawiatury(){
        //zmienna do odczytu danych. 
        //Bedzie to obiekt klasy Scanner
        //Jako strumień wejścia bedzie liczba wprowadzona z klawiatury
        Scanner scanner = new Scanner(System.in);
        int liczba;
        
        //Metoda nextLine pobiera całą linijkę od użytkownika, czyli w momencie,
        //gdy on wciśnie ENTER (bo to jest rozpoczęcie nowej linii) program pobiera dane.
        System.out.print("Podaj liczbę: "); 
        liczba = scanner.nextInt();
        
        System.out.println("Scanner zwraca wartość: "+liczba);
    }
    
    public static void From0To9ByIfElse() {           
        Scanner skaner = new Scanner(System.in);           
        int cyfra;            // Pobieranie cyfry od uzytkownika 

        System.out.print("Podaj cyfrę z zakresu od 0 do 9: ");           
        cyfra = skaner.nextInt();            // Liczenie od danej cyfry do 9           

        if (cyfra == 0)    {System.out.println("zero");     cyfra++;}          
        if (cyfra == 1)    {System.out.println("jeden");    cyfra++;}           
        if (cyfra == 2)    {System.out.println("dwa");      cyfra++;}           
        if (cyfra == 3)    {System.out.println("trzy");     cyfra++;}           
        if (cyfra == 4)    {System.out.println("cztery");   cyfra++;}           
        if (cyfra == 5)    {System.out.println("pięć");     cyfra++;}           
        if (cyfra == 6)    {System.out.println("sześć");    cyfra++;}           
        if (cyfra == 7)    {System.out.println("siedem");   cyfra++;}           
        if (cyfra == 8)    {System.out.println("osiem");    cyfra++;}           
        if (cyfra == 9)    {System.out.println("dziewięć"); cyfra++;}           
        if (cyfra < 0 || cyfra > 9)    
            System.out.println("Podałeś niepoprawną cyfrę");       
    }   

    public static void From0To9BySwitch() {           
        Scanner skaner = new Scanner(System.in);           
        int cyfra;            // Pobieranie cyfry od uzytkownika 

        System.out.print("Podaj cyfrę z zakresu od 0 do 9: ");           
        cyfra = skaner.nextInt();            // Liczenie od danej cyfry do 9           

        // Liczenie od danej cyfry do 9   
        switch (cyfra) {       
            case 1:     
                System.out.println("jeden");       
            case 2:     
                System.out.println("dwa");       
            case 3:     
                System.out.println("trzy");       
            case 4:     
                System.out.println("cztery");       
            case 5:     
                System.out.println("pięć");       
            case 6:     
                System.out.println("sześć");       
            case 7:     
                System.out.println("siedem");       
            case 8:     
                System.out.println("osiem");       
            case 9:                  
                System.out.println("dziewięć");                  
                break;       
            default:    
            System.out.println("Podałeś niepoprawną cyfrę");   
        }
    }   

    public static void ForLoopTest(){
        for (int i = 0; i < 10; i++) { 
            System.out.println(i);           
        }       
    }

    private static void MathTest() {
        double liczba;
        int wybor;
        Scanner scanner = new Scanner(System.in);
        
        //pobieranie danych od użytkownika
        System.out.print("Podaj jakąś liczbę:");
        liczba = scanner.nextDouble();
        
        //Pobieranie wybranej opcji od użytkownika
        System.out.println("\nCo mam zrobić z liczbą?");
        System.out.println("1. Podnieść do kwadratu?");
        System.out.println("2. Wyciągnąć pierwiastek?");
        System.out.print("Twój wybór: ");
        wybor = scanner.nextInt();
        
        switch(wybor){
            case 1:  System.out.println(liczba +" do kwadratu wynosi: "+ Math.pow(liczba, 2)); break;
            case 2:  System.out.println("Pierwiastek z "+liczba+" wynosi: "+ Math.sqrt(liczba)); break;
            // Wybór nieprzewidzianej opcji                     
            default: System.out.println("Oszukujesz ;-)");                                     break;
        }
    }
    
    public static void ArrayTest() {
        // Deklaracja zmiennych
        Scanner skaner = new Scanner(System.in);
        int[] liczby = new int[100];
        int suma = 0;
        int ilosc = 0;

        // Pytamy użytkownika o kolejne liczby tak długo, póki nie wpisze zero 
        for (int i = 0; i < liczby.length; i++) {
            System.out.print("Podaj liczbę: ");
            liczby[i] = skaner.nextInt();

            if (liczby[i] == 0) {
                ilosc = i;
                break;
            }
        }

        // Sumowanie wszystkich podanych liczb ze sobą
        for (int i = 0; i < ilosc; i++)
            suma += liczby[i];

        // Wyświetlanie wyniku
        System.out.println("Suma twoich liczb wynosi: " + suma);
    }

    public static void OperacjeTekstowe(){
        System.out.println("Metoda charAt");
        String tekst = "Kurs Java na e-java.pl";
        char litera = tekst.charAt(2);
        System.out.println(litera);
        
        System.out.println("\nMetoda equalsIgnoreCase");
        String tekst1 = "tekst";
        String tekst2 = "TeKsT";
        String tekst3 = "teksty";
        boolean wynik;
        // "tekst" i "TeKsT"
        wynik = tekst1.equalsIgnoreCase(tekst2);
        System.out.println("'tekst' i 'TeKsT': " +wynik);
        // "tekst" i "teksty"
        wynik = tekst1.equalsIgnoreCase(tekst3);
        System.out.println("'tekst' i 'teksty': "+wynik);

        System.out.println("\nMetoda startsWith");
        String alaMaKota = "Ala ma kota";
        String ala = "Ala";
        String maKota = "ma kota";
        // sprawdzenie, czy "Ala" jest początkiem zmiennej alaMaKota
        wynik = alaMaKota.startsWith(ala);
        System.out.println("sprawdzenie, czy \"Ala\" jest początkiem zmiennej alaMaKota: "+wynik);
        // sprawdzenie, czy "ma kota" jest początkiej zmiennej alaMaKota
        wynik = alaMaKota.startsWith(maKota);
        System.out.println("sprawdzenie, czy \"ma kota\" jest początkiej zmiennej alaMaKota: "+wynik);

        System.out.println("\nMetoda endsWith");
//        String alaMaKota = "Ala ma kota";
//        String ala = "Ala";
//        String maKota = "ma kota";
//        boolean wynik;
        // sprawdzenie, czy "Ala" jest na końcu zmiennej alaMaKota
        wynik = alaMaKota.endsWith(ala);
        System.out.println("sprawdzenie, czy \"Ala\" jest na końcu zmiennej alaMaKota: "+wynik);
        // sprawdzenie, czy "ma kota" jest na końcu zmiennej alaMaKota
        wynik = alaMaKota.endsWith(maKota);
        System.out.println("sprawdzenie, czy \"ma kota\" jest na końcu zmiennej alaMaKota: "+wynik);

        System.out.println("\nMetoda substring");
        tekst = "Witaj w kursie e-java.pl!";
        String parametr1 = tekst.substring(8);
        String parametry2 = tekst.substring(8, 11);
        System.out.println("\"Witaj w kursie e-java.pl!\" - tekst.substring(8): "    +parametr1);      // wynik: "kursie e-java.pl!"
        System.out.println("\"Witaj w kursie e-java.pl!\" - tekst.substring(8, 11): "+parametry2);     // wynik: "kurs"
        
        System.out.println("\nMetoda length");
        tekst = "Przykładowy tekst";
        int ilosc = tekst.length();
        System.out.println("\"Przykładowy tekst\" - tekst.length(): " + ilosc);      // wynik: 17

        System.out.println("\nMetoda replace");
        tekst = "Kurs e-java.pl";
        tekst.replace('a', '@');
        System.out.println("\"Kurs e-java.pl\" - tekst.replace('a', '@'): "+tekst.replace('a', '@'));     // wynik: "Kurs e-j@v@.pl"

        System.out.println("\nMetoda split");
        tekst = "Darmowy:kurs:e-java.pl";
        /* Uznajemy za separator dwukropek ':', rozdzielamy tekst i zapisujemy
         * jako tablicę.
         */
        String[] tablica = tekst.split(":");
        System.out.println(tablica[0]);    // wynik: "Darmowy"
        System.out.println(tablica[1]);    // wynik: "kurs"
        System.out.println(tablica[2]);    // wynik: "e-java.pl"
        
        System.out.println("\nMetoda trim");
        tekst = "Kod seryjny: 54243 ";
        // usuwamy niepotrzebne spacje na końcu
        System.out.println("\"Kod seryjny: 54243 \" - tekst.trim(): "+tekst.trim()+"\"");    // wynik: "Kod seryjny: 54243"

    }

    public static void Rzutowanie(){
        float zmiennaFloat = 12.5F;
        double zmiennaDouble = (double) zmiennaFloat;
        System.out.println("Twoja liczba to: " + zmiennaFloat);
        System.out.println("Twoja liczba to: " + zmiennaDouble);
        System.out.println();

        char c1 = 'a';
        int i1 = (int) c1; 
        int i2 = 174;
        char c2 = (char) i2;
        System.out.println("c1: " + c1);
        System.out.println("kod ascii: " + i1);
        System.out.println("c2: " + c2);
        System.out.println("kod ascii: " + i2);

        // Deklarujemy zmienną typu String
        String s = "1234";
        // Deklarujemy zmienną typu int
        int i = 4321;
        // Deklarujemy zmienną int, która parsuje zmienną s
        int parsedS = Integer.parseInt(s);
        // Wyświetlamy działanie int + String
        System.out.print("s + i: ");
        System.out.println(s + i);
        // Wyświetlamy działanie int + sparsowany String na int
        System.out.print("parsedS + i: ");
        System.out.println(parsedS + i);

        
        
        
    }
    
    private static void Printf_Test (){
//        int rok;
//        Scanner skaner = new Scanner(System.in);
//        System.out.print("Podaj swój rok urodzenia: ");
//        rok = skaner.nextInt();
//        System.out.println("Urodziłeś się w " + rok + " roku.");
//        System.out.printf("Urodziłeś się w %d roku", rok);
        
        int i=14;
        double d = 1.35;
        String s ="Tekst";
        char c = 'c';
        boolean b = true;
        // Zapisane za pomocą println
        System.out.println(i+", "+d+", "+s+", "+c+", "+b);
        // Zapisane za pomocą printf
        System.out.printf("%d, %f, %s, %c, %b %n", i, d, s, c, b);
        
        double pln   = 12344.78;
        float  dolar =  3479.96F;
        int    euro  =  2802;
        
        System.out.printf("%,.2f %n", pln);
        System.out.printf("%, .2f $ %n", dolar);
        System.out.printf("%, d,00 &euro; %n", euro);
    }

    
}
