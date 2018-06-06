package hw;
import java.util.*;

public class FizzBuzz {
//    public static void fizzbuzz (int n) {
//        int i = 1;
//        while (i <= n) {
//            if (((i % 3) == 0) && ((i%5) == 0)) {
//                System.out.println("fizz buzz");
//            } else if ((i % 5) == 0) {
//                System.out.println("buzz");
//            } else if ((i%3) == 0) {
//                System.out.println("fizz ");
//            } else {
//                System.out.println(i);
//            }
//            i++;
//        }
//    }

    public static String[] fizzbuzz(int n) {
        String[] fizzBuzzArray;
        int i = 1;
        if (n <= -1){
            fizzBuzzArray = new String[1];
            fizzBuzzArray[0] = "Please enter a posive integer";
        }
        else{
            fizzBuzzArray = new String[n];
        }
        while (i <= n) {
            if (((i % 3) == 0) && ((i%5) == 0)) {
                fizzBuzzArray[i-1] = "fizzbuzz";
            } else if ((i % 5) == 0) {
                fizzBuzzArray[i-1] = "buzz";
            } else if ((i%3) == 0) {
                fizzBuzzArray[i-1] = "fizz";
            } else {
                fizzBuzzArray[i-1] = Integer.toString(i);
            }
            i++;
        }
        return fizzBuzzArray;
    }

    public static List<String> fizzbuzzlist(int n) {
        List<String> fizzBuzzList = new ArrayList<>();
        int i = 1;

        while (i <= n) {
            if (((i % 3) == 0) && ((i%5) == 0)) {
                fizzBuzzList.add("fizz buzz");
            } else if ((i % 5) == 0) {
                fizzBuzzList.add("buzz");
            } else if ((i%3) == 0) {
                fizzBuzzList.add("fizz");
            } else {
                fizzBuzzList.add(Integer.toString(i));
            }
            i++;
        }
        return fizzBuzzList;
    }
}
