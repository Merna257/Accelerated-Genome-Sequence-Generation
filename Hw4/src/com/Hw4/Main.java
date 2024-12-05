/**
 * Merna Saad
 * Date: Jun 14, 2022
 * Disc: 1. This project is for creating Genome Sequences/character strings that include char A,T,G,C.
 * Course: CS622
 */

package com.Hw4;

public class Main {
    /**
     * For testing and running the program
     */
    public static void main(String[] args) {
        GenomeSequence g = new GenomeSequence();
        g.genomeSequence();
        System.out.println("---------------------------------------------------------------------\n");

        /**
         * Thread five times to generate 100 genome sequence
         */
        GenomeSequenceThread thread_1 = new GenomeSequenceThread();
        GenomeSequenceThread thread_2 = new GenomeSequenceThread();
        GenomeSequenceThread thread_3 = new GenomeSequenceThread();
        GenomeSequenceThread thread_4 = new GenomeSequenceThread();
        GenomeSequenceThread thread_5 = new GenomeSequenceThread();

        long startTime = System.currentTimeMillis();
        // Starting all threads
        thread_1.start();
        thread_2.start();
        thread_3.start();
        thread_4.start();
        thread_5.start();
        try {
            thread_1.join();
            thread_2.join();
            thread_3.join();
            thread_4.join();
            thread_5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        long executionTimeThread = endTime - startTime;

        System.out.println("\nTotal execution time: "
                + executionTimeThread
                + " milli seconds.\n");
    }
}
