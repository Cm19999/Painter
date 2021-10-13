package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        int count = 0;
        double[][] costs= new double[3][3];

        Scanner myObj = new Scanner(System.in);
        System.out.println("What type of paint do you want? Out of: ");
        for (Paint paints : Paint.values()) {
            System.out.print(paints);
            costs[count][1]=paints.getPaintCost();
            System.out.print(" Cost per litre £"+ paints.getPaintCost()+" ");
            costs[count][2]=paints.getTinSize();
            System.out.print(" Tin size "+ paints.getTinSize());
            ++count;
            System.out.println();
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
        double litres = Integer.parseInt(myObj2.nextLine());

        Paint paint = Paint.valueOf(paintName);
        double paintCost = paint.getPaintCost();
        double tinSize = paint.getTinSize();
        System.out.println("The cost will be £" + paintCost*(litres/tinSize));

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
        double tinSize = paint.getTinSize();
        int amountOfTins = (int) Math.ceil((area/tinSize)/areaPerLitre);
        System.out.println("The cost will be £" + paintCost*amountOfTins);

    }

}
