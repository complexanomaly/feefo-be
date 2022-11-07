package com.feefo.titles;

import java.text.Normalizer;

class Cleaner {
  /**
   * @param jobTitleInput The string that's been entered by the user on the command line
   * @return String that's been normalized and cleaned of special chars
   */  
  protected String clean (String jobTitleInput) {

    String cleanedJobTitle = jobTitleInput
      .replaceAll("œ", "oe")
      .replaceAll("æ", "ae");

    cleanedJobTitle = Normalizer
      .normalize(jobTitleInput, Normalizer.Form.NFKD)
      .replaceAll("[^\\p{ASCII}]", "")
      .replaceAll("\\s{2,}", " ")
      .replaceAll("—", "-")
      .toLowerCase()
      .trim();

    return cleanedJobTitle;

  }

}
