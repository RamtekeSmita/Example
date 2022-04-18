package Day2Practice;

import java.util.Scanner;


public class UnitTenHundred {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int intThou = 0;
        int intHun = 0;
        int intTen = 0;
        int intUnit = 0;
        System.out.println("Enter 1 to 4 digit number :");
        int number = input.nextInt();
        if (number <=9999 && number > 999)
        {
            intThou = number/1000;
            System.out.println("Thousand place digit :" + intThou);
            intHun = (number/100)%10;
            System.out.println("Hundred place digit :" + intHun);
            intTen = (number/10)%10;
            System.out.println("Tens place digit :" + intTen);
            intUnit = (number%10);
            System.out.println("Unit place digit :" + intUnit);

        }
        else if (number <=999 && number > 99) {
            intHun = (number/100);
            System.out.println("Hundred place digit :" + intHun);
            intTen = (number/10)%10;
            System.out.println("Tens place digit :" + intTen);
            intUnit = (number%10);
            System.out.println("Unit place digit :"+ intUnit);
        }
        else if (number <=99 && number > 9) {
            intTen = (number/10);
            System.out.println("Tens place digit :" + intTen);
            intUnit = (number%10);
            System.out.println("Unit place digit :" + intUnit);
        }else if (number <=9 && number >= 0) {
            System.out.println("Unit place digit :" + number);
        } else {
            System.out.println("It looks like you entered a number with more than 4 digits!");
        }
    }
}

