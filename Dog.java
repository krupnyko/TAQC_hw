package com.company;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String name,String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    enum breed{

    }

}
class Main{
    public static void main(String [] args){
        Dog dog1 = new Dog("Tim", "Husky", 5);
        Dog dog2 = new Dog("Joe", "Collie", 3);
        Dog dog3 = new Dog("Tina", "Pug", 2);
        //System.out.println(dog1.equals(dog2));
        if (dog1.equals(dog2)){
            System.out.println("We have the same name!");
        }
        if (dog1.equals(dog3)){
            System.out.println("We have the same name!");
        }
        else{
            System.out.println("We have the same name!");
        }

}}