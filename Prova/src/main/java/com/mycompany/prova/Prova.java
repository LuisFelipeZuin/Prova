package com.mycompany.prova;

import java.util.Scanner;

public class Prova {

    public static void main(String[] args) {
       
   Scanner sc = new Scanner(System.in);
        
     int a,b,c,d,e;
      int menor,maior;
        System.out.println("Digite o 1º número:");
        a = sc.nextInt();
        System.out.println("Digite o 2º número:");
        b = sc.nextInt();
        System.out.println("Digite o 3º número:");
        c = sc.nextInt();
        System.out.println("Digite o 4º número:");
        d = sc.nextInt();
        System.out.println("Digite o 5º número:");
        e = sc.nextInt();

if (a<b && a<c && a<d && a<e){
 menor = a;
}
else if (b<a && b<c && b<d && b<e){ 
 menor = b;
}
else if (c<a && c<b && c<d && c<e){ 
 menor = c;
}
else if (d<a && d<b && d<c && d<e){ 
 menor = d;
}
else{
 menor = e;
} 
        System.out.println("Menor:"+menor);    

if (a>b && a>c && a>d && a>e){
  maior = a;
}
else if (b>a && b>c && b>d && b>e){ 
 maior = b;
}
else if (c>a && c>b && c>d && c>e){ 
 maior = c;
}
else if (d>a && d>b && d>c && d>e){ 
 maior = d;
}
else{
  maior = e;
} 
        System.out.println("Maior:"+maior);








    }
}
