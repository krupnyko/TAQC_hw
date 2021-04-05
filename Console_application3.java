package com.company;
import java.io.IOException;
import static java.lang.Math.pow;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Console_application3 {
    public static void main(String[] args) throws IOException {
        System.out.println("Insert the radius");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int radius = Integer.parseInt(br.readLine());
        double perimeter_of_flower_bed = 2*Math.PI*radius;
        double area_of_flower_bed = pow((Math.PI*radius),2);
        System.out.println("Perimeter of flower bed = " + perimeter_of_flower_bed);
        System.out.println("Area of flower bed = " + area_of_flower_bed);

        System.out.println("What is your name?");
        String name = br.readLine();
        System.out.println("Where are you live, " + name);
        String address = br.readLine();
        System.out.println("You live in " + address);


        System.out.println("Enter the c1, c2, c3 values");
        int c1 = Integer.parseInt(br.readLine());
        int c2 = Integer.parseInt(br.readLine());
        int c3 = Integer.parseInt(br.readLine());

        System.out.println("Enter the t1, t2, t3 values");
        int t1 = Integer.parseInt(br.readLine());
        int t2 = Integer.parseInt(br.readLine());
        int t3 = Integer.parseInt(br.readLine());
        int sum1 = c1*t1;
        System.out.println("Amount of first call = " + sum1);
        int sum2 = c2*t2;
        System.out.println("Amount of second call = " + sum2);
        int sum3 = c3*t3;
        System.out.println("Amount of third call = " + sum3);
        int avg = sum1+sum2+sum3;
        System.out.println("Average sum = " + avg);
    }
}
