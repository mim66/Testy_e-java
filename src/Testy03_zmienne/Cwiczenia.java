/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Testy03_zmienne;

/**
 *
 * @author musialm
 */
public class Cwiczenia {
      public static void main(String[] args) {     
          int a = 3;
          int b = 4;
          int c = 2;
          String wynik = "0";
          System.out.println("a,b,c: "+a+","+b+","+c+"\n");

          System.out.println("Parzystość:");
          System.out.println(" Liczba a: "+((a%2)==0));
          System.out.println(" Liczba b: "+((b%2)==0));
          
          System.out.println("\nKolejność:");
          if (a>b){
                if (b>c)        
                    wynik = "abc: "+a+","+b+","+c;
                else if (c>a)   
                    wynik = "cab: "+c+","+a+","+b;
          }
          else if (a>c) {
                if (c>b)        wynik = "acb: "+a+","+c+","+b;
                else if (b>a)   wynik = "bac: "+b+","+a+","+c;
          }
          else if (b>a && c>b)  wynik = "cba: "+c+","+b+","+a;
          else if (c>a && b>c)  wynik = "bca: "+b+","+c+","+a;
          System.out.println("wynik: "+ wynik);
            //  abc     a>b	b>c
            //  cab     a>b	c>a
            //  acb     a>c	c>b
            //  bac     a>c	b>a
            //  cba     b>a	c>b
            //  bca     c>a	b>c
          
          
          int i=10;
          int j=0;;
          int granica = 0;
//            while (i>granica){
//                System.out.println(i);
//                i--;
//            }
            i = 0;
            granica=100;
          while (i<granica){
              if ((i%2)==0){
                System.out.print(i);
                System.out.print(";");
              }
              i++;
          }
          
          System.out.println("\nTabliczka mnożenia:");
          i=1;
          j=2;
          granica=11;
          while(i<granica){
              while(j<granica){
                  System.out.println(""+i+"*"+j+"="+(i*j));
                  j++;
              }
              j=1;
              i++;
          }

        granica= 5;            
        i = j = 0;            
        while (i < granica) {                
            while (j < granica) {                    
                if (i==0 || i == (granica-1) || j==0 || j==(granica-1) )
                    System.out.print("*");
                else 
                    System.out.print(" ");
                j++;                
            }                
            System.out.println();                
            j = 0;                
            i++;            
        }        

      
      }

}
