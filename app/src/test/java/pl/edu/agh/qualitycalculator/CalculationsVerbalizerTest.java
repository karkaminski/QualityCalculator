package pl.edu.agh.qualitycalculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculationsVerbalizerTest {

    CalculationsVerbalizer verbalizerUnderTest;

    @Test
    public void verbalizerTest(){
        verbalizerUnderTest = new CalculationsVerbalizer();
        assertEquals("2.0 plus 2.0 gives value 4.0", verbalizerUnderTest.verbalize(Operation.SUM,2.0f,2.0f,4.0f));
        assertEquals("5.0 minus 2.0 gives value 3.0", verbalizerUnderTest.verbalize(Operation.SUBTRACT, 5.0f, 2.0f, 3.0f));
        assertEquals("5.0 multiplied by 2.0 gives value 10.0", verbalizerUnderTest.verbalize(Operation.MULTIPLY, 5.0f,2.0f,10.0f));
        assertEquals("15.0 divided by 3.0 gives value 5.0", verbalizerUnderTest.verbalize(Operation.DIVIDE,15.0f,3.0f,5.0f));
    }
}