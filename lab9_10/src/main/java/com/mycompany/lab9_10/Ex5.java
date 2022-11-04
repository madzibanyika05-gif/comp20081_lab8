/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab9_10;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

/**
 *
 * @author ntu-user
 */
public class Ex5 {

    public static void main(String[] args) throws IOException {

        try ( com.opencsv.CSVReader reader = new CSVReader(new FileReader("emps.csv"), ',')) {
            List<Employee1> emps = new ArrayList<>();

            //TODO add you code here 
            
            // Read CSV file

            // Add the CSV content to an object of type Employee1
            
            // Print the content of emps

        }
    }
}
