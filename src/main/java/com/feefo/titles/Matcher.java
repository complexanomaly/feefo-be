package com.feefo.titles;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import info.debatty.java.stringsimilarity.RatcliffObershelp;

class Matcher {

  /** The normalized job titles that we want to mat our user input to */
  private String[] jobTitles = {
    "Architect",
    "Software Engineer",
    "Accountant",
    "Quantity Surveyor"
   };

  static final String NO_MATCH = "None";

  /**
  * @param jobName A normalized version of our user input
  * @return A string which is the closest match to the jobName parameter
  */
  protected String match (String jobName) {

    RatcliffObershelp r = new RatcliffObershelp();

    HashMap<String,Double> matches=new HashMap<String,Double>();

    for (String job : jobTitles) {
      double score = r.distance(jobName, job.toLowerCase());
      matches.put(job, score);
      System.out.println("Matching: " + jobName + " : " + job + " : " + score + "\n"); 
    }

    /** Determine which jobTitle in the map has the lowest score (ie. is the best match) */
    Entry<String, Double> lowestValue = Collections.min(matches.entrySet(), Map.Entry.comparingByValue());

    /** There's likely no suitable match if the score is over 0.5 */
    if (lowestValue.getValue() > 0.5) {
      return NO_MATCH;
    }

    return lowestValue.getKey();

  }

}