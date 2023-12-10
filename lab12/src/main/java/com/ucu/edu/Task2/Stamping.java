package com.ucu.edu.Task2;

public class Stamping {
    // Stamp the tasks within the group with the groupId
    public static <T> Group<T> stampGroupWithId(Group<T> group) {
        for (Task<T> task : group.getTasks()) {
            if (task instanceof Signature) {
                Signature<T> signature = (Signature<T>) task;
                signature.setHeader("groupId", group.groupUuid);
            } else if (task instanceof Group) {
                stampGroupWithId((Group<T>) task);
            }
        }
        return group;
    }
}
