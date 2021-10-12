package ex43;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */

public class App {
    //function that creates website taking in the String siteName and creating a folder
    public static void website(String siteName)
    {
        //creating a file path
        String siteFile = "src\\main\\java\\ex43\\website";

        //creating a folder to hold file
        File siteFolder = new File (siteFile);

        //creates the website folder
        boolean siteFolderCreated = siteFolder.mkdir();

        //holds the file path for the user's website
        String userSiteFile = siteFile + "\\" + siteName;

        //creating a folder for the user website file
        File userSiteFolder = new File (userSiteFile);

        //ensuring that the folder is created
        boolean userSiteFolderCreated = userSiteFolder.mkdir();

       //Output
        System.out.println("Created: ./website/" + siteName);

    }

    //function that creates html file using the siteName and author as well as writing them into the file
    public static void HTMLFile(String siteName, String author) throws IOException
    {

        //creating path for the file to go to
        File htmlFile = new File ("src\\main\\java\\ex43\\website\\" + siteName + "\\index.html");

        //ensuring that the html file is created
        boolean htmlFileCreated = htmlFile.createNewFile();

        //creating a file writer to write in the html output file
        FileWriter htmlOutputFile = new FileWriter(htmlFile);

       //writing in the html file
            htmlOutputFile.write("<!DOCTYPE html>\n<html>\n<head>\n<title> " + siteName + " </title>\n</head>\n");

            htmlOutputFile.write("<meta> " + author + " <meta/>\n</html>");

            //Output
            System.out.println("Created: ./website/" + siteName + "/index.html");

       //closing the file
        htmlOutputFile.close();
    }


    //function that creates Java Script folder and using siteName
    public static void JSFolder(String siteName)
{
    //creating path for file
    File JSFolder = new File ("src\\main\\java\\ex43\\website\\" + siteName + "\\js");

    //ensuring folder is created
    boolean JSFolderCreated = JSFolder.mkdir();

   //Output
            System.out.println("Created: ./website/" + siteName + "/js/");

}

//function that creates CSS folder using siteName
public static void CSSFolder(String siteName)
{
    //creating path for the file
    File CSSFolder = new File ("src\\main\\java\\ex43\\website\\" + siteName + "\\css");

    //ensuring file is created
    boolean CSSFolderCreated = CSSFolder.mkdir();

    //Output
            System.out.println("Created: ./website/" + siteName + "/css/");

}
    public static void main(String[] args) throws IOException{

        //using scanner to take in input
    Scanner input = new Scanner(System.in);
    System.out.println("Site name: "); //output
    String siteName = input.nextLine();
    System.out.println("Author: "); //output
    String author = input.nextLine();
    System.out.println("Do you want a folder for JavaScript? "); //output
    String folderJS = input.nextLine();
    System.out.println("Do you want a folder for CSS?"); //output
    String folderCSS = input.nextLine();

    //calling functions
    website(siteName);
    HTMLFile(siteName, author);

    //using if statements based on input to call JS and CSS function
    if(folderJS.equals("Y") || folderJS.equals("y"))
    {
        JSFolder(siteName);
    }

    if(folderCSS.equals("Y") || folderCSS.equals("y"))
    {
        CSSFolder(siteName);
    }

}
}
