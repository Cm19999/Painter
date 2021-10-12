package com.company;


public enum Paint {


    Aquamarine("Aquamarine",45.0),
    Ivory("Ivory",53.0),
    Burgundy("Burgundy",32.0);

    private String paintName;
    private double paintCost;

    Paint(String paintName, double paintCost){
        this.paintName=paintName;
        this.paintCost=paintCost;
    }

    public String getPaintName(){
        return this.paintName;
    }

    public double getPaintCost(){
        return this.paintCost;
    }


}
