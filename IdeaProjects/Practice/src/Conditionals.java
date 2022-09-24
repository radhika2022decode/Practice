package com.company;

import java.util.*;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch(button){
            case 1 :
                System.out.println("hello");
                break;

            case 2 :
                System.out.println("Namste");
                break;

            case 3 :
                System.out.println("Bonjour");
                break;

            default :
                System.out.println("invalid");
        }

//
//        if(button==1){
//            System.out.println("Hello");
//        }
//        else if(button==2){
//            System.out.println("Namaste");
//        }
//        else if(button==3){
//            System.out.println("Bonjour");
//        }
//        else{
//            System.out.println("Invalid Button");
//        }
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        if(a==b){
//            System.out.println("Equal");
//        }
//        else if(a>b){
//              System.out.println("a is greater");
//          }
//        else{
//              System.out.println("a is smaller");
//          }

    }
}
