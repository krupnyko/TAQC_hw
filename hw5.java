package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class hw5 {
    public static void main(String[] args) throws IOException {
        System.out.println("Insert the 3 float numbers in range [-5;5]");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float number1 = Float.parseFloat(br.readLine());
        float number2 = Float.parseFloat(br.readLine());
        float number3 = Float.parseFloat(br.readLine());

        if (!( number1 <= 5 & -5<=number1)||!( number2 <= 5 & -5<=number2) || !( number3 <= 5 & -5<=number3)){
            System.out.println("Wrong number, try again!");
        }
        float max1 = Float.max(number1, number2);
        float max2 = Float.max(max1, number3);
        System.out.println("Max element = "+ max2);

        float min1 = Float.min(number1, number2);
        float min2 = Float.min(min1, number3);
        System.out.println("Min element = "+ min2);

    }
}