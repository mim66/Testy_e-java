/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testy03;

//import java.io.UnsupportedEncodingException;
//import java.net.URLDecoder;
//import java.net.URLEncoder;
import java.util.Iterator;
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
        
//        System.out.println("Proszę o podanie 5 imion - bez znaczenia, żeńskich czy męskich... ");
//        for(int i=0;i<5;i++){
//            //pobieranie danych od użytkownika
//            System.out.print("Podaj imię: ");
//            imiona[i] = scanner.next();
//        }
        
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
        int[] historia = new int[100];
        Scanner scanner = new Scanner(System.in);
        //pytanie o 100 elementów
        for (int j = 0; j < 100; j++) {
            System.out.println("Wybierz opcję: \n  1 - Pokaż historię\n  2 - Dodaj transakcję\n  3 - Wyjście.");
            int wynik = 0;
            int wybor = scanner.nextInt();
            if (wybor == 1){
                System.out.printf("Historia Przelewow:\n");
                for (int i=0;i<historia.length;i++){
                    //if (Integer.toString(historia[i]) != null) {  
                    if (historia[i] != 0) {  
                        System.out.printf("Numer: %d; Wpłata: %d;\n", i, historia[i]);
                    }
                }
            }
            else if (wybor == 2){
                System.out.print("Podaj liczbę: ");
                int liczba = scanner.nextInt();
                for (int i=0;i<historia.length;i++){
                    if (historia[i] == 0){
                        historia[i] = liczba;
                    }
                }

            }
        }
            
        
    }

}
