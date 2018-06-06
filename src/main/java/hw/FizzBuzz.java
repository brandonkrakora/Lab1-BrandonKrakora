package hw;

public class FizzBuzz {
    public static void fizzbuzz (int n) {
        int i = 1;
        while (i <= n) {
            if (((i % 3) == 0) && ((i%5) == 0)) {
                System.out.println("fizz buzz");
            } else if ((i % 5) == 0) {
                System.out.println("buzz");
            } else if ((i%3) == 0) {
                System.out.println("fizz ");
            } else {
                System.out.println(i);
            }
            i++;
        }
    }
}
