package org.example;

public class Task2 {
    public static void main(String[] args) {
        int[] values={5, 6, 10, 20, 15};
        double sum=0;
        for (int i=0; i< values.length; i++){
            sum+=values[i];
        }
        double average=sum/ values.length;
        System.out.println("Average of all elements: "+average);
    }
}
