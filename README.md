# README
This project is for generating Genome Sequences/character strings that include char A,T,G,C.

The GenomeSequence class, creates 100 random genome sequences each should be 10 characters long such as ATGGCAACAG, CAACATCAGC, TTCTCTGTTT. It is a single thread that generates 100 genome sequences at one time, then gives an output. 
The GenomeSequenceThread class, uses concurrency to make this program faster. Like, it contains five threads to create 20 genomes sequence each.

After comparing the single thread and multi-thread running, we could see that using concurrency could make the execution time of the same targeted goal/result shorter, that shows the superiority of the method.