package com.h2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println(doubleTheNumber(3));
        int[] myList = {1, 2, 3, 5, 6, 7, 8, 9};
        System.out.println(add(myList));
    }


    public static int doubleTheNumber(int number) {
        return 2 * number;

    }

    public static int add(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];}
        return sum;
    }
}
