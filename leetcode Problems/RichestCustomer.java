// package com.kunal;

public class RichestCustomer {
    public int maximumWealth(int[][] accounts) {
        int wealth = Integer.MIN_VALUE;

        for(int[] ints :accounts){

            // int[] ints = accounts[i];
            int sum =0;
            for(int anint : ints){
                sum += anint;
                // sum = sum+ints[j];


            }
            if(sum>wealth){
                wealth= sum;

            }
        }
        return wealth;
    }
}