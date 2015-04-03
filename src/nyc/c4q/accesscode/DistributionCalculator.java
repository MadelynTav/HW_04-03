package nyc.c4q.accesscode;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by c4q-madelyntavarez on 4/1/15.
 * Create a class to calculate the distribution of characters in the contents of a text file. Your class called
 * DistributionCalculator should implement a method calculate(File textFile) which accepts as input a Text file.
 * It reads the contents of the file and returns an ArrayList which contains the distribution/percentage of characters
 * (a-z) in the text file. You should lowercase lines before you do the calculation. Call the calculate method from main
 * and print the distribution. You can ignore characters which do not belong in the range(a-z) for doing your calculation.
 * Your program's output should look something like:

 a = 14.44 %
 b = 6.02 %
 ...
 ...
 z = 0.05 %
 *
 */
public class DistributionCalculator
{

    public static ArrayList calculate(File myfile)
    {

        myfile = new File("/Users/c4q-madelyntavarez/Desktop/ScriptHW.txt");

        try
        {
            Scanner scanner = new Scanner(myfile);
            while(scanner.hasNext())
            {
                System.out.println(scanner.next());
            }
        }
        catch(Exception e)
        {

        }

        ArrayList<String> myArray = new ArrayList<String>();
        for (String letter


        }

        }





    public static void main(String[] args)
    {

    }
}