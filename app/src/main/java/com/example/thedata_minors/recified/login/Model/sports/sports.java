package com.example.thedata_minors.recified.login.Model.sports;

import com.example.thedata_minors.recified.login.Model.User;

import java.util.LinkedList;

/**
 * Created by tiffanyxu on 2016-11-11.
 */

public abstract class sports {
    LinkedList<User> currentUsers;
    LinkedList<User> waitlist;

    abstract int getMaxCapacity();
    abstract int getCurrentCapacity();

    void checkIn(User i) {
        if (isFull()) {
            waitlist.add(i);
        }
        else {currentUsers.add(i);}

    }

    void checkOut(User i) {
        currentUsers.remove(i);
        currentUsers.add(waitlist.getFirst());
    }

    abstract boolean isFull();
}
