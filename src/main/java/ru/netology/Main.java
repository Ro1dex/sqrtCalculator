package ru.netology;

import ru.netology.sqrtcalcul.sqr.SqrtService;

public class Main {
    public static void main(String[] args) {

        int lowerValue = 10;
        int upperValue = 99;

        SqrtService service = new SqrtService();
        System.out.println(service.calcCount(lowerValue, upperValue));

    }

}
