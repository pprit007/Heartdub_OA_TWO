package com.Tomcat;
//Prit Patel
//Problem no 1 OA 2
public class ReturnNthElement {
    //Complexity will be O(nlogn)
    public int returnNthElement(int n){
        long index=n;
        long length=1, start=1, count=9;

        while(index>length*count){
            index=index-length*count;
            length++;
            count=count*10;
            start=start*10;
        }

        // Number
        start = start + (index-1)/length;

        // Specific digit will be
        return String.valueOf(start).charAt((int)((index-1)%length))-'0';
    }
}
