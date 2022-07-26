package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    void test1(int expected, int from, int to) {

        SQRService service = new SQRService();

        ///int expected = 3;
        int actual = service.countSqr(from, to);

        Assertions.assertEquals(expected, actual);

    }

///    @Test
///    void test2() {
///
///        SQRService service = new SQRService();
///        int expected = 14;
///        int actual = service.countSqr(120, 600);
///
///     Assertions.assertEquals(expected, actual);
///}

///    @Test
///    void test3() {

///         SQRService service = new SQRService();
///         int expected = 34;
///         int actual = service.countSqr(18, 1900);

///     Assertions.assertEquals(expected, actual);
/// }


}

