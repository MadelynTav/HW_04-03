package nyc.c4q.accesscode;

import java.io.File;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.net.URL;

/**
 * Created by c4q-madelyntavarez on 4/1/15.
 * Search engines lixke Google have programs called webscapers which visit webpages
 * and scrape the information displayed on the webpage. The displayable information
 * is contained in html tags like p, table, h2 etc. When we make a GET request for
 * a webpage, the HTML that is returned can also contain tags like script which often
 * do not correspond to the displayable content on the webpage. Information inside script
 * tags is not used by scapers and they often ignore these tags in the HTML. Write a class
 * called WebPageSanitizer which implements a static method called String sanitize(String
 * html) which removes all script tags and the information that they encapsulate and
 * returns a sanitized version of the HTML string.
 */
public class WebPageSanitizer
{

    public static ArrayList test()
    {
        File myFile = new File("/Users/c4q-madelyntavarez/Desktop/ScriptHW.txt");

        try
        {
            Scanner scanner = new Scanner(myFile);
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } catch (Exception e) {

        }

        ArrayList<String> myArray = new ArrayList<String>();

        for(String convert : myArray)
        {
            convert.toLowerCase();

            int index = myArray.indexOf("<script");
            int indexEnd = myArray.indexOf("</script>");

            if(myArray.contains(index))
            {
                List<String> delete = myArray.subList(index, indexEnd);
                myArray.remove(delete);
            }
            else
                myArray.add(convert);


        }

        return myArray;
    }



        public static void main(String[] args) throws Exception {
            test();

        }
    }


