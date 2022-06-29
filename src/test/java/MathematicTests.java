import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.util.stream.Stream;

public class MathematicTests {

    @BeforeAll
    public static void start() {
        System.out.println("Start tests");
    }

    @AfterAll
    public static void finish() {
        System.out.printf("Tests finished");
    }

    @ParameterizedTest
    @MethodSource("source")
    public void testCircLength(double r, double expected) {
        Mathematic mathematic = new Mathematic();
        // when:
        double result = mathematic.circLength(r);

        // then:
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> source() {
        return Stream.of(Arguments.of(1, 6), Arguments.of(3, 19));
    }

    @Test
    public void testDiff() {
        Mathematic mathematic = new Mathematic();
        // given:
        int r = 5;
        boolean expected = false;

        // when:
        boolean result = mathematic.diff(r);

        // then:
        Assertions.assertEquals(expected, result);
    }

    @org.junit.jupiter.api.Test
    public void testFile() {
        Mathematic mathematic = new Mathematic();
        // given:
        int r = 5;
        double square = 32d;
        var expected = IOException.class;

        // then:
        Assertions.assertThrows(expected, () -> mathematic.file(r, square));
    }

}
