
package main;

import java.util.Scanner;

public class IntercambioVariables {

    public static void main(String[] args) {
        /*Programa que lee dos variables y luego intercambia el valor entre ellas
        
        */
        //--------------------------------------MÉTODO 1--------------------------------------//
       //5, 6 
        int a, b,A,B;
        Scanner numero=new Scanner(System.in);
        System.out.println("Intercabio de 2 variables");
        System.out.print("Ingrese numero a:");
        a=numero.nextInt();
        System.out.print("Ingrese numero b:");
        b=numero.nextInt();
        System.out.println("a: "+ a+ " b: "+ b);
        A=a;
        B=b;
        
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Nuevos valores intercambiados.");
        System.out.println("a: "+ a+ " b: " + b);
        
        //---------------------------------------Método 2-----------------------------------------------------+
        System.out.println("-------------------------Método 2--------------------");
       int aux1; //Se usa una variable auxiliar 
       System.out.println("a:"+ A+"  b:" + B);
       aux1=A;
       A=B;
       B=aux1;
       System.out.println("Nuevos Valores intercambiados.");
       System.out.println("A:"+ A +" B:" + B); 
       
       
        
       
        
        
        
    }
    
}
