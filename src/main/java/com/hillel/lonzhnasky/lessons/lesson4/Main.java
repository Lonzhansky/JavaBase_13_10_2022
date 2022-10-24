package com.hillel.lonzhnasky.lessons.lesson4;

public class Main {
    public static void main(String[] args) {
//        Дано: зарплати трьох працівників за 1 місяць (a, b, c)
//        Розрахувати:
//        1. для кожного працівника суму зарплати за 10 років
//        2. відняти 5% податок
//        3. порахувати середнє арифметичне за трьома сумами за 10 років
//        4. вивести суми зарплат за 10 років з урахуванням вирахування податків та
//        середнє арифм.

        int a = 700;
        int b = 2000;
        int c = 3500;

        int countMonth10Years = 10 * 12; // 120

        int salary1 = a * countMonth10Years;
        int salary2 = b * countMonth10Years;
        int salary3 = c * countMonth10Years;

        System.out.println(salary1);
        System.out.println(salary2);
        System.out.println(salary3);

        double salary1WithoutTax = salary1 - salary1 * 0.05;
        double salary2WithoutTax = salary2 - salary2 * 0.05;
        double salary3WithoutTax = salary3 - salary3 * 0.05;

        System.out.println();
        System.out.println(salary1WithoutTax);
        System.out.println(salary2WithoutTax);
        System.out.println(salary3WithoutTax);

        System.out.println();
        System.out.println("avg = " + ((salary1WithoutTax + salary2WithoutTax + salary3WithoutTax) / 3));
        System.out.println("sum all = " + (salary1WithoutTax + salary2WithoutTax + salary3WithoutTax));


    }


    static void demo2() {
//        int var = Math.abs(1);
//        System.out.println(var);
//
//        System.out.println(Math.pow(5, 3));
//
//        System.out.println(Math.sqrt(16));
//        System.out.println(Math.sqrt(25));

        System.out.println(Math.random());  // [0, 1)  -> from 0.0 to 0.999999999999999999999999999999999999

        int randomNumber = (int) (Math.random() * 11);  // 0.9 * 10 = 9.99999999999999999999
        System.out.println(randomNumber);

        // from 15 to 30

        int min = 15;
        int max = 30;

        int resultRandomNumber = (int) ((Math.random() * (max - min + 1)) + min);
        System.out.println(resultRandomNumber);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(Math.round(10.499999999));
        System.out.println(Math.round(10.9));


        System.out.println(Math.PI);
        System.out.println(Math.E);
    }


    static void demo1() {
        int a = 10;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);

//        System.out.println((double) 10 / 3);
//        System.out.println(10 / (double) 3);
//        System.out.println((double) 10 / (double) 3);

        System.out.println();
        System.out.println(a % b);  // 10 / 3 = 3; 10 - 9 = 1


//        int result = a / b;
//        System.out.println("result = " + result);

        int result = 5;
//        result = result + 1;
//        result = result + 1;
//        result = result + 1;
//        result++;
//        result++;

//        result--;
//        result--;
//
//        --result;
//        --result;

//        System.out.println("result = " + result);
//        System.out.println(10 + ++result);
//        System.out.println("result = " + result);


//        int x = 5;
//        int y = 10;
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);
//
//        System.out.println("result = " + (x++ + ++y + x++ - y--));
//
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);


        System.out.println();
        System.out.println();
        int x = 10;
        int y = 3;

//        x = x + y;
//        System.out.println("x = " + x);

//        x += y;
//        x -= y;
//        x *= y;
//        x /= y;
//        x %= y;

        x += ++x;

        System.out.println(x);
    }
}
