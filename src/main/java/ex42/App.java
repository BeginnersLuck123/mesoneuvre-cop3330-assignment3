package ex42;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */

public class App
{
public static void main( String[] args ) throws Exception {
    //accessing input file
    File file = new File("src\\main\\java\\ex42\\exercise42_input.txt");

    //directing scanner to read from input file
    Scanner input = new Scanner(file);

    //initializing arraylists for the list of names and individual components
    ArrayList<String> listOfNames = new ArrayList();
    ArrayList<String> firstName = new ArrayList();
    ArrayList<String> lastName = new ArrayList();
    ArrayList<String> salaries = new ArrayList();

   /*created a while loop to keep reading from the input file and add to the arraylist
    listOfNames until there are no more lines to read*/
    while(input.hasNextLine())
    {
        String name = input.nextLine();
        listOfNames.add(name);
    }

    //created a for loop to go the arraylist listOfNames, put them into the variable n and separate them by comma
   for (String n : listOfNames)
    {
        //separates components based on the placement of a comma and put them into an array
        String[] separateRecords = n.split(",");

        //adds each component to it's designated list
        firstName.add(separateRecords[0]);
        lastName.add(separateRecords[1]);
        salaries.add(separateRecords[2]);
    }

   //printing out the outline of records in the terminal
   System.out.println("Last           First           Salary");
   System.out.println("--------------------------------------");

   /*using a for loop to go through the size of arraylist listOfNames and retrieve the component
   at index i to print out onto terminal */
  for(int i = 0; i < listOfNames.size(); i++)
  {
      System.out.printf("%-15s %-15s %-15s\n", firstName.get(i),  lastName.get(i) , salaries.get(i));
  }
}
}
