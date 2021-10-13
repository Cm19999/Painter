package com.company;


public enum Paint {


    Aquamarine("Aquamarine",45.0,1.0),
    Ivory("Ivory",53.0,0.75),
    Burgundy("Burgundy",32.0,0.5);

    private String paintName;
    private double paintCost;
    private double tinSize;

    Paint(String paintName, double paintCost,double tinSize){
        this.paintName=paintName;
        this.paintCost=paintCost;
        this.tinSize=tinSize;
    }

    public String getPaintName(){
        return this.paintName;
    }

    public double getPaintCost(){
        return this.paintCost;
    }

    public double getTinSize(){
        return this.tinSize;
    }
}
