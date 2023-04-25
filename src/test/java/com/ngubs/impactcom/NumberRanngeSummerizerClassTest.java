/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.ngubs.impactcom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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
        var obj = new NumberRanngeSummerizerClass();
        assertEquals(Collections.emptyList(), obj.collect(""));    
    }
    
    @org.junit.jupiter.api.Test
    public void testCollectMethodReturningCorrectList() {
        var obj = new NumberRanngeSummerizerClass();
        
        var expected = Arrays.asList(1,3,6,7,8,12,13,14,15,21,22,23,24,31);
        //Passing an unsorted list
        var results = obj.collect("3,1,6,31,7,8,12,14,13,15,21,22,23,24");
        
        assertEquals(expected, results);    
    }
    
    @org.junit.jupiter.api.Test
    public void testCollectMethodThrowingException() {
        var obj = new NumberRanngeSummerizerClass();
        assertThrows(NumberFormatException.class, () ->
                                    {
                                        obj.collect("1,3,6,7,y,r");
                                    });    
    }
    
    @org.junit.jupiter.api.Test
    public void testSummerieCollectionReturningEmptyString() {
        var obj = new NumberRanngeSummerizerClass();
        
        var results = obj.summarizeCollection(Collections.emptyList());
        
        assertEquals("", results); 
    }
    
    @org.junit.jupiter.api.Test
    public void testSummerieCollectionReturningString() {
        var obj = new NumberRanngeSummerizerClass();
        
        var expectedListed = Arrays.asList(1,3,6,7,8,12,13,14,15,21,22,23,24,31);
        
        var results = obj.summarizeCollection(expectedListed);
        
        assertEquals("1, 3, 6-8, 12-15, 21-24, 31", results); 
    }
    
    
    
}
