package Day2Practice;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        int num,orig,sum,rem;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        num=sc.nextInt();
        orig=num;
        for (sum=0;num>0;num/=10)
        {
            rem=num%10;
            System.out.println("Remainder " + rem);
            sum=(sum*10)+rem;
            System.out.println("S " + sum);
        }
        if (sum==orig)
            System.out.println(orig + " is a palindrome number");
        else
            System.out.println(orig + " is not a palindrome number");
    }
}
