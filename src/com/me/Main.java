package com.me;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //step 1
        //declare an ArrayList variable and call the ArrayList constructor to instantiate an ArrayList object and
        // assign it to the variable:
        //type in 6 for a specific list capacity
        ArrayList<Integer> weeklyTemperatures = new ArrayList<Integer>(6);

        //step 2
        //You can insert an object at a specific position in the list by listing the
        // position in the add method:
        weeklyTemperatures.add(78); //0 position
        weeklyTemperatures.add(67);
        weeklyTemperatures.add(89);
        weeklyTemperatures.add(94);
        weeklyTemperatures.add(88);
        weeklyTemperatures.add(79); //5



    }



}
