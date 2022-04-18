package Day2Practice;

public class ReverseWhileLoop {
    public static void main(String[] args) {

        int num = 231, reversed = 0;

        System.out.println("Original Number: " + num);
        //First, we find the remainder of the given number by using the modulo (%) operator.
        //Multiply the variable reverse by 10 and add the remainder into it.
        //Divide the number by 10.

        // run loop until num becomes 0
        while(num != 0) {

            // get last digit from num
            int digit = num % 10;
            reversed = reversed * 10 + digit;

            // remove the last digit from num
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
