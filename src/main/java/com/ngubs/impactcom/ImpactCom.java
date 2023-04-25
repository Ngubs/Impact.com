/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ngubs.impactcom;

import javax.swing.JOptionPane;

/**
 *
 * @author qaits
 */
public class ImpactCom {

    public static void main(String[] args) {
        //NumberRangeSummerizer obj
        var nrs = new NumberRanngeSummerizerClass();
        //Prompt user for a sequence
        String input = JOptionPane.showInputDialog
            ("Enter a sequence of number and seperate each item by a comma");
        
        System.out.print(nrs.summarizeCollection(nrs.collect(input)));
    }
}
