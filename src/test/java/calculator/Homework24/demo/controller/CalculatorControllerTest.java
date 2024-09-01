package calculator.Homework24.demo.controller;

import calculator.Homework24.demo.service.CalculatorService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {

    CalculatorService service = new CalculatorService();

    private static Stream<Arguments> argumentsStream() {
        return Stream.of(
                Arguments.of(1, 2),
                Arguments.of(-1, 2),
                Arguments.of(1, -2),
                Arguments.of(0, 2),
                Arguments.of(0, -2),
                Arguments.of(1, 0));
    }
    private static Stream<Arguments> argumentsStream1() {
        return Stream.of(
                Arguments.of(1, 2),
                Arguments.of(-1, 2),
                Arguments.of(1, -2),
                Arguments.of(0, 2),
                Arguments.of(0, -2));
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void testPlus(Integer a , Integer b) {
        assertEquals(a + b, service.plus(a, b));
    }



    @ParameterizedTest
    @MethodSource("argumentsStream")
    void testMinus(Integer a , Integer b) {
        assertEquals(a - b, service.minus(a, b));
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void testMultiply(Integer a , Integer b) {
        assertEquals(a * b, service.multiply(a, b));
    }

    @ParameterizedTest
    @MethodSource("argumentsStream1")
    void testdevide(Integer a , Integer b) {
        assertEquals(a / b, service.divide(a, b));
    }

}