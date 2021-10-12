package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("What type of paint do you want? Out of: ");
        for (Paint paints : Paint.values()) {
            System.out.println(paints);
        }
        String paintName = myObj.nextLine();

        Scanner myObj2 = new Scanner(System.in);
        System.out.println("How many tins of paint do you need?");
        int litres = Integer.parseInt(myObj2.nextLine());

        costCalculator(litres,paintName);
    }
    public static void costCalculator(int litres,String paintName){

        Paint paint = Paint.valueOf(paintName);
        double paintCost = paint.getPaintCost();
        System.out.println("The cost will be £" + paintCost*litres);

    }
}
