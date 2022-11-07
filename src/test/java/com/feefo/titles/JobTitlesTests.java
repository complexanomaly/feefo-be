package com.feefo.titles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JobTitlesTests {

    @Test
    @DisplayName("Check that an inputted string is correctly cleaned.")
    void cleansADirtyString() {
        Cleaner cleaner = new Cleaner();
        String inputStr = "This is a &Schön to be cleaned ";
        String expectedCleanedStr = "this is a &schon to be cleaned";
        String cleanedStr = cleaner.clean(inputStr);
        assertEquals(expectedCleanedStr, cleanedStr);
    }

    @Test
    @DisplayName("Check that an engineer is matched to a software engineer")
    void correctlyMatchesEngineer() {
        String inputTitle = "Java Engineer";
        Cleaner cleaner = new Cleaner();
        Matcher matcher = new Matcher();
        String cleanedStr = cleaner.clean(inputTitle);
        String matchedStr = matcher.match(cleanedStr);
        assertEquals("Software Engineer", matchedStr); 
    }

    @Test
    @DisplayName("Check that a surveyor is matched to a surveyor")
    void correctlyMatchesSurveyor() {
        String inputTitle = "Surveyor";
        Cleaner cleaner = new Cleaner();
        Matcher matcher = new Matcher();
        String cleanedStr = cleaner.clean(inputTitle);
        String matchedStr = matcher.match(cleanedStr);
        assertEquals("Quantity Surveyor", matchedStr); 
    }

    @Test
    @DisplayName("Check that an unfortunate engineer is matched to a software engineer")
    void correctlyMatchesMSEngineer() {
        String inputTitle = "C# Engineer";
        Cleaner cleaner = new Cleaner();
        Matcher matcher = new Matcher();
        String cleanedStr = cleaner.clean(inputTitle);
        String matchedStr = matcher.match(cleanedStr);
        assertEquals("Software Engineer", matchedStr); 
    }
    
    @Test
    @DisplayName("Check that an accountant is matched to an accountant")
    void correctlyMatchesAccountant() {
        String inputTitle = "Chief Accountant";
        Cleaner cleaner = new Cleaner();
        Matcher matcher = new Matcher();
        String cleanedStr = cleaner.clean(inputTitle);
        String matchedStr = matcher.match(cleanedStr);
        assertEquals("Accountant", matchedStr); 
    }
   
    @Test
    @DisplayName("Check that an accountant is matched to an accountant")
    void correctlyDeterminesNoMatch() {
        String inputTitle = "asdfasdfasdf";
        Cleaner cleaner = new Cleaner();
        Matcher matcher = new Matcher();
        String cleanedStr = cleaner.clean(inputTitle);
        String matchedStr = matcher.match(cleanedStr);
        assertEquals("None", matchedStr); 
    }

    /** 
     * TODO - main() method testing here
     * Out of time :-/
    @Test
    @DisplayName("")
    void receivesCommandLineInput() {}
    **/
}