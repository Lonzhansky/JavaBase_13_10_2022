package com.hillel.lonzhnasky.lessons.lesson3;

public class Homework {
    public static void main(String[] args) {

        String position = "UA, Kyiv";
        double latitude = 22.43434;
        double longitude = 23.45345434;
        char specialSymbol = '\u00B0';

//        System.out.println(position + " latitude: " + latitude + specialSymbol + ", longitude: " + longitude + specialSymbol);
//        System.out.println(position);
//        System.out.println("latitude: " + latitude + specialSymbol);
//        System.out.println("longitude: " + longitude + specialSymbol);

//        System.out.println(position + "\nlatitude: " + latitude + specialSymbol + "\nlongitude: " + longitude + specialSymbol);

        System.out.println(position);
        System.out.println("" + latitude + longitude);
        System.out.println(String.valueOf(latitude) + "\n" + longitude);
        System.out.println(String.valueOf(latitude) + "\t" + longitude);
    }


    /*

    Reset видаляє всі коміти вище за вибраний. Там пропонується чотири варіанти цієї команди. Відмінність їх у тому, як зробити зі змінами в робочому каталозі та в індексі.

    Revert не видаляє комміт, а створює новий, який описує дії, необхідні для скасування обраного комміту.

    Undo дозволяє скасувати останній комміт. Але зміни комміта пропонує зберегти в новому changelist. Файли в робочому каталозі не зміняться і можна буде підправити їх і заново закоммітити.

    Drop – зручна команда для видалення довільного комміту із середини історії. Під капотом там фактично виконується інтерактивний rebase, але в автоматичному режимі.

    Revert Selected Changes нагадує Revert, але скасовує зміни окремого файлу, а не всього комміту. Ця команда доступна на панелі змінених файлів.

    Get дозволяє повернути будь-який файл до стану певного коміту в історії. Виберемо файл будь-яким зручним способом та контекстне меню Git | Show History покаже всі комміти, у яких змінювався цей файл. Клікнувши на потрібному коміті правою кнопкою побачимо команду Get

    From gitHub

     */
}
