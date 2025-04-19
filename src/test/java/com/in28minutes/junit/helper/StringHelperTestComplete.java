package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTestComplete {

	// AACD => CD ACD => CD CDEF=>CDEF CDAA => CDAA

	StringHelper helper;

	@Before
	public void before(){
		helper = new StringHelper();
	}

 // Test cases for truncateAInFirst2Positions method

    /**
     * Tests if the method removes 'A' from the first two positions in "AACD".
     * Expected output: "CD".
     */
    @Test
    public void testTruncateAInFirst2Positions_AACD() {
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
    }

    /**
     * Tests if the method removes 'A' from the first position in "ACD".
     * Expected output: "CD".
     */
    @Test
    public void testTruncateAInFirst2Positions_ACD() {
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    /**
     * Tests if the method leaves the string unchanged when there are no 'A's 
     * in the first two positions of "CDEF".
     * Expected output: "CDEF".
     */
    @Test
    public void testTruncateAInFirst2Positions_CDEF() {
        assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
    }

    /**
     * Tests if the method leaves 'A's outside the first two positions 
     * unchanged in "CDAA".
     * Expected output: "CDAA".
     */
    @Test
    public void testTruncateAInFirst2Positions_CDAA() {
        assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
    }

    // Test cases for areFirstAndLastTwoCharactersTheSame method

    /**
     * Tests if the method correctly identifies that the first two 
     * and last two characters of "ABCD" are not the same.
     * Expected output: false.
     */
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_ABCD() {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    /**
     * Tests if the method correctly identifies that the first two 
     * and last two characters of "ABAB" are the same.
     * Expected output: true.
     */
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_ABAB() {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

    /**
     * Tests if the method returns true for a string of length 2 
     * (the first two and last two characters are identical by definition).
     * Input: "AB".
     * Expected output: true.
     */
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_AB() {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
    }

    /**
     * Tests if the method returns false for a string shorter than 2 characters.
     * Input: "A".
     * Expected output: false.
     */
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_A() {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
    }
}