package hw;
import java.util.Scanner;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        // FizzBuzz.invokeFizzBuzz(Integer.parseInt(args[0]));
        String[] returnFizzBuzzArray = fb.fizzbuzz(Integer.parseInt(args[0]));
        for (int i = 0; i < returnFizzBuzzArray.length; i++) {
            System.out.println(returnFizzBuzzArray[i]);
        }
    }
}


