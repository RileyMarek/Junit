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

 // Test cases for truncateAInFirst2Positions
    @Test
    public void testTruncateAInFirst2Positions_AACD() {
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_ACD() {
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_CDEF() {
        assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
    }

    @Test
    public void testTruncateAInFirst2Positions_CDAA() {
        assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
    }

    // Test cases for areFirstAndLastTwoCharactersTheSame
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_ABCD() {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_ABAB() {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_AB() {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_A() {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
    }


}