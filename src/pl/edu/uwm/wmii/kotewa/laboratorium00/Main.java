package pl.edu.uwm.wmii.kotewa.laboratorium00;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
// Zadanie 1
// A)
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Podaj ilość liczb: ");
//        int x = scan.nextInt();
//        int y;
//        for(int i =1;i <= x;i++){
//            System.out.print("\nPodaj "+i+" liczbe: ");
//            y = scan.nextInt();
//            wynik+=y;
//        }
//        System.out.print("Wynik dodawania to: "+wynik);
//    }
//}
// B)
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Podaj ilość liczb: ");
//        int x = scan.nextInt();
//        int y;
//        System.out.print("\nPodaj 1 liczbe: ");
//        wynik = scan.nextInt();
//        for(int i =2;i <= x;i++){
//            System.out.print("\nPodaj "+i+" liczbe: ");
//            y = scan.nextInt();
//            wynik*=y;
//        }
//        System.out.print("Wynik mnożenia to: "+wynik);
//    }
//}
// C)
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Podaj ilość liczb: ");
//        int x = scan.nextInt();
//        int y;
//        for(int i =1;i <= x;i++){
//            System.out.print("\nPodaj "+i+" liczbe: ");
//            y = scan.nextInt();
//            wynik+=abs(y);
//        }
//        System.out.print("Wynik dodawania to: "+wynik);
//    }
//}
// D)
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        double wynik = 0;
//        System.out.print("Wpisz n: ");
//        int x = scan.nextInt();
//        double y;
//        for(int i =1;i <= x;i++){
//            System.out.print("\nPodaj "+i+" liczbe: ");
//            y = sqrt(abs(scan.nextInt()));
//            wynik+=y;
//        }
//        System.out.print("Wynik dodawania to: "+wynik);
//    }
//}
// E)
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Podaj ilość liczb: ");
//        int x = scan.nextInt();
//        int y;
//        System.out.print("\nPodaj 1 liczbe: ");
//        wynik = abs(scan.nextInt());
//        for(int i =2;i <= x;i++){
//            System.out.print("\nPodaj "+i+" liczbe: ");
//            y = scan.nextInt();
//            wynik*=abs(y);
//        }
//        System.out.print("Wynik mnożenia to: "+wynik);
//    }
//}
// F)
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Podaj ilość liczb: ");
//        int x = scan.nextInt();
//        int y;
//        for(int i =1;i <= x;i++){
//            System.out.print("\nPodaj "+i+" liczbe: ");
//            y = scan.nextInt();
//            wynik+=pow(y,2);
//        }
//        System.out.print("Wynik mnożenia to: "+wynik);
//    }
//}
// G)
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik1 = 0;
//        int wynik2 = 0;
//        System.out.print("Podaj ilość liczb: ");
//        int x = scan.nextInt();
//        int y;
//        System.out.print("\nPodaj 1 liczbe: ");
//        y = scan.nextInt();
//        wynik1+=y;
//        wynik2+=y;
//        for(int i =2;i <= x;i++){
//            System.out.print("\nPodaj "+i+" liczbe: ");
//            y = scan.nextInt();
//            wynik1+=y;
//            wynik2*=y;
//        }
//        System.out.print("Wynik dodawania to: "+wynik1+", a wynik mnożenia to: "+wynik2);
//    }
//}
// H)
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Podaj ilość liczb: ");
//        int x = scan.nextInt();
//        int y;
//        for(int i =1;i <= x;i++){
//            System.out.print("\nPodaj "+i+" liczbe: ");
//            y = scan.nextInt();
//            if(i%2==0)wynik-=y;
//            else wynik+=y;
//        }
//        System.out.print("Wynik dodawania to: "+wynik);
//    }
//}
// I)
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Podaj ilość liczb: ");
//        int x = scan.nextInt();
//        int y;
//        int silnia = 1;
//        for(int i =1;i <= x;i++){
//            silnia*=i;
//            System.out.print("\nPodaj "+i+" liczbe: ");
//            y = scan.nextInt();
//            if(i%2==0)wynik+=y/silnia;
//            else wynik-=y/silnia;
//        }
//        System.out.print("Wynik dodawania to: "+wynik);
//    }
//}
// Zad 2
//public class Main {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Podaj ilość liczb: ");
//        int x = scan.nextInt();
//        int y;
//        int tab[] = new int[x];
//        for(int i =0;i < x;i++){
//            System.out.print("\nPodaj "+(i+1)+" liczbe: ");
//            y = scan.nextInt();
//            tab[i]=y;
//        }
//        for(int i = 1;i<x;i++){
//            System.out.print(tab[i]+"\n");
//        }
//        System.out.print(tab[0]);
//    }
//}

//  2 Połączenie instrukcji iteracyjnej i warunkowej
//  Zadanie 1
//  a)
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        int niep = 0;
//        System.out.print("Podaj n: ");
//        int a = scan.nextInt();
//        int b;
//        for(int i =1;i <= a;i++)
//        {
//            System.out.print("\nPodaj "+i+" liczbe: ");
//            b = scan.nextInt();
//            if(b%2!=0)
//            {
//                niep+=1;
//            }
//
//        }
//        System.out.print("Ilość liczb nieparzystych to: "+niep);
//    }
//}
//  b)
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        int liczby = 0;
//        System.out.print("Podaj n: ");
//        int a = scan.nextInt();
//        int b;
//        for(int i =1;i <= a;i++)
//        {
//            System.out.print("\nPodaj "+i+" liczbe: ");
//            b = scan.nextInt();
//            if(b%3==0&b%5!=0)
//            {
//                liczby+=1;
//            }
//
//        }
//        System.out.print("Ilość liczb podzielnych przez 3 i niepodzielnych przez 5 to: "+liczby);
//    }
//}


// c)
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        int kw = 0;
//        System.out.print("Podaj n: ");
//        int a = scan.nextInt();
//        int b;
//        for(int i =1;i <= a;i++)
//        {
//            System.out.print("\nPodaj "+i+" liczbe: ");
//            b = scan.nextInt();
//
//            for(int j=0;j<=b;j++)
//            {
//                if(j*j==b&j%2==0)
//                {
//                    kw+=1;
//
//                }
//
//            }
//
//
//        }
//        System.out.print("Ilość liczb będących kwadratami liczby parzystej to: "+kw);
//    }
//}


// f)
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Podaj n: ");
//        int a = scan.nextInt();
//        int b;
//        int num=0;
//        for(int i =1;i <= a;i++)
//        {
//            System.out.print("\nPodaj "+i+" liczbe: ");
//            b = scan.nextInt();
//            num+=1;
//            if(b%2==0&num%2!=0)
//            {
//                wynik+=1;
//
//            }
//
//        }
//        System.out.print("Ilość liczb o nieparzystym numerze, które są parzyste to: "+wynik);
//    }
//}


// g)
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        int wynik = 0;
//        System.out.print("Podaj n: ");
//        int a = scan.nextInt();
//        int b;
//        for(int i =1;i <= a;i++)
//        {
//            System.out.print("\nPodaj "+i+" liczbe: ");
//            b = scan.nextInt();
//            if(b%2!=0&b>0)
//            {
//                wynik+=1;
//            }
//
//        }
//        System.out.print("Ilość liczb nieparzystych i jednocześnie nieujemnych to: "+wynik);
//    }
//}


// Zadanie 2
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        int suma = 0;
//        System.out.print("Podaj n: ");
//        int a = scan.nextInt();
//        int b;
//        for(int i =1;i <= a;i++)
//        {
//            System.out.print("\nPodaj "+i+" liczbe: ");
//            b = scan.nextInt();
//            if(b>0)
//            {
//                suma+=b;
//            }
//
//        }
//        suma=suma*2;
//        System.out.print("Podwojona suma podanych liczb nieujemnych wynosi: "+suma);
//    }
//}
// Zadanie 3
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        int dod = 0;
//        int uj = 0;
//        int zero = 0;
//        System.out.print("Podaj n: ");
//        int a = scan.nextInt();
//        int b;
//        for(int i =1;i <= a;i++)
//        {
//            System.out.print("\nPodaj "+i+" liczbe: ");
//            b = scan.nextInt();
//            if(b>0)
//            {
//                dod+=1;
//            }
//            else if(b<0)
//            {
//                uj+=1;
//            }
//            else
//            {
//                zero+=1;
//            }
//
//        }
//
//        System.out.print("\nIlość liczb dodatnich: "+dod);
//        System.out.print("\nIlość liczb ujemnych: "+uj);
//        System.out.print("\nIlość zer: "+zero);
//    }
//}

// Zadanie 4
//public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        int max=0;
//        int min=0;
//        System.out.print("Podaj n: ");
//        int a = scan.nextInt();
//        int b;
//        for(int i =1;i <= a;i++)
//        {
//
//            System.out.print("\nPodaj "+i+" liczbe: ");
//            b = scan.nextInt();
//
//            if(i==1)
//            {
//                max=b;
//                min=b;
//            }
//            if(b>max)
//            {
//               max=b;
//            }
//
//            if(b<min)
//            {
//                min=b;
//            }
//        }
//
//        System.out.print("\nNajwiększa liczba z podanych to: "+max);
//        System.out.print("\nNajmniejsza liczba z podanych to: "+min);
//    }
//}
//

// Zadanie 5
// public class Main {
//
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        int wynik=0;
//        System.out.print("Podaj n: ");
//        int a = scan.nextInt();
//        int b;
//        int tab[]= new int[a];
//        for(int i =0;i < a;i++)
//        {
//
//            System.out.print("\nPodaj "+(i+1)+" liczbe: ");
//            b = scan.nextInt();
//            tab[i]=b;
//
//            if(i>0)
//            {
//                if(tab[i-1]>0&tab[i]>0)
//                {
//                    wynik+=1;
//                }
//            }
//
//
//System.out.print("\n"+tab[i]);
//System.out.print("\n"+i);
//
//
//
//        }
//System.out.print("Liczba istniejących par o podanych kryteriach to:  "+wynik);
//
//    }
//}