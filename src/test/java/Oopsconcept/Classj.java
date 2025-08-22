package Oopsconcept;

public class Classj {
    String model; // property of the class
    // properties are also called as attributes or fields
    // properties are used to store data in the class
    String color;
    int year;
    public static void main(String[] args) {
        // new keyword is used to create an object of the class
        Classj obj = new Classj(); // creating an object of the class
        // obj is the reference variable of the class
        obj.model = "BMW"; // accessing the property of the class
        obj.color = "Black"; // accessing the property of the class
        obj.year = 2023; // accessing the property of the class
        System.out.println("This is my object :" + obj.model);
    }

    }

