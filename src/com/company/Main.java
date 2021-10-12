package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        String hello= "Helloooo";
        Scanner myObj = new Scanner(System.in);
        System.out.println("What type of paint do you want? Out of: ");
        for (Paint paints : Paint.values()) {
            System.out.println(paints);
        }
        String paintName = myObj.nextLine();

        System.out.println("Do you know how many tins you need?(Y or N)");
        String answer = myObj.nextLine();

        switch (answer) {
            case "Y" -> costCalculatorTins(paintName);
            case "N" -> costCalculatorArea(paintName);
        }

    }
    public static void costCalculatorTins(String paintName){
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("How many tins of paint do you need?");
        int litres = Integer.parseInt(myObj2.nextLine());

        Paint paint = Paint.valueOf(paintName);
        double paintCost = paint.getPaintCost();
        System.out.println("The cost will be £" + paintCost*litres);

    }
    public static void costCalculatorArea(String paintName){
        Scanner myObj3 = new Scanner(System.in);
        System.out.println("What area do you need to be painted?");
        double area = Double.parseDouble(myObj3.nextLine());

        double areaPerLitre = 2.5;
        Paint paint = Paint.valueOf(paintName);
        double paintCost = paint.getPaintCost();
        int amountOfTins = (int) Math.ceil(area/areaPerLitre);
        System.out.println("The cost will be £" + paintCost*amountOfTins);

    }
}
