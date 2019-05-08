package pl.mczyzewski;

import java.util.Scanner;

public class Main
{

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] myArray = readIntegers();
        findMin(myArray);

    }


    public static int[] readIntegers()
    {
        System.out.print("How many Integers you want to enter ? :");
        int count = sc.nextInt();
        int[] arrayEnter = new int[count];
        System.out.println("Pleas enter " + count + " Integers numbers :");
        for (int x = 0; x < arrayEnter.length; x++)
        {
            arrayEnter[x] = sc.nextInt();
        }

            return arrayEnter;
    }

    public static int findMin(int[] array)
    {
        int minNumber = Integer.MAX_VALUE;

        for (int x = 0; x< array.length;x++)
        {
            if (array[x] < minNumber )
            {
                minNumber = array[x];
            }
        }
        return minNumber;
    }
}
