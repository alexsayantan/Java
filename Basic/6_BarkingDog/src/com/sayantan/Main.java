package com.sayantan;

public class Main {

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,12));
    }

    public static boolean shouldWakeUp(boolean barking,int hourOfDay){

        if (hourOfDay < 0 || hourOfDay > 23)
            return false;
        else return barking && hourOfDay < 8 || hourOfDay > 22;
    }
}
