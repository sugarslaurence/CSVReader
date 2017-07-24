package readcsv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;

public class ReadCSV {

    public static void main(String[] args) {

        String file_Name = "/Users/laurencesugars/Documents/importCSV.csv";

        String line = " ";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(file_Name))) {

            ArrayList<String[]> countries = new ArrayList<>();

            while ((line = br.readLine()) != null) {

                String[] country = line.split(cvsSplitBy);
                countries.add(country);
                //adds every row of the CSV to an arrayList countries
                
                //System.out.println(country[1] +" "+ country[2] + " "+ country[3] + " " + country[4] +" "+ country[5]);
            }
        
        //The following code loops through the ArrayList countries and prints out every value
        
            //for (int i = 0; i < countries.size(); i++) {
            //String[] country = countries.get(i);
            
            for (String[] country : countries) {
            //This is some nice Java that executes the previous two lines in one
            
                for (int j = 0; j < country.length; j++) {
                    System.out.print(country[j]);
                    if (j < country.length - 1) {
                        System.out.print(", ");
                    }
                }
                
                System.out.println();
            }

            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
