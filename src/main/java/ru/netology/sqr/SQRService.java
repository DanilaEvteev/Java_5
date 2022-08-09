package ru.netology.sqr;

public class SQRService {

    public int resault(int first, int last) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int square_root = i * i;
            if (square_root > first) {
                if (square_root < last) {
                    count++;
                }
            }

        }
        return count;
    }
}
