package com.mycompany.prova;

import java.util.Scanner;

public class Exerc3 {

    
    public static void main(String[] args) {
       
   Scanner v = new Scanner(System.in);
   
   float mI,tH=0,tM=0,tS=0;
   float mF;
   float tempo = 0;
   
     System.out.println("Informe a massa em gramas do elemento:");
     mI = v.nextFloat();
      
     mF = mI;
      while (mF>0.5){
       mF = mF/2;   
       tempo += 50;
     
     tH = (tempo / 3600);
     tM  = (tempo % 3600) / 60;
     tS  = (tempo % 3600) % 60;
      
      
      }

     System.out.println("Massa inicial: "+mI+"g");
     System.out.println("Massa final: "+mF+"g");
     System.out.println("O tempo gasto é: "+tH+" H; "+ tM+" M; "+ tS +" S ");
    }
    
}

