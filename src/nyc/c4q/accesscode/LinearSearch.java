package nyc.c4q.accesscode;

import java.util.ArrayList;
import java.util.Scanner;
import java.net.URL;

/**
 * Created by c4q-madelyntavarez on 4/1/15.
 *   You are given an ArrayList of unknown size containing integers.
 // Write a class called LinearSearch which implements a static method search
 // which accepts as input an ArrayList alist and an integer x, and returns the
 // first index it sees of x in alist. If the integer is not present return in the
 // list return -1
 //
 //      Eg. if arraylist contains: [3, 45, 1, 2, 99] and x = 1
 //    Returns : 2
 */

public class LinearSearch
{


    public static String search(ArrayList<Integer> aList, int num)
    {
        for(int x : aList)
        {
            if(x == num)
            {
                x++;
            }
        }


        return String.valueOf((aList.indexOf(num)));
    }


    public static void main(String[] args)
    {
        ArrayList<Integer> aList = new ArrayList<Integer>();
        aList.add(5);
        aList.add(2);
        aList.add(5);
        aList.add(7);
        aList.add(3);

        System.out.println(aList);
        System.out.println(LinearSearch.search(aList, 3));

    }

}

