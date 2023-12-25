package com.ucu.edu.task1;
// Celery for postponed tasks
// Celery lets you run app on different workers
// Celery lets you join tasks into groups (tasks are completed in parallels,
// lets us understand when all tasks are complete) like Promise.all in Java Script???
// Celery has chains (tasks are completed one by one)
// Fundamental error in Celery: the basic object is inherited from dictionary in Python

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();
            atm.process(428);
    }
}