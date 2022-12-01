package com.hillel.lonzhnasky.homeworks.homework12;

public class Homework12 {
    public static void main(String[] args) {
        String str1 = personInfo("Will", "Smith", "New York", "2936729462846");
        System.out.println(str1);
        System.out.println(personInfo("Jackie", "Chan", "Shanghai", "12312412412"));
        System.out.println(personInfo("Sherlock", "Holmes", "London", "37742123513"));
    }

    static String personInfo(String name, String surname, String city, String phoneNumber) {
//        String info = "You can call the citizens of " + name + " " + surname + " from the city of " + city + " at the number " + phoneNumber;
//        return info;
        return "You can call the citizens of " + name + " " + surname + " from the city of " + city + " at the number " + phoneNumber;
    }
}
