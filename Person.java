package com.company;
import java.util.Scanner;
public class Person {
    //Scanner scanner = new Scanner(System.in);
    private String name;
    private int birthYear;

    public Person(){}

    public Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    public int age(){
        return 2021-birthYear;
    }

    public static Person input(){
        Scanner scan = new Scanner(System.in);
        Person p = new Person();
        System.out.print("Name: ");
        p.setname(scan.next());
        System.out.print("Birth year: ");
        p.setbirthYear(scan.nextInt());
        return p;
    }

    private void setbirthYear(int nextInt) {
    }

    private void setname(String next) {
    }

    public String output(){
        return "Person Name: " + name +  ", BirthYear: " + birthYear +
                ", Age: " + age();
    }
    public void changeName(String s, int a){
        name = "John";
    }

    public static class Main {

        public static void main(String[] args) {
            Person person1 = new Person("Ivan",  1999);
            Person person2 = new Person("Yura",  2000);
            Person person3 = new Person("Dima",  2001);
            Person person4 = new Person("Ira",  1999);
            Person person5 = new Person("Olya",  1997);

        }
    }
}