package com.feefo.titles;
import java.util.Scanner;

/**
 * @author Iain Campbell
 * @version 1.0
 */
public class JobTitles {

  public static void main(String[] args) {
      
      String cleanedJobTitle = readInput();
      Matcher matcher = new Matcher();
      
      /* Compare the entered job title to the normalized versions */
      String normalizedJobTitle = matcher.match(cleanedJobTitle);

      System.out.println("Cleaned - " + cleanedJobTitle + "\n");
      System.out.println("Most likely match - " + normalizedJobTitle);

  }

  /**
   * Read a job title from command-line input
   * @return A cleaned version of the user's input
   */
  static String readInput() {
      
    Scanner scanner = new Scanner(System.in);
    Cleaner cleaner = new Cleaner();

    String jobTitleInput;
    String cleanedJobTitle = "";

    do {

      System.out.println("Please enter a job title");

      jobTitleInput =  scanner.nextLine();

      if (jobTitleInput.length() > 0) {
        
        System.out.println("");
        System.out.println("Cleaning - " + jobTitleInput + "\n"); 
        
        /** Normalize and clean the input data to account for special characters/utf-8 */
        cleanedJobTitle = cleaner.clean(jobTitleInput);
      
      }

    } while (cleanedJobTitle.length() == 0);

    scanner.close();
    return cleanedJobTitle;

  }

}