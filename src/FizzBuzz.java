/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {
    public static void main(String[] args) {  //Main Compiler Code

        /*
        for (int i = 1; i < 100; i++) { //For loop

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0; //Boolean datatype for True or False
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) { //If statements including brackets

                System.out.println("Fizz Buzz"); //Printing out text

            } else if (divisibleBy3) { //elif in Python

                System.out.println("Fizz");

            } else if (divisibleBy5) {

                System.out.println("Buzz");

            } else {

                System.out.println(i);

            }
        }
        */

        int i = 1;
        while (i < 100){
            i = doFizzBuzz(i);
        }
    }

    private static int doFizzBuzz(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        if (divisibleBy3 && divisibleBy5){
            System.out.println("Fizz Buzz");
        }

        else if (divisibleBy3){
            System.out.println("Fizz");
        }

        else if (divisibleBy5){
            System.out.println("Buzz");
        }

        else{
            System.out.println(i);
        }

        i++;
        return i;
    }
}
