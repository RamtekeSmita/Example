package Day2Practice;

import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        int intOrigNum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        intOrigNum = sc.nextInt();

        // Convert Number to String
        String str = Integer.toString(intOrigNum);
        int len = str.length();
        char[] ch = new char[len];

        //Reverse the characters
        for (int i = 0; i < str.length(); i++) {
            len--;
            ch[i] = str.charAt(len);
        }

        // Convert Char array to String and then to Integer
        int intRevrsNum = Integer.parseInt(String.valueOf(ch));
        if(intOrigNum== intRevrsNum){
            System.out.println("Number entered is a Palindrome");
        }else{
            System.out.println("Number entered is NOT a Palindrome");
        }

    }
}
