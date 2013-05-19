/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testy03;

//import java.io.UnsupportedEncodingException;
//import java.net.URLDecoder;
//import java.net.URLEncoder;
import java.util.Date;
//import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author musialm
 */
public class Cwiczenia {
    public void Kalkulator(){
        System.out.println("Kalkulator...");
        
        int a, b, wybor;
        String wynik = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz opcję do wyboru:\n 1-dodawanie, 2-odejmowanie, 3-mnożenie, 4-dzielenie: ");
        System.out.print("Podaj numer opcji: ");
        wybor = scanner.nextInt();

        System.out.print("Podaj pierwszą liczbę: ");
        a = scanner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        b = scanner.nextInt();
        
         switch (wybor) {
            case 1:  wynik = "Dodawanie - "  +a+"+"+b+"="+(a+b); break;
            case 2:  wynik = "Odejmowanie - "+a+"-"+b+"="+(a-b); break;
            case 3:  wynik = "Mnożenie - "   +a+"*"+b+"="+(a*b); break;
            case 4:  wynik = "Dzielenie - "  +a+"/"+b+"="+(a/b); break;
            default: break;
        }
        System.out.println(wynik);
    }

    public void CountToZero(){
        Scanner skaner = new Scanner(System.in);           
        int cyfra;            // Pobieranie cyfry od uzytkownika 

        System.out.print("Podaj jakąś cyfrę: ");           
        cyfra = skaner.nextInt();            // Liczenie od danej cyfry do 9           

        if (cyfra==0)
            System.out.println("Cyfra jest równa zeru...");           
        else if (cyfra>0){
            System.out.println("Cyfra jest większa od zera...");           
            for (int i = cyfra; i > 0; i--) { 
                System.out.println(i);           
            }       
        }
        else {
            System.out.println("Cyfra jest mniejsza od zera...");           
            for (int i = cyfra; i < 0; i++) { 
                System.out.println(i);           
            }       
        }
    }

    public void LiczbaDoPotegi() {
        double liczba;
        int potega;
        Scanner scanner = new Scanner(System.in);
        
        //pobieranie danych od użytkownika
        System.out.print("Podaj jakąś liczbę:");
        liczba = scanner.nextDouble();
        System.out.print("Podaj jej potęgę:");
        potega = scanner.nextInt();
        System.out.println(liczba +" do potęgi "+ potega +" wynosi: "+ Math.pow(liczba, potega));
    }

    public void TabliceJednowymiarowe_3() {
        // Deklaracja zmiennych
        Scanner skaner = new Scanner(System.in);
        int[] liczby1 = null;
        int[] liczby2 = null;
        int suma = 0;
        int ilosc = 0;

        // Pytamy użytkownika o kolejne liczby tak długo, póki nie wpisze zero
        // Kopiujemy dane z tablicy2 do tablicy1 i 
        for (int i = 0; i < 100; i++) {
            System.out.print("Podaj liczbę: ");
            liczby1 = new int[(i+1)];
            
            if (liczby2 != null) {
                for (int j=0; j<liczby2.length; j++ ) 
                    liczby1[j] = liczby2[j];
            }
            liczby1[i] = skaner.nextInt();
            liczby2 = new int[(i+1)];
            liczby2 = liczby1;
            liczby1 = null;
            
            if (liczby2[i] == 0) { ilosc = i; break; }
        }
        // Sumowanie wszystkich podanych liczb ze sobą
        for (int i = 0; i < ilosc; i++)
            suma += liczby2[i];

        // Wyświetlanie wyniku
        System.out.println("Suma twoich liczb wynosi: " + suma);
    }

    public void Tekst_PobierzISortujDwaWyrazy() {
        String[] tablica1 = new String[3];
        //String[] tablica2 = new String[3];
        Scanner scanner = new Scanner(System.in);
        //boolean wynik = false;
        String string1 = "";
        String string2 = "";
                        
        //pobieranie danych od użytkownika
        System.out.print("Podaj pierwszy wyraz:");
        tablica1[0] = scanner.next();
        System.out.print("Podaj drugi wyraz:");
        tablica1[1] = scanner.next();
        System.out.print("Podaj trzeci wyraz:");
        tablica1[2] = scanner.next();
        for (int i=0;i<tablica1.length;i++){
            string1 += tablica1[i] + (i==(tablica1.length-1) ? ";": ", ");
        }
        System.out.println("Pobrana tablica: " + string1);
        System.out.println("Sortowanie od najmiejszego i usuwanie białych znaków:");
        string1 = "";
        for (int i=0;i<tablica1.length;i++){
            //wcześniejsza wartość
            if (i>0){
                string1 = tablica1[(i-1)].replaceAll("\\s","");
                string2 = tablica1[(i  )].replaceAll("\\s","");
                //Kiedy druga wartość jest większa to zamień drugą z pierwszą
                if (string1.length() > tablica1[i].length()){
                    tablica1[(i-1)] = string2;
                    tablica1[(i)]   = string1;
                }
                else {
                    tablica1[(i-1)] = string1;
                    tablica1[(i)]   = string2;
                }
            }
        }
        string1 = "";
        for (int i=0;i<tablica1.length;i++){
            string1 += tablica1[i] + (i==(tablica1.length-1) ? ";": ", ");
        }
        System.out.println("Tablica wynikowa: " + string1);
    }

    public void Tekst_Szyfruj() {
        String[][] tablica1 = {  {"30","0"},{"31","1"},{"32","2"},{"33","3"},{"34","4"},{"35","5"},{"36","6"},{"37","7"},{"38","8"},{"39","9"}
                                ,{"41","A"},{"42","B"},{"43","C"},{"44","D"},{"45","E"},{"46","F"},{"47","G"},{"48","H"},{"49","I"},{"4a","J"},{"4b","K"},{"4c","L"},{"4d","M"},{"4e","N"},{"4f","O"},{"50","P"},{"51","Q"},{"52","R"},{"53","S"},{"54","T"},{"55","U"},{"56","V"},{"57","W"},{"58","X"},{"59","Y"},{"5a","Z"}
                                ,{"61","a"},{"62","b"},{"63","c"},{"64","d"},{"65","e"},{"66","f"},{"67","g"},{"68","h"},{"69","i"},{"6a","j"},{"6b","k"},{"6c","l"},{"6d","m"},{"6e","n"},{"6f","o"},{"70","p"},{"71","q"},{"72","r"},{"73","s"},{"74","t"},{"75","u"},{"76","v"},{"77","w"},{"78","x"},{"79","y"},        
                            };
        String wynik = "";
        Scanner scanner = new Scanner(System.in);
                        
        //pobieranie danych od użytkownika
        System.out.print("Podaj hasło do zaszyfrowania:");
        String string1 = scanner.next();
        
        char arr[]=string1.toCharArray();
        for(int i=0;i<arr.length;i++){
            System.out.println("Data at ["+i+"]="+arr[i]);
            for(int j=0;j<tablica1.length;j++){
                //System.out.println("aaaa: "+tablica1[j][1].toString().substring(0,1));
                if (arr[i] == tablica1[j][1].substring(0,1).charAt(0))
                    wynik+=tablica1[j][0];
            }
        }
        System.out.println("Wynik: " + wynik);    
    }

    public void Tekst_PiecImion() {
        char[] alfabet = {  'A','Ą','B','C','Ć','D','E','Ę','F','G','H','I','J','K','L','Ł','M','N','Ń','O','Ó','P','R','S','Ś','T','U','W','Y','Z','Ź','Ż'
                            ,'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y' };
        String[] imiona = //new String[5]
                {"skwarek","marek","Weronika","Anetka","Ola"};
        String[] imionaZenskie = new String[5];
        String[] imionaMeskie  = new String[5];
        char[]   wczesniej, teraz;
        String   string1 = "";
        int w = 0,t = 0;
        String wynik = "";
        Scanner scanner = new Scanner(System.in);
        
        for(int i=0;i<imiona.length;i++){
            if (imiona[i].endsWith("a")){
                imionaZenskie[w] = imiona[i];
                w++;
            }
            else {
                imionaMeskie[t] = imiona[i];
                t++;
            }
        }

        for(int i=0;i<imiona.length;i++){
            if (i>0){

                //imionaZenskie
                if (imionaZenskie[(i)] !=  null)    {
                    wczesniej   = imionaZenskie[(i-1)].toCharArray();
                    teraz       = imionaZenskie[(i)  ].toCharArray();
                    int liczbaZnakowImion = wczesniej.length < teraz.length ?  wczesniej.length: teraz.length;
                    //imionaZenskie
                    w = t = -1;
                    for(int k =0; k<liczbaZnakowImion; k++){
                        for(int j=0; j<alfabet.length; j++){
                             //wez pierwsze litery i porównaj
                                if (wczesniej[k] == alfabet[j])     
                                    w = j;
                                if (teraz[k]     == alfabet[j])     
                                    t = j;
                        }
                        if (w>-1 || t>-1)
                            break;
                    }
                    //A ma indeks mniejszy niż B
                    if (t<w){
                        imionaZenskie[(i-1)] = String.valueOf(teraz);
                        imionaZenskie[(i  )] = String.valueOf(wczesniej);
                    }
                }

                //imionaMeskie
                if (imionaMeskie[(i)] !=  null)    {
                    wczesniej   = imionaMeskie[(i-1)].toCharArray();
                    teraz       = imionaMeskie[(i)  ].toCharArray();
                    int liczbaZnakowImion = wczesniej.length < teraz.length ?  wczesniej.length: teraz.length;
                    //imionaMeskie
                    w = t = -1;
                    for(int k =0; k<liczbaZnakowImion; k++){
                        for(int j=0; j<alfabet.length; j++){
                             //wez pierwsze litery i porównaj
                                if (wczesniej[k] == alfabet[j])     
                                    w = j;
                                if (teraz[k]     == alfabet[j])     
                                    t = j;
                        }
                        if (w>-1 || t>-1)
                            break;
                    }
                    //A ma indeks mniejszy niż B
                    if (t<w){
                        imionaMeskie[(i-1)] = String.valueOf(teraz);
                        imionaMeskie[(i  )] = String.valueOf(wczesniej);
                    }
                }
                
            }
        }

        wynik = "Imiona żeńskie to: ";
        for (String imie: imionaZenskie)
            if (imie != null)
                wynik += imie+", ";
                
        wynik = wynik.substring(0, wynik.length()-2);
        wynik += "; Imiona męskie to: ";
        for (String imie: imionaMeskie){
            if (imie != null)
                wynik += imie+", ";
        }
        wynik = wynik.substring(0, wynik.length()-2);
        System.out.println(wynik);    
    }

    public void Rzutowanie_KodASCII(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę do zamiany na kod ASCII: ");
        int liczba = scanner.nextInt();
        System.out.println("Kod ASCII: " + ((char)liczba));
    }
    
    public void Rzutowanie_TablicaASCII(){
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Podaj liczbę do zamiany na kod ASCII: ");
        //int liczba = scanner.nextInt();
        int liczba1,liczba2,liczba3,liczba4;
        System.out.println("Liczba | Kod ASCII || Liczba | Kod ASCII  || Liczba | Kod ASCII  || Liczba | Kod ASCII");
        for (int i=0;i<64;i++){
            liczba1 = i;
            liczba2 = 1*64+i;
            liczba3 = 2*64+i;
            liczba4 = 3*64+i;
            System.out.println("   "+liczba1+ " |  "+ (char)liczba1+" ||   "+liczba2+ " |  "+ (char)liczba2+" ||   "+liczba3+ " |  "+ (char)liczba3+" ||   "+liczba4+ " |  "+ (char)liczba4);
        }
    }

    public void Rzutowanie_SlownikMatematyczny(){
        Scanner scanner = new Scanner(System.in);
        String[][] tablica = {   {"0", "zero"}
                                ,{"1", "jeden"}
                                ,{"2", "dwa"}
                                ,{"3", "trzy"}
                                ,{"4", "cztery"}
                                ,{"5", "pięć"}
                                ,{"6", "sześć"}
                                ,{"7", "siedem"}
                                ,{"8", "osiem"}
                                ,{"9", "dziewięć"}
                                ,{"10","dziesięć"}
                                ,{"11","jedenaście"}
                                ,{"12","dwanaście"}
                                ,{"13","trzynaście"}
                                ,{"14","czternaście"}
                                ,{"15","piętnaście"}
                                ,{"16","szesnaście"}
                                ,{"17","siedemnaście"}
                                ,{"18","osiemnaście"}
                                ,{"19","dziewiętnaście"}
                                ,{"20","dwadzieścia"}
                                ,{"30","trzydzieści"}
                                ,{"40","czterdzieści"}
                                ,{"50","pięćdziesiąt"}
                                ,{"60","sześćdziesiąt"}
                                ,{"70","siedemdziesiąt"}
                                ,{"80","osiemdziesiąt"}
                                ,{"90","dziewsięćdziesiąt"}
                                ,{"100","sto"}
                                ,{"200","dwieście"}
                                ,{"300","trzysta"}
                                ,{"400","czterysta"}
                                ,{"500","pięćset"}
                                ,{"600","sześćset"}
                                ,{"700","siedemset"}
                                ,{"800","osiemset"}
                                ,{"900","dziewsięćset"}
                                ,{"100","sto"}
                                ,{"200","dwieście"}
                                ,{"300","trzysta"}
                                ,{"400","czterysta"}
                                ,{"500","pięćset"}
                                ,{"600","sześćset"}
                                ,{"700","siedemset"}
                                ,{"800","osiemset"}
                                ,{"900","dziewięćset"}
                                ,{"1000","tysiąc"}
                                ,{"2000","dwa tysiące"}
                                ,{"3000","trzy tysiące"}
                                ,{"4000","cztery tysiące"}
                                ,{"5000","pięć tysięcy"}
                                ,{"6000","sześć tysięcy"}
                                ,{"7000","siedem tysięcy"}
                                ,{"8000","osiem tysięcy"}
                                ,{"9000","dziewięć tysięcy"}
        };
        String wynik = "";
        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();
        int liczPomoc  = 0;
        String pomoc = "";
        
        for (int i = 0; i < 1000; i++) {
            if (((i>=0 && i<20) && i==liczba)){
                wynik = tablica[i][1];
                break;
            }
            else if (i>=20 && i<1000 && i==liczba) {
                if (i>=100){
                    //część setna np. z 189 -> 1
                    pomoc       = Integer.toString(i).substring(0,Integer.toString(i).length()-2) + "00";
                    liczPomoc   = Integer.parseInt(pomoc);
                    for (int j=27; j<tablica.length; j++) {
                        if (liczPomoc == Integer.parseInt(tablica[j][0])) {
                            wynik += " "+ tablica[j][1];
                            break;
                        }
                    }
                }
                //część dziesiętna np z 89 -> 8
                pomoc       = Integer.toString(i).substring(Integer.toString(i).length()-2,Integer.toString(i).length()-1) + "0";
                liczPomoc   = Integer.parseInt(pomoc);
                for (int j=20; j<tablica.length; j++) {
                    if (liczPomoc == Integer.parseInt(tablica[j][0])) {
                        wynik += " "+ tablica[j][1];
                        break;
                    }
                }
                //część jednostkowa np z 89 -> 9
                pomoc       = Integer.toString(i).substring(Integer.toString(i).length()-1,Integer.toString(i).length());
                liczPomoc   = Integer.parseInt(pomoc);
                for (int j=1; j<tablica.length; j++) {
                    if (liczPomoc == Integer.parseInt(tablica[j][0])) {
                        break;
                    }
                }
            }
        }
        if (liczba>=1000)
            wynik = "Oszukujesz...";
        System.out.println("Liczba słownie: " + wynik);
    }

    public void PrintF_HistoriaPrzelewow(){
        int[]    histWplat = new int[100];
        String[] histOpis  = new String[100];
        Date[]   histDat   = new Date[100];
        Scanner scanner    = new Scanner(System.in);
        Scanner scanOpis   = new Scanner(System.in);
        //pytanie o 100 elementów
        for (int j = 0; j < 100; j++) {
            System.out.printf("%d: Wybierz opcję:  1 - Pokaż historię;  2 - Dodaj transakcję;  3 - Wyjście.\n", j+1);
            int wynik = 0;
            int wybor = scanner.nextInt();
            if (wybor == 1){
                System.out.printf("Historia Przelewow:\n");
                for (int i=0;i<histWplat.length;i++){
                    //if (Integer.toString(histWplat[i]) != null) {  
                    if (histWplat[i] != 0) {  
                        System.out.printf("Numer: %d; Wpłata,Data,Opis: %d; %tF; %s\n", i+1, histWplat[i], histDat[i], histOpis[i]);
                    }
                }
                System.out.println("");
            }
            else if (wybor == 2){
                System.out.print("Podaj liczbę: ");
                int liczba  = scanner.nextInt();
                System.out.print("Podaj opis: ");
                String opis = scanOpis.next();
                Date data = new Date();
                for (int i=0;i<histWplat.length;i++){
                    if (histWplat[i] == 0){
                        histWplat[i] = liczba;
                        histDat[i]   = data;
                        histOpis[i]  = opis;
                        break;
                    }
                }
            }
            else 
                break;
        }
    }
    
    
    /* Napisz program, który pobiera od użytkownika dwie liczby, 
     * a następnie wypisuje ciąg cyfr od tej mniejszej do większej. 
     * Przykład: użytkownik podaje 11 i 16. Program wyświetla: 11, 12, 13, 14, 15, 16.
     */
    public void T31_CiagCyfr(){
        Scanner scanner    = new Scanner(System.in);
        System.out.printf("Wpisz pierwszą mniejszą a drugą większą liczbę:\n");
        int licz1 = scanner.nextInt();
        int licz2 = scanner.nextInt();
        int mala = licz1>licz2 ? licz2: licz1;
        int duza = licz1>licz2 ? licz1: licz2;
        String liczby = "";
        
        for (int i = mala; i < (duza+1); i++) {
            liczby += i+",";
        }
        System.out.printf("Liczby od mniejszej do większej: \n%s", liczby);
    }

    /*
     * Napisz program, ktory pobiera od użytkownika dwie liczby, a następnie sprawdza ich największy wspólny dzielnik (NWD). Algorytm możesz wymyślić sam lub znaleźć w internecie.
     */
    public void T31_NWD(){
        long a;
        long b;
        System.out.print("Podaj pierwszą liczbę: ");
        Scanner la = new Scanner(System.in);
        a = la.nextLong();
        System.out.print("Podaj drugą liczbę: ");
        Scanner lb = new Scanner(System.in);
        b = lb.nextLong();
        while (a != b) {
            if (a > b) {
                 a = a - b;
            } else {
                 b = b - a;
            }
        }
        System.out.println("NWD podanych liczb wynosi " + a);     
    }

    /*
     * Napisz program, który pobiera od użytkownika 10 imion, następnie wyświetla je w kolejności alfabetycznej.
     */
    public void T31_10Imion(){
        char[] alfabet = {  'A','Ą','a','B','b','C','Ć','c','D','d','E','Ę','e','F','f','G','g','H','h','I','i','J','j','K','k','L','l'
             ,'Ł','ł','M','m','N','Ń','n','O','Ó','o','P','p','q','R','r','S','Ś','s','T','t','U','u','v','W','w','x','Y','y','Z','Ź','Ż','z'};
        //String[] imiona = new String[10];
        String[] imiona = {"Anetka","Smerfetka","Viola","Mariola","Daria","Anielka"
                ,"Magda","Hermiona","Natalia","Ofelia"};
        char[] imie1, imie2;
        int poz1, poz2, dl, dl1, dl2 = 0;
        System.out.print("Podaj 10 imion: ");
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < 10; i++) {
//            imiona[i] = scanner.next();
//        }
//        scanner.close();
            
        for (int i = 0; i < 10; i++) {
            if (i>1){
                imie1 = imiona[i-1].toCharArray();
                imie2 = imiona[i].toCharArray();
                dl1 = imiona[i-1].length();
                dl2 = imiona[i].length();
                dl  =  dl1> dl2 ? dl1: dl2;
                poz1 = poz2 = 0;
                for (int j = 0; j <= dl; j++) {
                    for (int a = 0; a < alfabet.length; a++) {
                        //zabezpiezenie przed przekroczeniem zakresu
                        if (dl1<=dl) {
                            if (alfabet[a] == imie1[j])     poz1 = a;
                        }
                        if (dl2<=dl) {
                            if (alfabet[a] == imie2[j])     poz2 = a;
                        }
                    }
                    //zmień indeksy imion 
                    if (poz1>poz2){
                        String str1 = imiona[i-1];
                        String str2 = imiona[i];
                        imiona[i-1] = str2;                         
                        imiona[i]   = str1;                         
                    }
                }
            }
        }
        String wynik = "";
        for (String imie : imiona) {
            wynik += imie;
        }
        System.out.println("POsortowane imiona to: " + wynik);     
    }

    /*
     * Zrefaktoryzuj program z ćwiczenia trzeciego tak, aby w przypadku wystąpienia tego samego imienia poprosił użytkownika o inne.
     */

    
    /*
     * Średnie

    Znajdź w internecie trzy algorytmy szyfrujące dane i napisz program, który je wykorzystuje.
    Napisz program, ktory pobiera od użytkownika dwie liczby, a następnie wypisuje tabliczkę mnożenia opierając się na przedziale podanych wartości liczbowych. Przykład: użytkownik podaje 5 i 15 – program wyświetla tabliczkę mnożenia od 5 (5 x 1, 5 x 2, etc.) do 15.
    Napisz program, który pobiera od użytkownika cztery daty w formacie DD.MM.RRRR (dzień.miesiąc.rok), segreguje jest w kolejności rosnącej a następnie generuje dla każdej z nich pesel (ostatnie 5 cyfr dowolne)
    Napisz program, który daje użytkownikowi możliwość wyboru jednej z (co najmniej) pięciu figur geometrycznych, następnie pobiera od niego dane wyłącznie potrzebne do obliczenia pola i objętości. Ogranicz instrukcje warunkowe do minimum. Program ma wyświetlać wynik w przyjaznej dla człowieka formie – grupować cyfry, stosować przecinek jako separator dziesiętny.

Trudne

    Napisz program taki sam jak w ćwiczeniu 4 poziomu średniego z tą różnicą, że użytkownik nie musi stosować kropki jako separator dziesiętny, a może użyć przecinek.
    Napisz program, który pobiera od użytkownika pięć dat w formie DD.MM.YYYY, następnie segreguje je w kolejności rosnącej podając w nawiasie liczbę dni do dnia dzisiejszego.
    Stwórz program, który operuje na bardzo dużych liczbach skracając je. Przykład: gdy użytkownik podaje liczbę 12 643 324 – program wyświetla: “12M 643K 324″.
    Napisz konwerter liczb rzymskich na dziesiętne. Jeśli czujesz się na siłach: również z dziesiętnych na rzymskie.

     */
    
}
