package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

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
        double totalArea = 0.0;
        System.out.println("Do you know the total area of the walls? (Y or N)");
        String wallKnowledge =myObj3.nextLine();

        double area =0.0;
        if (wallKnowledge =="Y"){
        area = Double.parseDouble(myObj3.nextLine());
        }
        else{
            boolean unknownWalls = true ;
            while (unknownWalls) {
                System.out.println("What is the area of the current wall?");
                totalArea += Double.parseDouble(myObj3.nextLine());

                System.out.println("Is that all of the walls?(Y or N)");
                String wallsAnswer=myObj3.nextLine();
                if (wallsAnswer.equals("Y")){
                    unknownWalls = false;
                    area = totalArea;
                    continue;
                }
            }
        }


        double areaPerLitre = 2.5;
        Paint paint = Paint.valueOf(paintName);
        double paintCost = paint.getPaintCost();
        int amountOfTins = (int) Math.ceil(area/areaPerLitre);
        System.out.println("The cost will be £" + paintCost*amountOfTins);

    }

}
