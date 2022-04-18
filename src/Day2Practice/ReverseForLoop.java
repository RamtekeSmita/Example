package Day2Practice;

public class ReverseForLoop {

               public static void main(String[] args)
        {
            int num = 231, reverse = 0;
            System.out.println("Original Number: " + num);
//we have not mentioned the initialization part of the for loop
            for( ;num != 0; num=num/10)
            {
                int remainder = num % 10;
                reverse = reverse * 10 + remainder;
            }
            System.out.println("Reversed Number: " + reverse);

        }
    }

