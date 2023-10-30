package hw26;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static ru.otus.java.basic.hw26.MainApp.elemsAfter;
import static ru.otus.java.basic.hw26.MainApp.elemsFitt;

public class Arraystest {
    @Test
    public void firstTest() {
        Assertions.assertArrayEquals(new int[] {2,2}, elemsAfter(new int[] {2,2,1,2,2}));
    }
    @Test
    public void secondTest() {
        Assertions.assertThrows(RuntimeException.class, ()->elemsAfter(new int[] {2,2,2,2,2}));

    }

    @ParameterizedTest
    @MethodSource("testData")
    public void tests(int[] mas, boolean result) {
        Assertions.assertEquals(result, elemsFitt(mas));
    }

    public static Stream<Arguments> testData() {
        List<Arguments> arguments = new ArrayList<>();
        arguments.add(Arguments.arguments(new int[]{1, 2}, true));
        arguments.add(Arguments.arguments(new int[]{1, 1}, false));
        arguments.add(Arguments.arguments(new int[]{1, 3}, false));
        arguments.add(Arguments.arguments(new int[]{1, 2, 2, 1}, true));
        return arguments.stream();
    }
}
