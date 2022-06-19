/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Admin
 */

@RunWith( value = Parameterized.class)
public class CalCuTest {

    public CalCuTest() {
    }

    @Parameters
    public static Object[][] initData() {
        return new Integer[][]{
            {1, 11},
            {2, 12},
            {5, 16}
        };
    }
    @Parameter(value = 0)
    public int input;
    @Parameter(value = 1)
    public int expected;
    @Test
    public void testGetTest() {
        assertEquals(expected, CalCu.getTest(input));
    }

}
