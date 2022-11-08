# Feefo Coding Software Engineering Technical Assessment

## Object Oriented Programming

### Description

Provided with a list of ideal (normalized) job titles, create a class that implements a process that returns the best match when provided with an input string.

Concretely, given a normalized job titles list of “Architect", "Software engineer", "Quantity surveyor", and "Accountant", write a process that returns the normalized result for the input.

--- 

### Requirements

* Java >= 8

### IDE

Written in VSCode.

### Build

Clone the repo and then, from the command line, type `./gradlew build` in the project root directory

### Run

The program takes input from the command line and then attempts to match the input to one of the normalized job titles. It outputs the matching process as well as the final result.

Run from the command line:

`java -jar <PROJECT_DIR>/build/libs/feefo.jar`

Alternatively, open `<PROJECT_DIR>/main/java/com/feefo/titles/JobTitles.java`. Press CTRL-F5 and the project will build and run in the terminal.

### Test

Open `src/test/java/com/feefo/titles/JobTitlesTests.java` and press CTRL-F5. Test output will display in the `TESTING` panel on the left.

---
### NB

I chose to do this in Java with VSCode as it's relevant to the role. I don't usually use an IDE but thought it the best way to learn Gradle. And my Java's a bit rusty but I was keen to hop back in.

So I'm sure I could configure Gradle tasks better within VSCode but for now that's why the instructions are hybrid VSCode/CLI.