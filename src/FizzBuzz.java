/**
 * Solve the FizzBuzz challenge.
 */
//setting up class FizzBuzz
class FizzBuzz {

    public static void main(String[] args) {
        //create index
        int  i = 1;
        //while loop that starts at 1 and increments by 1 until 100
        while (i <= 100) {

            // Find out which numbers divide i.
            i = doFizzBuzz(i);
            }
    }

    public static int doFizzBuzz(int i) {
        boolean divisibleBy3 = i % 3 == 0; //when initialsing a variable you add its type [name] = ...
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) { // add curly brackets at the end of any if/for/while

            System.out.println("Fizz Buzz"); // you usually shouldn't print stuff out

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
        i++;
        return i;
    }
}
