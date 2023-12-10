package com.ucu.edu.Task1;
// Celery for postponed tasks
// Celery lets you run app on different workers ???
// Celery lets you join tasks into groups (tasks are completed in parallels, lets us understand when all tasks are complete) like Promise.all in Java Script???
// Celery has chains (tasks are completed one by one)
// Fundamental error in Celery: the basic object is inherited from dictionary in Python

// Tree traversal (BFS) to label tasks with group id's
// Save in 'headers' the id's
public class Main {
    public static void main(String[] args) {
        // int[] currencyDenomination = {1, 2, 5, 10, 20, 50, 100};
        // int amount = 437; // Chain of responsibility
        // for (int i = 0; i < currencyDenomination.length; i++) {
        //     int index = currencyDenomination.length - 1 - i;
        //     System.out.format("Please take %d out of the denomination %d\n", amount / currencyDenomination[index], currencyDenomination[index]);
        //     amount = amount % currencyDenomination[index];
        // }
        ATM atm = new ATM();
            atm.process(428);
    }
}