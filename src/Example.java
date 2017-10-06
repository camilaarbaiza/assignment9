/*
   @author Camila Arbaiza

   CSC 201-004N

   Professor Tanes Kanchanawanchai

   Assignment 9 problem 9.11

   */


import java.util.Scanner;

public class Example {

    public static void main (String []args){


        double [] values = new double[6];            //array where the values of a, b, c, d, e, and f will be stored
        Scanner input = new Scanner(System.in);      //Scanner

        System.out.println("2X2 system of linear equation");
        System.out.println("\tax + by = e");
        System.out.println("\tcx + dy = f");

        System.out.println("Enter values for a, b, c, d, e, and f in that order: ");

        //fill in the values array
        for(int i = 0; i < values.length; i++){

            values[i] = input.nextDouble();

        }

        //create object of the LinearEquation class and call constructor
        LinearEquation e1 = new LinearEquation(values[0], values[1], values[2], values[3], values[4], values[5]);

        // call the isSolvable method to check if the problem has a solution
        boolean problemIsSolvable = e1.isSolvable();

        if(problemIsSolvable == true){
            //display results
            System.out.println("\tResults");
            System.out.println("x = " + e1.getX() + " and y = " + e1.getY());

        }else{
            System.out.println("The equation has no solution because ad - bc = 0");
        }
    }//end main
}//end Example class
