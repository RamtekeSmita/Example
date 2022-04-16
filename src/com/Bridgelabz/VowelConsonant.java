package com.Bridgelabz;

import com.sun.deploy.security.SelectableSecurityManager;
import jdk.nashorn.internal.parser.Lexer;
import jdk.nashorn.internal.parser.Scanner;

import javax.swing.*;

public class VowelConsonant {
    public static void main(String[] args) {
        boolean isvowel = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Character :");
        char ch = scanner.next().charAt(0);
        scanner.close();
        switch (ch) {
            case 'a'
                ;
            case 'e'
                ;
            case 'i'
                ;
            case 'o'
                ;
            case 'u'
                ;
            case 'A'
                ;
            case 'E'
                ;
            case 'I'
                ;
            case 'O'
                ;
            case 'U'
                ;
                isvowel = true;

        }
        if (isvowel == true) {
            System.out.println(ch + "is a vowel");
        } else {
            if ((ch >= 'a' && ch <= 'z'))||((ch <= 'A' && ch <= 'Z'))
            System.out.println(ch + "is a Consonant");
        else
            System.out.println("Input is not an Alphabet");
        }
    }




    }
    }
}
