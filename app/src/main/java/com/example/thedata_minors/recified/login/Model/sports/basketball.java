package com.example.thedata_minors.recified.login.Model.sports;

import com.example.thedata_minors.recified.login.Model.User;

import java.util.LinkedList;

/**
 * Created by tiffanyxu on 2016-11-10.
 */

public class basketball extends sports {
    LinkedList<User> currentUsers;
    int maxCapacity = 30;


    @Override
    int getMaxCapacity() {
        return maxCapacity;
    }

    @Override
    int getCurrentCapacity() {
        return currentUsers.size();
    }

    @Override
    boolean isFull() {
        return (maxCapacity <= currentUsers.size());
    }
}
