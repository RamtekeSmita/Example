package com.Bridgelabz.Day3Pratice;

public class LargestElements {
    public static void main(String[] args)
    {

        int [] arr = new int [] {28, 16, 5, 80, 65};

        //Initialize max with first element of array.
        int max = arr[0];

        //Loop through the array
        for (int i = 0; i < arr.length; i++)
        {
            //Compare elements of array with max
            if(arr[i] > max)
                max = arr[i];
        }
        System.out.println("Largest element present in given array: " + max);
    }
}
