package com.montoney.helloworl.practice;

/**
 * Created by 029089 on 2/1/2018.
 */
public class Main {
    public class methods {

        public static void main(String[] args) {
            helloworld();
            helloName("Ren and Stempy");
            addTwoNumbers();
            //int sum = add(1,2,3);
            System.out.println(add(1,2,3));
        }


        static void helloworld(){

            System.out.println("helloworld");



        }

        static void helloName(String name){
            System.out.println( "Hello," + name);


        }

    static void addTwoNumbers(){
            int num1 = 5;
            int num2 = 7;
            System.out.println( num1 + num2

            );


    }

static int add(int one, int two, int three){
        int sum = one + two + three;

        return sum;
}
    }





}
