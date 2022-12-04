package main.java;

import java.io.File;
import java.util.Scanner;

public class Day1 {
    public static void main (String[] args){
        int elfCounter = 0;
        int elfWithMostCalories = 0;
        int sumHighest =0;
        boolean endOfFile = false;

        String filename = "day1.txt";

        try(Scanner sc = new Scanner(new File(filename));



        while(!endOfFile){
            int sum = 0;
            while (sc.hasNextInt()){
                sum+=sc.nextInt();
            }
            if (sum > sumHighest){
                elfWithMostCalories = elfCounter;
            }
            elfCounter++;

            if(!sc.hasNextLine()){
                endOfFile = true;
            }
        }

        System.out.println("The Elf with most calories is " + elfWithMostCalories);
    }

}
