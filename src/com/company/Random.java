package com.company;

/**
 * Created by zr162 on 10/10/16.
 */

public class Random {

    public String name;

    public int randSQ;

    public Random(String name)
    {
        this.name=name;




    }

    public int perfectRandom()
    {

            randSQ = (int)Math.pow(((int)(Math.random()*100)),2);
        //I used a double value to stor the square root and check that this section worked properly


        return randSQ;
    }





}
