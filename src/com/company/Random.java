package com.company;

/**
 * Created by zr162 on 10/10/16.
 */

public class Random {

    public String name;
    public boolean sq;
    public double randSQ;
    public double root;

    public Random(String name)
    {
        this.name=name;
        sq=false;



    }

    public double getRandSQ()
    {
        while (sq) {
            randSQ = Math.random()*10800000;
            root=Math.sqrt(randSQ);
            if (root==(int)root){
                sq=true;
            }

        }

        return randSQ;
    }





}
