package ssdnumbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class Task2Tests {

    @ParameterizedTest
    @MethodSource("task2TestProvider")
    public void testLargestSSDNumber(int numDigits, int mustContainDigit, String expOutput) {
        if (!expOutput.equals("")) {
            try {
                assertEquals(expOutput, SSDNumber.getLargestSSDNumber(numDigits, mustContainDigit));
            }
            catch (NoSuchElementException nse) {
                fail();
            }
        }
        else {
            try {
                SSDNumber.getLargestSSDNumber(numDigits, mustContainDigit);
                fail(); // should not reach this statement
            }
            catch (NoSuchElementException nse) {
                // OK!
            }
        }
    }

    private static Stream<Arguments> task2TestProvider() {
        return Stream.of(
                Arguments.of(4, 1, "3331"),
                Arguments.of(9, 2, "777777722"),
                Arguments.of(6, 3, "333221"),
                Arguments.of(7, 7, "7777777"),
                Arguments.of(1, 2, ""),
                Arguments.of(13, 3, "9999999993331"),
                Arguments.of(1, 1, "1"),

                Arguments.of(4, 2, "")

        );
    }

}
