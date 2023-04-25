/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.ngubs.impactcom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author qaits
 */
public class NumberRanngeSummerizerClassTest {
    
    public NumberRanngeSummerizerClassTest() {
    }

    
    @org.junit.jupiter.api.Test
    public void testCollectMethodReturningEmptyList() {
        var nrs = new NumberRanngeSummerizerClass();
        assertEquals(new ArrayList<Integer>(), nrs.collect(""));    
    }
    
    @org.junit.jupiter.api.Test
    public void testCollectMethodReturningCorrectList() {
        var nrs = new NumberRanngeSummerizerClass();
        Collection<Integer> expected = Arrays.asList(1,3,6,7,8,12,13,14,15,21,22,23,24,31);
        assertEquals(expected, nrs.collect("1,3,6,7,8,12,13,14,15,21,22,23,24,31"));    
    }
    
    @org.junit.jupiter.api.Test
    public void testCollectMethodThrowingException() {
        var nrs = new NumberRanngeSummerizerClass();
        assertThrows(NumberFormatException.class, () ->
                                    {
                                        nrs.collect("1,3,6,7,y,r");
                                    });    
    }
    
    
    
}
