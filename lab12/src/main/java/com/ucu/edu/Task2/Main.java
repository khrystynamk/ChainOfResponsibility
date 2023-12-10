package com.ucu.edu.Task2;

public class Main {
    public static void main(String[] args) {
        Group<Integer> nestedGroup = new Group<>();
        nestedGroup.addTask(new Signature<>(x -> System.out.println("Initial: " + x)));
        nestedGroup.addTask(new Signature<>(x -> System.out.println("Squared: " + x * x)));

        // Create a group with nestedGroup and another signature task
        Group<Integer> group = new Group<>();
        group.addTask(nestedGroup);
        group.addTask(new Signature<>(x -> System.out.println("Cubed: " + x * x * x)));
        Stamping.stampGroupWithId(group);

        group.apply(15);
    }
}
