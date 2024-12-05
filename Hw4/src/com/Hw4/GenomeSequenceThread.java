package com.Hw4;

import java.util.Random;

/**
 * This class uses concurrency to make this program faster.
 * It contains five threads to create 20 genomes sequence each.
 */
public class GenomeSequenceThread extends Thread{
    // To store 100 genome sequence
    static String[] genomeListThread = new String[100];
    static Random randomThread = new Random();
    static char[] charsThread = new char[]{'A','T','G','C'};
    static int numberOfSequence = 0;

    /**
     * Generating five threads to create 20 genome sequence each
     */
    public void run() {
        // Loop to generate 20 sequences
        for (int s = 0; s < 20; s++) {
            // Store the sequence with exact 10 chars
            String sequence = "";
            // For generating word with 10 char
            for (int i = 0; i < 10; i++) {
                int x = randomThread.nextInt(4);
                sequence += charsThread[x];
            }
            genomeListThread[numberOfSequence] = sequence;
            numberOfSequence++;

            System.out.println("Sequence name is: " + getName()
                    + " >>> "
                    + ( s + 1 )
                    + " : \n\n" + sequence + "\n");
        }
    }
}
