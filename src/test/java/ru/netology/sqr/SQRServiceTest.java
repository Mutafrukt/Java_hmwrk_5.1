package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    void test1() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.countSqr(200, 300);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void test2() {

        SQRService service = new SQRService();
        int expected = 14;
        int actual = service.countSqr(120, 600);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void test3() {

        SQRService service = new SQRService();
        int expected = 34;
        int actual = service.countSqr(18, 1900);

        Assertions.assertEquals(expected, actual);
    }


}

