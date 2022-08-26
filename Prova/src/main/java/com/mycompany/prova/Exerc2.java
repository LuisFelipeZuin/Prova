package com.mycompany.prova;

import java.util.Scanner;

public class Exerc2 {

    
    public static void main(String[] args) {
       
 Scanner sc = new Scanner(System.in);
        
        
  double salario=1000,a= 0.015;
  double atual=0;
  
 
   for(int i=1; i<=25; i++){
    a = a*2;
   atual = salario+(salario*a);
    }

    System.out.println("O salário atual é R$ "+ atual);


    }
    
}

