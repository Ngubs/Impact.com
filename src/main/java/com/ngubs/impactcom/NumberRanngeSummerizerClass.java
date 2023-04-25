/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ngubs.impactcom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author qaits
 */
public class NumberRanngeSummerizerClass implements NumberRanngeSummerizer{

    /**
    *   @param input: String sequence of numbers to process/sort and send to 
    *   the summerizeCollection() method
     * @return Collection of Integer
    * 
    */
    @Override
    public Collection<Integer> collect(String input) {
        
        Collection<Integer> nums = new ArrayList<>();
        //Checking if the input string is not empty 
        if (input == null || input.isEmpty()) {
            return nums;
        }
        
        //Store input items in a List of Strings
        Collection<String> inputValues = Arrays.asList(input.split(","));
       
        try{
            nums = inputValues.stream()  //Push inputValues to a stream
                    .map(num -> Integer.valueOf(num.trim())) //Convert values to Integer
                    .sorted()
                    .collect(Collectors.toList());  //Collect the nums
            
        }catch(NumberFormatException e){
            System.err.print(e.toString());
        }
          
        return nums;
    }

    /**
    *   @param input: Collection of a sorted sequence of numbers to process/group  
    *   if they are sequential
     * @return String of summerized sequence
    * 
    */
    @Override
    public String summarizeCollection(Collection<Integer> input) {
        
        if (input == null || input.isEmpty()) {
            return "";
        }
        
        List<String> groupedItemsList = new ArrayList<>();
        List<Integer> inputAL = new ArrayList<>(input);
        
        int start = inputAL.get(0);
        int end = start;
        
        for (int i = 1; i < inputAL.size(); i++) {
            int currentNum = inputAL.get(i);        //current number on the list
            
            if (currentNum == end + 1) {                 //check if current number = prev + 1
                end = currentNum;
            } else {
                if (start == end) {
                    groupedItemsList.add(start+"");
                } else {
                    groupedItemsList.add(start+"-"+end);
                }
                start = end = currentNum;
            }
        }
        
        if (start == end) 
            groupedItemsList.add(start+"");
        else 
            groupedItemsList.add(start+"-"+end);
        
        
        String results = groupedItemsList.stream()
                            .collect(Collectors.toList())
                            .toString().replaceAll("\\[", "")
                            .replaceAll("\\]", "");
        
        return results;
    }
    
}
