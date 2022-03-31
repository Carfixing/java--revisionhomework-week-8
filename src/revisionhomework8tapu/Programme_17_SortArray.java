package revisionhomework8tapu;

// Write a Java program to sort a numeric array and a string array.


import java.util.Arrays;

public class Programme_17_SortArray {

    public static void main(String[] args) {
        //Numreric Array declaration
        int[] numArray = {1789,2035,1899,2040,1950,2255,7897,1455,787};
        //String Array declaration
        String[] strArray = {"Alpha","Bravo","Delta","Hotel","Mike","Sierra","Peter","Kilo"};
        System.out.println("Actual Numerical Array was :  " + Arrays.toString(numArray));
        //sorting Array
        Arrays.sort(numArray);
        System.out.println("Sorted Numerical Array is :  " + Arrays.toString(numArray));
        System.out.println("=================================================================");
        System.out.println("Actual String Array was :  " + Arrays.toString(strArray));
        //sorting Array
        Arrays.sort(strArray);
        System.out.println("Sorted String Array is : " + Arrays.toString(strArray));
    }
}
