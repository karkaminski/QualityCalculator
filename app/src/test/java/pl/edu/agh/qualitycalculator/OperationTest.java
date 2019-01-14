package pl.edu.agh.qualitycalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OperationTest {

    Operation operationUnderTest;

    @Test
    public void sumTest () {
        operationUnderTest = Operation.SUM;
        assertEquals("plus",operationUnderTest.toString());
    }

    @Test
    public void subtractTest() {
        operationUnderTest = Operation.SUBTRACT;
        assertEquals("minus", operationUnderTest.toString());
    }

    @Test
    public void multiplyTest() {
        operationUnderTest = Operation.MULTIPLY;
        assertEquals("multiplied by", operationUnderTest.toString());
    }

    @Test
    public void divide() {
        operationUnderTest = Operation.DIVIDE;
        assertEquals("divided by", operationUnderTest.toString());
    }
}