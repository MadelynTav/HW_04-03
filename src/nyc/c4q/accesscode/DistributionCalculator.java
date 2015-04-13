package nyc.c4q.accesscode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;


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

    public static ArrayList<String> calculate (File myFile) {

        ArrayList<String> percent = new ArrayList();

        String beforeFile;
        String afterFile = "";
        String letters = "abcdefghijklmnopqrstuvwxyz";

        try {
            Scanner input = new Scanner(myFile);

            while (input.hasNext()) {

                beforeFile = input.next();
                beforeFile = beforeFile.toLowerCase();

                for (int i=0; i < beforeFile.length(); i++) {
                    String letter = beforeFile.substring(i, i+1);
                    if (letter.matches("[a-z]"))
                        beforeFile += letter;
                    else
                        continue;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < letters.length(); i++) {
            percent.add(distribution(letters.charAt(i), afterFile));
        }
        return percent;
    }

    public static String distribution (char letter, String text) {

        int letterCount = 0;
        int totalCount= 0;
        double distribution;
        DecimalFormat df = new DecimalFormat("#.00");


        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == letter)
                letterCount++;

            totalCount++;
        }

        distribution = (double)letterCount / totalCount * 100;

        String newFormat = df.format(distribution);

        String distributionFormat = letter + " = " + newFormat + "%";

        return distributionFormat;
    }

    public static void main (String [] args) {

        ArrayList<String> out = new ArrayList();

        File myFile = new File("/Users/c4q-madelyntavarez/Desktop/accesscode/HW_04-03/src/nyc/c4q/accesscode/Dickens");

        out = calculate(myFile);

        for (String words : out)
            System.out.println(words);

    }
}