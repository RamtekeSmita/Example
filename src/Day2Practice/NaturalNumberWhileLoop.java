package Day2Practice;

public class NaturalNumberWhileLoop

{
    public static void main(String[] args)
    {
        int num = 5, i = 1, sum = 0;
//executes until the condition returns true
        while(i <= num)
        {
//adding the value of i into sum variable
            sum = sum + i;
//increments the value of i by 1
            i++;
        }
//prints the sum
        System.out.println("Sum of First 5 Natural Numbers is = " + sum);
    }
}