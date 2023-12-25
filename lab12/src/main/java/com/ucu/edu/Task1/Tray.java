package com.ucu.edu.task1;

public class Tray { // One chain
    private Tray next;
    public int denomination;

    public Tray(int denomination) {
        this.denomination = denomination;
    }

    public Tray setNext(Tray next) {
        this.next = next;
        return next;
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
