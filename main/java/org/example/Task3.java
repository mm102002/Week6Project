package org.example;

public class Task3 {
    public static void main(String[] args) {
        int[] scores={55, 80, 78, 90, 95, 98};
        int count=0;
        for (int score:scores){
            if(score>80){
                count++;
            }
        }
        System.out.println("Number of scores above 80: "+count);
    }
}
