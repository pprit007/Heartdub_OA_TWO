package com.Tomcat;
import java.util.*;
public class Main {




    public static void main(String[] args) {
        //Problem 1
        //According to the table provided the output will be 3
        ReturnNthElement problem2=new ReturnNthElement();
        //change index here
        int index=17;
        System.out.println("Problem 1");
        System.out.println("Element at "+index+" is " +problem2.returnNthElement(index));

        //Problem 2
        nextLargest problem1=new nextLargest();
        int[] arr={1,4,3};
        System.out.println("Problem 2");
        System.out.println("Next smallest digit is: "+problem1.nextLargest(arr));



    }
}


//[2 1 5 3 4]   