
// Create a directory named pre07 under your assignments repo.

// Write a program named Arrays.java and in it solve exercises 1, 4 and 5 from chapter 8 in Think Java.


  // Starting with the code in Section 8.6, write a method called powArray that takes a double array, a, and returns a new array that contains the elements of a squared. Generalize it to take a second argument and raise the elements of a to the given power.
  // Starting with the code in Section 8.10, write a method called histogram that takes an int array of scores from 0 to (but not including) 100, and returns a histogram of 100 counters. Generalize it to take the number of counters as an argument.


import java.io.*;
import java.util.*;

public class Arrays; 

1 //array a and array b

  public static double  powArray(double [] a, double []b) {// for integers 1, up to the end of the array, 
      for (int i = 1; i < a.length; i++) {
      // system takes numbers from array a and 
        System.out.print(math.pow([a],2));
        // how to put into a new array?
      }
     System.out.println("}");
}



// 4
//Exercise 4   Write a method called indexOfMax that takes an array of integers and returns the index of the largest element. Can you write this method using an enhanced for loop? Why or why not?

public static int indexOfMax(int[] a, int target) {
    for (int i = 0; i < a.length; i++) {
      // if the index number is less than the target, return the target? not sure
        if (a[i] > target) {
            return target;
        }
    }// if the target is smaller than return false? 
    return -1;
}

//5./. not sure where to go with this one
public static int sieve(int[] a, int target) {
    for (int i = 0; i < a.length; i++) {
      // if the index number is less than the target, return the target? not sure
        if (a[i] > target) {
            return target;
        }
    }// if the target is smaller than return false? 
    return -1;
}