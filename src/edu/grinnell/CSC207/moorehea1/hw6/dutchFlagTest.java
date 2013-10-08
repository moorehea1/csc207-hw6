package edu.grinnell.CSC207.moorehea1.hw6;

import static org.junit.Assert.*;

import org.junit.Test;

public class dutchFlagTest {

    String[] testArray = {"blue", "white", "red"};
    String[] testAns = new String[] {"red", "white", "blue"};
    
    @Test
    public void testMain() {
	assertEquals("Simple", testAns, dutchFlag.main(testArray));
    }

}
