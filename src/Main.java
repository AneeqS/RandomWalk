/*
* Aneeq Shah
* Physics 204 Project 1
* Random Walk 1-D
* */


import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int steps = 0; //The position in the one dimension.
        int max = steps; //This is the max step.
        int min = steps; //This is the min step.
        for (int i = 0 ; i < 10; i++) {
            //Either go up 1, go do down 1.
            steps = steps +  randomWalk();
            //Gets the maximum step.
            if (max < steps)
                max = steps;
            //Gets the minimum step.
            if (min > steps)
                min = steps;
            //Prints out the steps.
            System.out.println("Position " + i + " = " + steps);
        }
        //Prints the Maximum Step/Position.
        System.out.println("Max Position = " + max);
        //Prints the Minimum Step/Position.
        System.out.println("Min Position = " + min);
    }

    public static int randomWalk() {
        Random rnd = new Random();
        //random number 1 or 2
        int number = rnd.nextInt(2);
        if (number == 1) {
            //if number == 1 then decrease one step
            return -1;
        }
        //if number == 2 then increase one step
        return 1;
    }


}