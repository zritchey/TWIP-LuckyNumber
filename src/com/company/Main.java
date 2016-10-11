package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        String list= "\n\nName and Lucky Number:\n\n";
        int delta= 2;
        while(delta>0) {
            System.out.println("what is your name?");
            Scanner kb = new Scanner(System.in);
            String name = kb.nextLine();
            Random rand1 = new Random(name);
            int squareFind = rand1.getRandSQ();
            while (rand1.name.trim().length()==0){
                System.out.print("Please enter your name: ");
                rand1.name=kb.nextLine();
            }
            System.out.println("Nice to meet you " + rand1.name.substring(0,1).toUpperCase()+rand1.name.substring(1).toLowerCase() + "! Your lucky number is " + squareFind + ".");
            int j = 53;
            int length = rand1.name.length();
            int forCount = j - length;

            list =list+ rand1.name+" ";
            int b = 0;
            for (b = forCount; b >= 3; b--) {
                list = list + "-";

            }
            list = list + "-\t" + squareFind+"\n";
            int trial = 1;
            while (trial == 1) {
                System.out.println("Your options are now as follows:\n 0-Exit\n 1- view a listing of previous lucky numbers\n 2-Play again");
                String real = kb.nextLine();


                    if ((real.equals("0"))||(real.equals("2"))) {
                        trial = 0;
                        delta = Integer.parseInt(real);

                    }
                    else if (real.equals("1"))
                    {
                        System.out.println(list);
                }
            }

        }
    }
}
