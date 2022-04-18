package Day2Practice;

import java.util.Scanner;

public class VowelConsonant {
           public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("\n Enter Character: ");
             char x=((sc.nextLine()).charAt(0));
            char y=Character.toUpperCase(x); //Changing Value to UpperCase for uniformity.

            switch(y) //Checking Vowel Character using Switch Case
            {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U': System.out.println(x+" is a Vowel.");
                    break;

                default: System.out.println(x+" is a Non-Vowel Character.");
            }

        }
    }

