package ru.netology.sqrtcalcul.sqr;
public class SqrtService {
    public int calcCount(int lowerValue, int upperValue){
    int i;
    //количество квадратов
    int count = 0;

        for (i = 1; (i * i) <= upperValue; i++){

            count++;

            if ((i * i) < lowerValue) {

                count--;
            }

        }
        return count;

    }

}
