package com.Tomcat;
//Prit Patel
//Prit Patel Problem 2 OA 2
import java.util.Arrays;
//If the digits in the number is in decreasing value then it is already largest possible number for the given digits.
//To solve keep in mind that we need to make changes to least place value to get number 1 greater than the given.
//For that we start checking from the second last digit (index in code) is greater than last one
// Continue till the index where current number is less than previous.
//complexity of this code will be O(n)
public class nextLargest {
    public int nextLargest(int[] n){
        int length = n.length;
//if length ==1 return -1
        if(length==1){
            return -1;
        }
        int prev=n[length-1];
        int index=length-2;

        while(index>=0&&prev<=n[index]){
            prev=n[index];
            index--;
        }
        if(index==-1){
            return -1;
        }
        int i=length-1;
        while(n[index]>=n[i]){
             i--;
        }
//Once we know the digit we will swap it with the digit just greater than current digit
        int temp=n[index];
        n[index]=n[i];
        n[i]=temp;
//Now sort the remaining digits after desired digit which we just swapped, so we will achieve least value
        Arrays.sort(n,index+1,length);
        double nextGreat=0;
        for(i=0;i<length;i++){
            nextGreat=nextGreat*10.0 +n[i];
        }

//Now check the if nextGreat is less than the maximum value of integer if not retrun
        if(nextGreat<=(double)Integer.MAX_VALUE){
            return  (int)nextGreat;
        }
        return -1;
    }
}

