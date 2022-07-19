package ru.netology.sqr;

public class SQRService {

    public int countSqr(int from, int to) {
        int sqr = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i >= from) & (i * i <= to)) {
                sqr++;
            }
        }
        return sqr;
    }


}
