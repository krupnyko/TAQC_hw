package com.company;
import java.util.Scanner;
public class Brick {

    public static void main(String[] args) {

        System.out.println("Insert the values a,b,c,x,y");
        Scanner scanner = new Scanner( System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if ((a & b) == (x & y)){
            System.out.println("Yes");
        }
        else if ((b & a) == (x & y)){
            System.out.println("Yes");
        }
        else if ((c & b) == (x & y)){
            System.out.println("Yes");
        }
        else if ((b & c) == (x & y)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }
}
