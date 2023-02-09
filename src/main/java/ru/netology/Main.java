package ru.netology;


public class Main {
    public static void main(String[] args) {

        int lowerValue = 10;
        int upperValue = 99;
        int i;
    //    int count = 0;
        //мне нужно просто найти количество итераций цикла
        // А КАК???


        for (i = 1; (i * i) <= upperValue; i++) {
            if ((i * i) <= lowerValue) {
                    continue;
            }
            System.out.println("Число квадратов в заданном диапазоне:" + i);

        }





    }

}