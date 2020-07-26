package com.simplilearn.calculator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testDivisionByTwoPossitiveNumbers()
    {
    	double result =	App.division(200,5 );
    	assertEquals(40.0, result);
    }
    
    public void testDisvisionByZer() {
		double result = App.division(10, 0);
		assertEquals(0.0, result);
	}
}
