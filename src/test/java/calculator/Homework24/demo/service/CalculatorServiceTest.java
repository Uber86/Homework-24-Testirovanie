package calculator.Homework24.demo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    CalculatorService service = new CalculatorService();


    @Test
    void plusTest() {
        assertEquals(3 ,service.plus(1,2));
        assertEquals(1 ,service.plus(-1,2));
        assertEquals(-1 ,service.plus(1,-2));
        assertEquals(-7 ,service.plus(0,-7));
        assertEquals(0 ,service.plus(0,0));

    }
    @Test
    void minusTest() {
        assertEquals(-1 ,service.minus(1,2));
        assertEquals(-3 ,service.minus(-1,2));
        assertEquals(3 ,service.minus(1,-2));
        assertEquals(6 ,service.minus(-1,-7));

    }
    @Test
    void multiplyTest() {
        assertEquals(2 ,service.multiply(1,2));
        assertEquals(0 ,service.multiply(0,0));
        assertEquals(0 ,service.multiply(0,1));
        assertEquals(0 ,service.multiply(1,0));
        assertEquals(1 ,service.multiply(-1,-1));

    }
    @Test
    void divideTest() {
        assertEquals(0 ,service.divide(1,2));
        //assertEquals(0 ,service.divide(0,0));
        assertEquals(0 ,service.divide(0,1));
        //assertEquals(0 ,service.divide(1,0));
        assertEquals(1 ,service.divide(-1,-1));
        assertThrows(IllegalArgumentException.class, () -> service.divide(2, 0));
    }
}