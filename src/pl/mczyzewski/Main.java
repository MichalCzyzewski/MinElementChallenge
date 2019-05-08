package pl.mczyzewski;

import java.util.Scanner;

public class Main
{

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Enter count : ");
        int count = sc.nextInt();
        sc.nextLine();
        int[] array = readIntegers(count);
        int returnMin = findMin(array);
        System.out.println("min " + returnMin);


    }

    private static int[] readIntegers(int count)
    {
        int[] array = new int[count];

        for (int x = 0; x < array.length; x++)
        {
            System.out.println("Enter a number : ");
            int number = sc.nextInt();
            sc.nextLine();
            array[x] = number;
        }
        return array;
    }


    private static int findMin(int[] array)
    {
        int min = Integer.MAX_VALUE;
        for (int x=0; x< array.length;x++){
            int value = array[x];
            if(value < min)
            {
                min = value;
            }
        }
        return min;
    }
}


//    {
//        int[] myArray = readIntegers();
//       findMin(myArray);
//
//    }
//
//
//    public static int[] readIntegers()
//    {
//        System.out.print("How many Integers you want to enter ? : ");
//        int count = sc.nextInt();
//        int[] arrayEnter = new int[count];
//        System.out.println("Pleas enter " + count + " Integers numbers : ");
//        for (int x = 0; x < arrayEnter.length; x++)
//        {
//            arrayEnter[x] = sc.nextInt();
//        }
//
//            return arrayEnter;
//    }
//
//    public static void findMin(int[] array)
//    {
//        int minNumber = Integer.MAX_VALUE;
//
//        for (int x = 0; x< array.length;x++)
//        {
//
//            if (array[x] < minNumber )
//            {
//                minNumber = array[x];
//            }
//        }
//        System.out.println();
//        System.out.println( "The minimal numebr in array is : " + minNumber);
//    }