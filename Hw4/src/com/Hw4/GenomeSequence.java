package com.Hw4;

import java.util.Random;

/**
 * creates 100 random genome sequences each should be 10 characters long
 * It is a single thread that generates 100 genome sequences at one time
 */
public class GenomeSequence {
    // To store 100 genome sequence
    static String[] genomeList = new String[100];

    // Generate characters between the four characters
    static char[] chars = new char[]{'A','T','G','C'};

    // Declare and initialize the random obj
    static Random randomChar = new Random();

    // Track number of sequences generated
    static int numberOfSequence = 0;

    /**
     * Method for generating 100 genome sequences
     * Single Thread
     */
    public void genomeSequence() {
        System.out.println("Creating 100 random Genome Sequences:-\n");

        // Used for having execution time, compare to multi-thread
        long startTime = System.currentTimeMillis();

        // Loop for getting 100 random genome sequences
        while(numberOfSequence < 100) {
            // Store the sequence with exact 10 chars
            String sequence = "";
            // Loop for generating a character of length 10
            for (int i = 0; i < 10; i++) {
                int temp = randomChar.nextInt(4);
                // Add char to the sequence
                sequence += chars[temp];
            }
            System.out.println("Genome Sequence " + (numberOfSequence + 1) + " is " + sequence);
            genomeList[numberOfSequence] = sequence; // Store in array
            numberOfSequence++; // Increments the count
        }

        // Get the total execution time of single thread
        long endTime = System.currentTimeMillis();
        long executeTime = endTime - startTime;
        System.out.println("\nTotal execution time of this single Thread is: "
                + executeTime
                + " milli-seconds.\n");
    }
}
