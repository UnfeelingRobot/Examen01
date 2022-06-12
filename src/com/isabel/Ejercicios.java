package com.isabel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicios {
    static Scanner x= new Scanner(System.in);

    static void Exercise1(){
        System.out.println("♦*♦*♦*♦*♦*♦");
        System.out.println("TU HABILIDAD");
        System.out.println("♦*♦*♦*♦*♦*♦");
        System.out.println("Escribe tu nombre");
        String nombre=x.nextLine();
        System.out.println("¿Cuál es tu habilidad?");
        String hab=x.nextLine();
        System.out.println(nombre+" es "+hab);
    }

    static void Exercise2(){
        System.out.println("♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*");
        System.out.println("SEGUNDA POTENCIA DE UN NÚMERO");
        System.out.println("♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*");
        System.out.println("Escriba un número entero");
        int num=x.nextInt();
        System.out.println("La segunda potencia de "+num+ " es "+Math.pow(num,2));

    }

    static void Exercise3(){
        System.out.println("♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*");
        System.out.println("ÁREA Y PERÍMETRO DE UN CÍRCULO");
        System.out.println("♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*");
        System.out.println("Escribe el radio de un círculo");
        double r=x.nextDouble();
        System.out.println("El perímetro del círculo es "+Math.round(Math.PI*2*r*100.0)/100.0+"\nEl área del círculo es "+Math.round(Math.PI*Math.pow(r,2)*100.0)/100.0);
    }
    static void Exercise4(){
        System.out.println("♦*♦*♦*♦*♦*♦*");
        System.out.println("AUTOMÓVILES");
        System.out.println("♦*♦*♦*♦*♦*♦*");
        List<Automovil> autos=new ArrayList<>();
        Automovil auto1 = new Automovil("Toyota","2019","Agya",24,"rojo");
        Automovil auto2 = new Automovil("Hyundai","2019","Hatchback",24,"verde");
        Automovil auto3 = new Automovil("Kia","2019","Rio Sedan",24,"azul");
        autos.add(auto1);
        autos.add(auto2);
        autos.add(auto3);
        System.out.println(autos);
    }

    static void Exercise5(){
        System.out.println("♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*");
        System.out.println("EL NÚMERO ES PAR O IMPAR");
        System.out.println("♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*");
        System.out.println( "Introduzca un número entero");
        int num = x.nextInt();

        if ( num % 2 == 0 ) {
            System.out.println("El número "+num+" es par");
        }else{
            System.out.println( "El número " +num+" es impar" );
        }
    }

    static void Exercise6(){
        System.out.println("♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*");
        System.out.println("MULTIPLICACIÓN DE 2 NÚMEROS DECIMALES");
        System.out.println("♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*♦*");
        double num1=0, num2=0;
        System.out.println("Ingresa un número decimal");
        num1=x.nextDouble();
        while (num1%1==0){
            System.out.println("Por favor, ingresa un número decimal");
            num1=x.nextDouble();
        }
        System.out.println("Ingresa otro número decimal");
        num2=x.nextDouble();
        while (num2%1==0){
            System.out.println("Por favor, ingresa otro número decimal");
            num2=x.nextDouble();
        }
        System.out.println("La multiplicación de "+num1+" por "+num2+" es "+Math.round(num1*num2*100.0)/100.0);
    }

}
