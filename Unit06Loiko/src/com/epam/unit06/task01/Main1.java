package com.epam.unit06.task01;

public class Main1 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.printf("Счетчик инициализирован по умолчанию, его значение: %d\n", counter.getCounter());
        for (int i = 0; i < 18; i++)
            counter.increaseCounter();
        System.out.printf("После вызова метода увеличения 18 раз, результат: %d\n", counter.getCounter());
        counter.decreaseCounter();
        System.out.printf("После вызова метода уменьшения, результат: %d\n", counter.getCounter());

        Counter counter2 = new Counter(43, 20, 44);
        System.out.printf("Счетчик инициализирован произвольными значениями , его значение: %d, нижняя граница %d, " +
                "верзняя граница %d, \n", counter2.getState()[0], counter2.getState()[1], counter2.getState()[2]);
        counter2.increaseCounter();
        counter2.increaseCounter();
        System.out.printf("После вызова метода увеличения дважды, результат: %d\n", counter2.getCounter());
        counter2.decreaseCounter();
        System.out.printf("После вызова метода уменьшения, результат: %d\n", counter2.getCounter());
    }
}
