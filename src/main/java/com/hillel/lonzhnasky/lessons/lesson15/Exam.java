package com.hillel.lonzhnasky.lessons.lesson15;

import java.util.Arrays;
import java.util.Scanner;

public class Exam {

    /*
        створіть клас Exam, у ньому попросіть користувача ввести тип
        транспортного засобу:
        MOTORCYCLE, CAR, BUS, TRUCK
        b. залежно від вибраного виду, виведіть літеру категорії прав, яка
        необхідна для керування цим транспортним засобом.
        приклад: MOTO = A, CAR = B
        c. виведіть у консоль букву категорії:
        "Для керування CAR необхідна категорія В"
        d. для кожної категорії створіть метод, який приймає на вхід
        кількість років досвіду водіння (вводимо з консолі), в якому рахуйте
        чи достатньо в людини досвіду щоб водити це транспортне
        засіб. З такими параметрами:
        А: від 3 років досвіду водіння
        В: від 0 років досвіду
        C: від 5 років досвіду
        D: від 7 років досвіду
        e. викликайте відповідний метод у switch
        f. введіть з консолі типу т.с. і років досвіду в циклі, щоб можна було
        перевіряти та видавати багато прав. цикл повинен працювати поки користувач
        не введе "no"
        g. створіть клас DriverLicense і якщо користувач може отримати права -
        створюйте йому екземпляр прав
        h. рахуйте кількість виданих прав і виведіть на екран після того як
        введено команду "no":
        Всього видано: 12 ліцензій
 */

    public static void main(String[] args) {
        runApp();
        System.out.println("Всього видано: " + DriverLicense.counter);
    }

    static void runApp() {
        CarType[] carTypes = CarType.values();
        CarType transportType = null;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter transport type from list: " + Arrays.toString(carTypes));

        while (true) {
            String userValue = scanner.nextLine().toUpperCase();
            for (CarType carType : carTypes) {
                if (userValue.equals(carType.toString())) {
                    transportType = CarType.valueOf(userValue);
                    break;
                }
            }
            if (transportType != null) {
                break;
            } else {
                System.out.println("Wrong data, try again");
            }
        }

        int years = -1;
        while (true) {
            System.out.println("Please enter drive experience");
            if (scanner.hasNextInt()) {
                years = scanner.nextInt();
                if (years >= 0) {
                    break;
                } else {
                    System.out.println("Please enter positive number");
                }
            } else {
                System.out.println("Wrong data, please enter integer");
                scanner.nextLine();
            }
        }


        boolean ok = false;
        switch (transportType) {
            case MOTORCYCLE: {
                System.out.println("Для керування " + transportType.getType() + " необхідна категорія " + Category.A);
                ok = checkYears(years, Category.A);
                break;
            }
            case CAR: {
                System.out.println("Для керування " + transportType.getType() + " необхідна категорія " + Category.B);
                ok = checkYears(years, Category.B);
                break;
            }
            case TRUCK: {
                System.out.println("Для керування " + transportType.getType() + " необхідна категорія " + Category.C);
                ok = checkYears(years, Category.C);
                break;
            }
            case BUS: {
                System.out.println("Для керування " + transportType.getType() + " необхідна категорія " + Category.D);
                ok = checkYears(years, Category.D);
                break;
            }
        }

        if (ok) {
            new DriverLicense();
            System.out.println("Take your driver licence");
        } else {
            System.out.println("You need more drive experience");
        }

    }


    static boolean checkYears(int years, Category category) {
//        А: від 3 років досвіду водіння
//        В: від 0 років досвіду
//        C: від 5 років досвіду
//        D: від 7 років досвіду

        switch (category) {
            case A: {
//                if (years >= 3) {
//                    return true;
//                } else {
//                    return false;
//                }

                return years >= 3;
            }
            case B: {
                return years >= 0;
            }
            case C: {
                return years >= 5;
            }
            case D: {
                return years >= 7;
            }

            default: {
                return false;
            }
        }
    }

}
