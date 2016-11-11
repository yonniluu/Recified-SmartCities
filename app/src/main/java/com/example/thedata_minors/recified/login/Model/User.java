package com.example.thedata_minors.recified.login.Model;

/**
 * Created by TheAhBooBoo on 2016-11-10.
 */

public class User {

    String firstName, lastName, gender;
    int age, score;

    User(String fName, String lName, String g, int age){
        firstName = fName;
        lastName = lName;
        gender = g;
        this.age = age;
        score = 0;
    }

    public void updateScore(int add){
        score =+ add;
    }

    public void setFirstName(String fName){
        firstName = fName;
    }

    public void setLastName(String lName){
        lastName = lName;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

}
