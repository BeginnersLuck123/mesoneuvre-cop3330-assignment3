package ex41;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.io.File;

/**
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        //creating an arraylist to hold the list of names that will later be sorted
        ArrayList<String> sortedNames = new ArrayList<>();

        //accessing the input file
            File file = new File("src\\main\\java\\ex41\\exercise41_input.txt");

            //directing scanner to read from input file
            Scanner input = new Scanner(file);


        //creating an output file
        File orderedNamesFile = new File("exercise41_output.txt");

        //accessing the ability to write in output file
        FileWriter outputFile = new FileWriter(orderedNamesFile);


            /*using a while loop to read each line from input file and then add it to the arraylist sortedNames
        until there are no more lines*/
            while (input.hasNextLine()) {
                String name = input.nextLine();
                sortedNames.add(name);
            }

            //using collections function to sort the names in the arraylist
            Collections.sort(sortedNames);


        //writing in output file
        outputFile.write("\nTotal of " + sortedNames.size() + " names: \n");
        outputFile.write("------------------------\n");


        //adding in the sorted names in arraylist to the output file
      for(String n : sortedNames)
      {
          outputFile.write(n + "\n");
      }


    }
}
