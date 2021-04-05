package com.company;
import java.util.Scanner;
public class Natural_N {

    public static void main(String[] args) {
        System.out.println("Insert the value n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int new_number = n*n;
        while(new_number > 0){
            int part = new_number % 10;
            if(part == 3){
                System.out.println("YES");
                return;
            }
            new_number = (new_number - new_number % 10) / 10;
        }
        System.out.println("NO");
    }
}
