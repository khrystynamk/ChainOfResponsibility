package com.ucu.edu.task1;

public class Tray { // One chain
    public int denomination;
    private Tray next;

    public Tray(int denomination) {
        this.denomination = denomination;
    }

    public Tray setNext(Tray nextNew) {
        this.next = nextNew;
        return nextNew;
    }

    public void process(int amount) {
        if (next != null) {
            next.process(amount % denomination);
        } else if (amount % denomination > 0) {
            throw new IllegalArgumentException();
        }
        System.out.format("Please take %d out of the denomination %d\n",
                 amount / denomination, denomination);
    }
}
