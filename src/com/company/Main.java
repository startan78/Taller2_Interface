package com.company;

import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("escoga la base de datos" );
            System.out.println(" 1. oracle" );
            System.out.println(" 2. postgres" );
            System.out.println(" 3. Sql" );

            int seleccion = sc.nextInt();

            if(seleccion == 1 ){
                Oracle or = new Oracle();
            }
            else if(seleccion == 2 ){
                Oracle or = new Oracle();

            }
            else{
                Oracle or = new Oracle();

            }


        }
    }

