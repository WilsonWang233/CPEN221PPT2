package ssdnumbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class Task3Tests {

    @ParameterizedTest
    @MethodSource("task3TestProvider")
    public void testSSDNumberIterator(int numDigits, String[] expOutput) {
        int numValues = expOutput.length;
        SSDNumberIterator iterator = SSDNumber.getSSDNumberIterator(numDigits);
        try {
            for (int i = 0; i < numValues; i++) {
                if (!iterator.hasNext()) {
                    fail();
                }
                assertEquals(expOutput[i], iterator.next());
            }
        }
        catch (SSDIteratorDoneException ex) {
            fail(); // there should be no exception here
        }
        if (iterator.hasNext()) {
            fail(); // there should be no more
        }
        try {
            iterator.next();
            fail(); // should not reach this statement
        }
        catch (SSDIteratorDoneException ex) {
            // OK! We should catch the exception here. Test passes.
        }
    }

    private static Stream<Arguments> task3TestProvider() {
        return Stream.of(
                Arguments.of(1, new String[] {"1"}),
                Arguments.of(2, new String[] {"22"}),
                Arguments.of(3, new String[] {"122", "212", "221", "333"}),
                Arguments.of(4, new String[] {"1333", "3133", "3313", "3331", "4444"}),
                Arguments.of(5, new String[] {"14444", "22333", "23233", "23323", "23332", 
                                              "32233", "32323", "32332", "33223", "33232", "33322", 
                                              "41444", "44144", "44414", "44441", "55555"})
        );
    }
}
