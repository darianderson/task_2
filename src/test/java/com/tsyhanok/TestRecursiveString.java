package com.tsyhanok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRecursiveString {

    private RecursiveString recursiveString = new RecursiveString();

    @Test
    public void testInterviewRecursionTestSuccessInputOne() {
        assertEquals("h*e*ll*o", recursiveString.interviewRecursionTest("hello"));
    }

    @Test
    public void testInterviewRecursionTestSuccessInputTwo() {
        assertEquals("h*e*a*l*o", recursiveString.interviewRecursionTest("healo"));
    }

    @Test
    public void testInterviewRecursionTestSuccessInputThree() {
        assertEquals("a*o*b", recursiveString.interviewRecursionTest("aob"));
    }

    @Test
    public void testInterviewRecursionTestSuccessInputFour() {
        assertEquals("a*bc", recursiveString.interviewRecursionTest("abc"));
    }

}



