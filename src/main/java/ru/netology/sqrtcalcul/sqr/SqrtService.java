package ru.netology.sqrtcalcul.sqr;

public class SqrtService {
    public int calcCount(int lowerValue, int upperValue) {
        int i;
        int count = 0;

        for (i = 1; (i * i) <= upperValue; i++) {

            if ((i * i) < lowerValue) continue;

            count++;

        }
        return count;
    }

}
