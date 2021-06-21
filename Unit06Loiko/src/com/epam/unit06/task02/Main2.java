package com.epam.unit06.task02;

public class Main2 {
    public static void main(String[] args){
        System.out.println("Инициализируем время 12:32:43");
        Time time = new Time(12,32,43);
        time.getTime();
        System.out.println("Установим значение минут равное 42");
        time.setMinutes(42);
        time.getTime();
        System.out.println("Добавим 2 часа");
        time.addHours(2);
        time.getTime();
        System.out.println("Добавим 1500 минут (25 часов)");
        time.addMinutes(1500);
        time.getTime();
        System.out.println("Добавим 3725 секунд (62 минуты и 5 секунд)");
        time.addSeconds(3725);
        time.getTime();
        System.out.println("Установим неправильное время: 25:68:83");
        time.setSeconds(83);
        time.setMinutes(68);
        time.setHours(25);
        time.getTime();
    }
}
