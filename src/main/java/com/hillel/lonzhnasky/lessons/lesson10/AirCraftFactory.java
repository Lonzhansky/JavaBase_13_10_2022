package com.hillel.lonzhnasky.lessons.lesson10;

public class AirCraftFactory {

//Фабрика літаків
//        a. Параметри літаків:
//        String type = "Jet";
//        String name = "F52";
//        int firstClassPassengers = 20;
//        int secondClassPassengers = 250;
//        b. Фабрика випускає три типи літаків:
//        винищувачі: тип + ім'я
//        пасажирські без бізнес класу: тип + ім'я + кільк. пасажирів 2-го класу
//        пасажирські з бізнес класом: тип + ім'я + кільк. пасажирів 1 класу + кільк. пасажирів 2-го класу
//        c. Зробити три методи з однією назвою для кожного типу літака
//        buildAirplane("Jet", "F52");
//        buildAirplane("Boeing", "747", 300);
//        buildAirplane("Boeing", "747", 300, 25);
//        d. Кожен метод повинен виводити на екран параметри літака

    public static void main(String[] args) {

        buildAirplane("Jet", "F52");
        buildAirplane("Boeing", "747", 300);
        buildAirplane("Boeing", "747", 300, 25);
    }

    // Overload
    static void buildAirplane(String type, String name) {
        System.out.println("винищувач: " + type + " назва:" + name);
    }

    static void buildAirplane(String type, String name, int secondClassPassengers) {
        System.out.println(
                "пасажирський без бізнес класу: " + type
                + " " + name
                + " кільк. пасажирів 2-го класу: " + secondClassPassengers);
    }

    static void buildAirplane(String type, String name, int secondClassPassengers, int firstClassPassengers) {
        System.out.println(
                "пасажирський з бізнес класом:: " + type
                + " " + name
                + ", кільк. пасажирів 1-го класу: " + firstClassPassengers
                + ", кільк. пасажирів 2-го класу: " + secondClassPassengers);
    }


}
