package main.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Day1 {

    public static void main(String... args) throws URISyntaxException {
        int elfCounter = 0;
        int elfWithMostCalories = 0, elfWithSecondMostCalories=0, elfWithThirdMostCalories=0;
        int sumHighest =0, sumSecondHighest=0, sumThirdHighest=0;
        boolean endOfFile = false;

        String filename = "day1.txt";
        File file = new File(Day1.class.getClassLoader().getResource("day1.txt").toURI());

        try(Scanner sc = new Scanner(file)) {

            while (!endOfFile) {
                int sum = 0;
                String line = sc.nextLine();

                while(line!= ""){
                    sum+=Integer.parseInt(line);
                    if(!sc.hasNextLine()) {
                        endOfFile=true;
                    }
                    else
                        line=sc.nextLine();
                }

                elfCounter++;
                if (sum > sumHighest) {
                    elfWithThirdMostCalories = elfWithSecondMostCalories;
                    sumThirdHighest = sumSecondHighest;
                    elfWithSecondMostCalories = elfWithMostCalories;
                    sumSecondHighest = sumHighest;
                    elfWithMostCalories = elfCounter;
                    sumHighest=sum;
                }


                if(sumHighest > sum  && sum > sumSecondHighest){
                    elfWithSecondMostCalories = elfCounter;
                    sumSecondHighest = sum;
                }

                if(sumSecondHighest > sum && sumHighest > sum && sumThirdHighest < sum){
                    elfWithThirdMostCalories = elfCounter;
                    sumThirdHighest = sum;
                }

            }
        } catch (FileNotFoundException fnf){
            System.out.println("Hittar inte filen");
        }
        catch (NoSuchElementException nse){
            endOfFile=true;
            System.out.println("Hela filen är nu läst.");
        }

        System.out.println("The Elf with most calories is " + elfWithMostCalories + ". That Elf has " + sumHighest + " number of calories.");
        System.out.println("The Elf with 2nd most calories is " + elfWithSecondMostCalories + ". That Elf has " + sumSecondHighest + " number of calories.");
        System.out.println("The Elf with 3rd most calories is " + elfWithThirdMostCalories + ". That Elf has " + sumThirdHighest + " number of calories.");
        System.out.println("Total calories = " + (sumHighest+sumSecondHighest+sumThirdHighest));

        System.out.println("Total number of Elfs: " + elfCounter);
    }
}