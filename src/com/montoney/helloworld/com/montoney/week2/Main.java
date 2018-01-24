package com.montoney.helloworld.com.montoney.week2;
import java.util.*;


/**
 * Created by 029089 on 1/23/2018.
 */
public class Main {
    public static void main(String[] args) {


        Integer[] temp = {45, 29, 10, 22, 41, 28, 33};
        Integer[] precipitation = {95, 60, 25, 5, 0, 75, 90};
        String[] dayOfWeek = {"Sunday", " Monday", " Tuesday", " Wednesday", " Thursday", " Friday", "Satuday"};


        for (int i = 0; i < 6; i++)
        if (temp[i] <= 32 && precipitation[i] > 50) {
                System.out.println("Day of the week thats temp is lower than 32 and precipitation is higher than 50:" + dayOfWeek[i] +""+temp[i] +" " + precipitation[i]);
            }


        }
        }
